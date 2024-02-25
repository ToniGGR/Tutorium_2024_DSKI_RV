package Vererbung;

public abstract class Flugzeug {
    private String hersteller ;
    private int maxSpeed ;
    private String immatNummer;
    private int anzahlFluegel = 1;

    public Flugzeug (String hersteller , int maxSpeed , int anzahlFluegel, String immatNummer){
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.anzahlFluegel = anzahlFluegel;
        this.immatNummer = immatNummer;
    }

    public String getImmatNummer (){
        return this.immatNummer;
    }

    protected void setImmatNummer (String immatNummer ){
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed (){
        return this.maxSpeed;
    }

    public abstract boolean getLooping ();

    protected void setHersteller (String hersteller ){
        this.hersteller = hersteller;
    }
}
