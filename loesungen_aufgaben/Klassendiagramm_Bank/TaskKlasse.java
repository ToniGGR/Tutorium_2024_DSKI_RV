package Klassendiagramm_Bank;

public class TaskKlasse {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Anton", "Geiger", "DE1249324ui989");
        konto1.einbezahlen(6000);
        konto1.auszahlen(788);
        konto1.limitAnpassen(100);
        konto1.auszahlen(500);
        System.out.println(konto1.toString());
    }
}
