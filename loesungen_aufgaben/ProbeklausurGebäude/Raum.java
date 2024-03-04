package ProbeklausurGebäude;

public abstract class Raum implements RaumInterface, Comparable<Raum> {
    protected int raumnummer;
    private long kosten;
    protected String name;
    protected boolean isbuchbar;
    private int breite;
    private int länge;
    private int höhe;
    public Raum(int raumnummer, long kosten, String name, boolean isbuchbar, int breite, int länge, int höhe){
        this.raumnummer = raumnummer;
        this.kosten = kosten;
        this.name = name;
        this.isbuchbar = isbuchbar;
        this.breite = breite;
        this.länge = länge;
        this.höhe = höhe;
    }
    public final int getVolumen(){
        return höhe * breite * länge;
    }
    public abstract void print_information();
    public abstract boolean getIsBuchbar();
    public void erhöheKosten(double betrag){
        this.kosten = this.kosten + (long) betrag;
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
