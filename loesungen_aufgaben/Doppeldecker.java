package Vererbung;

public class Doppeldecker extends Flugzeug {

    private final boolean offenesCockpit ;
    public Doppeldecker (String hersteller , int maxSpeed , String immatnummer ){
        super(hersteller, maxSpeed, 2 , immatnummer);
        this.offenesCockpit = true;
    }

    public Doppeldecker (String hersteller , int maxSpeed , String immatnummer , boolean offenesCockpit ){
        super(hersteller, maxSpeed, 2 , immatnummer);
        this.offenesCockpit = offenesCockpit;
    }

    public boolean getLooping (){
        if (this.getMaxSpeed() > 320){
            return true;
        }
        else {
           return false;
        }
    }

    public boolean getOffenesCockpit (){
        return this.offenesCockpit;
    }

}
