package Rennschnecke;

public class Wette {
    String name;
    int Einsatz;
    String spieler;

    int gewinn;

    public Wette(String name, int Einsatz, String spieler){
        this.name = name;
        this.Einsatz = Einsatz;
        this.spieler = spieler;
        this.gewinn = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getEinsatz(){
        return this.Einsatz;
    }

    public String getSpieler(){
        return this.spieler;
    }

    public void setGewinn(int gewinn){
        this.gewinn = gewinn;
    }

    public int getGewinn(){
        return this.gewinn;
    }
}
