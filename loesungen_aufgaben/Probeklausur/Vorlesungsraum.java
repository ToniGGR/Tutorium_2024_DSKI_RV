package Probeklausur;

public class Vorlesungsraum extends Raum{

    private int anzahlPersonen;
    private Fachgebiet fachgebiet;
    private int anzahlFenster;

    public Vorlesungsraum ( int Raumnummer , long kosten , String name , int laenge , int breite , int hoehe , int anzahlPersonen , Fachgebiet fachgebiet){
        super (Raumnummer ,kosten, name , laenge , breite , hoehe);
        this.fachgebiet = fachgebiet;
        this.anzahlPersonen = anzahlPersonen;
        this.anzahlFenster = (int) (Math.random() * 4.999 ) + 1;
    }

    public boolean getIsBuchbar(){
        return this.isbuchbar;
    }

    public boolean buchen (int personenzahl){
        if (this.isbuchbar && personenzahl < this.anzahlPersonen){
            return true;
        }
        else {
            return false;
        }
    }

    public int calculateanzahlReihen (){
        return (int) (Math.sqrt((double)anzahlPersonen)) ;
    }


    public void printplan (){
        int counter = 0 , counterSitzplaetze = 0;
        System.out.println(this.calculateanzahlReihen());
        do {
            
            counter ++;
            int countersitze = 0;
            while (anzahlPersonen / this.calculateanzahlReihen() >  countersitze){
                if (counterSitzplaetze == anzahlPersonen){
                    return ;
                }
                System.out.print("   #   ");
                countersitze++;
                counterSitzplaetze++;
                
            }   
            System.out.println();
        } while (counter <= this.calculateanzahlReihen());
    }

    public void print_information(){
        System.out.println(this.name + " " + this.Raumnummer + " Fachgebiet:" + this.fachgebiet.getDescription() );
        System.out.println("Raum Plan: \n");
        printplan();
        System.out.println("Anzahl Fenster: " + this.anzahlFenster);
    }
    
}
