package Klassendiagramm_Bank;

public class Bankkonto {

    private String inhaberVorname;
    private String inhaberName;
    private String kontonummer;
    private double kontostand;
    private double limit;

    public Bankkonto(String inhaberVorname, String inhaberName, String kontonummer, double limit){
        this.inhaberName = inhaberName;
        this.inhaberVorname = inhaberVorname;
        this.kontonummer = kontonummer;
        this.limit = limit;
        this.kontostand = 0;
    }
    public Bankkonto(String inhaberVorname, String inhaberName, String kontonummer){
        this.inhaberName = inhaberName;
        this.inhaberVorname = inhaberVorname;
        this.kontonummer = kontonummer;
        this.limit = 500;
        this.kontostand = 0;
    }

    public void einbezahlen(double betrag){
        this.kontostand = kontostand;
    }
    public void auszahlen(double betrag){
        if (betrag < limit){
            this.kontostand -= betrag;
        }
        else System.out.println("Limit überschritten, passe Limit an um Auszahlung vorzunehmen");
    }

    public void limitAnpassen(double neuesLimit){
        this.limit = neuesLimit;
    }
    public String toString(){
        return  this.inhaberName + " inhaberName "+
                this.inhaberVorname + " inhaberVorname "+
                this.kontonummer + " kontonummer "+
                this.limit + " limit " +
                this.kontostand + " kontostand ";
    }
}
