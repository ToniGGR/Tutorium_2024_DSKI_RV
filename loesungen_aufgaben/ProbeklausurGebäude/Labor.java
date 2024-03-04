package ProbeklausurGebäude;

public class Labor  extends Vorlesungsraum{
    public Labor(int raumnummer, long kosten, String name, int breite, int länge, int höhe, int anzahlPersonen) {
        super(raumnummer, kosten, name, breite, länge, höhe, anzahlPersonen, Fachgebiet.CHEMIE);
    }
}
