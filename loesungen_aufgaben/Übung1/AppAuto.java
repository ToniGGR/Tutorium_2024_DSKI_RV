package Übung1;

public class AppAuto {
    public static void main(String[] args) {
        // Erzeuge zwei Autos
        Auto auto1 = new Auto("ABC123", 0.0, 60.0, 8.0);
        Auto auto2 = new Auto();

        // Tanken und Fahren
        auto1.tanken(30.0);
        auto1.fahren(200.0);

        auto2.tanken(40.0);
        auto2.fahren(100.0);

        // Abfrage der aktuellen Werte
        System.out.println("Auto 1 - Kennzeichen: " + auto1.getKennzeichen() +
                ", Kilometerstand: " + auto1.getKilometerstand() +
                ", Tankvolumen: " + auto1.getTankvolumen());

        System.out.println("Auto 2 - Kennzeichen: " + auto2.getKennzeichen() +
                ", Kilometerstand: " + auto2.getKilometerstand() +
                ", Tankvolumen: " + auto2.getTankvolumen());
    }
}
