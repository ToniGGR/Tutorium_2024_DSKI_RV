package Vererbung;

public class Verkehrsflugzeug extends Flugzeug {


    public Verkehrsflugzeug (String hersteller , int maxSpeed , String immattNummer){
        super (hersteller , maxSpeed , 1 , immattNummer);

    }

    public final boolean getLooping(){
        return false;
    }
    
    public void setHersteller (String hersteller){
        this.setHersteller(hersteller);
    }
}
