package ProbeklausurGebäude;

public class Vorlesungsraum extends Raum{
    private int anzahlPersonen;
    private Fachgebiet fachgebiet;
    private int anzahlFenster;
    public Vorlesungsraum(int raumnummer, long kosten, String name, int breite, int länge, int höhe, int anzahlPersonen, Fachgebiet fachgebiet) {
        super(raumnummer, kosten, name, true, breite, länge, höhe);
        this.anzahlFenster = (int) (Math.random()*6);
        this.anzahlPersonen = anzahlPersonen;
        this.fachgebiet = fachgebiet;

    }

    public boolean getIsBuchbar() {
        return true;
    }
    public boolean buchen(int personenzahl){
        if (this.isbuchbar && personenzahl < this.anzahlPersonen){
            return true;
        }
        else {
            return false;
        }
    }
    public int rechneAnzahlReihen(){
        int r = (int) Math.sqrt((double) this.anzahlPersonen);
        return r;
    }
    public void printPlan(){
        int cReihe = 0;
        int cGesSitz = 0;
        System.out.println("Anzahl Reihen: " + this.rechneAnzahlReihen());
        while(cReihe <= this.rechneAnzahlReihen()){
            int cSitz = 0;
           while(cSitz < this.anzahlPersonen / rechneAnzahlReihen()){
               if(this.anzahlPersonen == cGesSitz){
                   return;
               }
               System.out.print(" # ");
               cSitz++;
               cGesSitz++;
           }
            cReihe++;
           System.out.println();
        }
    }
    public void print_information() {
        System.out.print(this.name + " " + this.raumnummer + " Fachgebiet: " + this.fachgebiet.getDescription() );
        System.out.println("\n Raum Plan: \n");
        printPlan();
        System.out.println("Anzahl Fenster: " + this.anzahlFenster);
    }

}
