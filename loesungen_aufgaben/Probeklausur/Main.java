package Probeklausur;

public class Main {
    public static void main(String[] args) {
        Vorlesungsraum v1 = new Vorlesungsraum(1, 10000, "Erster Raum", 0, 0, 0, 10, Fachgebiet.GENERELL);
        Vorlesungsraum v2 = new Vorlesungsraum(2, 20000, "Zweiter Raum", 0, 0, 0, 50, Fachgebiet.GENERELL);
        Buero b1 = new Buero(0, 0, null, 0, 0, 0, "Mustermann");
        Vorlesungsraum v3 = new Vorlesungsraum(2, 3000, "Dritter Raum", 0, 0, 0, 50, Fachgebiet.GENERELL);

        v1.print_information();

        Gebaeude g1 = new Gebaeude("Mein gebaude");
        g1.getTeuersterRaum();
        g1.addRaum(v3);
        g1.addRaum(v2);
        g1.addRaum(b1);
        g1.addRaum(v1);

        for (Raum r : g1.sortiereAbsteigendNachKosten()){
            System.out.println(r.name);
        } 
        System.out.println(g1.getRandomRaum().name);
        System.out.println(g1.getBueros());

        System.out.println(g1.getTeuersterRaum().name);
        
    }
}
