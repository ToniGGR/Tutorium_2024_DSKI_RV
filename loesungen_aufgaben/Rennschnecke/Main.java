package Rennschnecke;

public class Main {
    public static void main(String[] args){
        Rennschnecke schnecke1 = new Rennschnecke("Turbo", "schnelle Schnecke", 20,0 );
        Rennschnecke schnecke2 = new Rennschnecke("Turbooooo", "schöne Schnecke", 20,0 );
        System.out.println(schnecke1.toString());
        schnecke1.krieche();
        System.out.println(schnecke1.toString());
        Rennen rennen1 = new Rennen("big Rennen");
        System.out.println(rennen1.toString());
        rennen1.addRennschnecke(schnecke1);
        rennen1.addRennschnecke(schnecke2);
        System.out.println(rennen1.toString());

        rennen1.durchfuehren();
        System.out.println(rennen1.toString());

        Wettbuero wettbuero1 = new Wettbuero();
        wettbuero1.wetteAnnehmen("Turbo", 300, "Lisa");
        wettbuero1.rennenDurchfuehren(rennen1);
        


    }
}
