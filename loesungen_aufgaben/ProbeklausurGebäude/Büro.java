package ProbeklausurGebäude;

public final class Büro extends Raum{
    private String person;

    public Büro(int raumnummer, long kosten, String name, int breite, int länge, int höhe, String person) {
        super(raumnummer, kosten, name, false, breite, länge, höhe);
        this.person = person;
    }

    public void print_information() {
        System.out.print(this.name + " " + this.raumnummer + " Büro von: " + this.person + " Volumen: " + this.getVolumen());
    }

    public boolean getIsBuchbar() {
        return false;
    }

}
