package Probeklausur;

public abstract class Raum implements RaumInterface , Comparable<Raum> {

    protected int Raumnummer;
    private long kosten;
    protected String name;
    protected boolean isbuchbar;
    private int breite , laenge , hoehe;


    public Raum (int Raumnummer , long kosten , String name , int laenge , int breite , int hoehe){
        this.Raumnummer = Raumnummer;
        this.kosten = kosten;
        this.name = name;
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public final int getVolumen (){
        return laenge * breite * hoehe;
    }
    public abstract void print_information();

    public abstract boolean getIsBuchbar ();

    public void erhoeheKosten (double betrag){
        this.kosten += (long) betrag;
    }
    public long getKosten(){
        return this.kosten;
    }
    public int compareTo(Raum r){
        if (this.kosten > r.kosten){
            return -1;
        }
        else if (this.kosten < r.kosten){
            return 1;
        }
        else {
            return 0;
        }
    }


}
