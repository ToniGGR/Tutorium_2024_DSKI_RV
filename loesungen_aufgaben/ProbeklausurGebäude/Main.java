package ProbeklausurGebäude;



public class Main {
    public static void main(String[] args) {
        Vorlesungsraum v1 = new Vorlesungsraum(1, 10000, "Erster Raum", 10, 10, 30, 10, Fachgebiet.ALLGEMEIN);
        Vorlesungsraum v2 = new Vorlesungsraum(2, 20000, "Zweiter Raum",  20, 50, 10, 30,  Fachgebiet.MATHE);
        Büro b1 = new Büro(0234, 23, "abc", 3,  23, 3, "Mustermann");
        Vorlesungsraum v3 = new Vorlesungsraum(2, 3000, "Dritter Raum",  3290, 23, 50, 30, Fachgebiet.ALLGEMEIN);
        Vorlesungsraum v4 = new Vorlesungsraum(13,  234234,  "vierter RAum", 234, 234, 1234, 14, Fachgebiet.ALLGEMEIN);
        v1.print_information();

        Gebäude g1 = new Gebäude("Mein gebaude");
        g1.getTeuersterRaum(); //Exception ausprobieren
        g1.addRaum(v3);
        g1.addRaum(v2);
        g1.addRaum(b1);
        g1.addRaum(v1);

        for (Raum r : g1.sortiereRäumeAbstKosten()){
            System.out.println(r.name);
        }
        System.out.println(g1.getRandomRaum().name);
        for (Büro b : g1.getBuero()){
            b.print_information();
        }
        System.out.println();
        System.out.println(g1.getTeuersterRaum().name);

    }
}
