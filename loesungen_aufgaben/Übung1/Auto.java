package Übung1;

public class Auto {
    // Attribute
    private String kennzeichen;
    private double kilometerstand;
    private double tankvolumen;
    private double kraftstoffverbrauch;
    private double kraftstoffmenge;

    public Auto() {
        this.kennzeichen = "Unbekannt";
        this.kilometerstand = 0.0;
        this.tankvolumen = 50.0; // Beispielwert, kann angepasst werden
        this.kraftstoffverbrauch = 10.0; // Beispielwert, kann angepasst werden
        this.kraftstoffmenge = 0.0;
    }

    public Auto(String kennzeichen, double kilometerstand, double tankvolumen, double kraftstoffverbrauch) {
        this.kennzeichen = kennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
        this.kraftstoffmenge = 0.0; // Start mit leerem Tank
    }

    public void tanken(double menge) {
        if (this.kraftstoffmenge + menge <= this.tankvolumen) {
            this.kraftstoffmenge += menge;
            System.out.println("Tanken erfolgreich. Aktueller Kraftstoffstand: " + this.kraftstoffmenge + " Liter");
        } else {
            System.out.println("Tanken nicht möglich. Tankvolumen wird überschritten.");
        }
    }

    public void fahren(double strecke) {
        double verbrauch = strecke / this.kraftstoffverbrauch;
        if (verbrauch <= this.kraftstoffmenge) {
            this.kilometerstand += strecke;
            this.kraftstoffmenge -= verbrauch;
            System.out.println("Fahren erfolgreich. Aktueller Kilometerstand: " + this.kilometerstand + " km");
        } else {
            System.out.println("Fahren nicht möglich. Nicht genug Kraftstoff.");
        }
    }

    public String getKennzeichen() {
        return this.kennzeichen;
    }

    public double getKilometerstand() {
        return this.kilometerstand;
    }

    public double getTankvolumen() {
        return this.tankvolumen;
    }
}
