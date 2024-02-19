package Rennschnecke;

import java.util.Random;

public class Rennschnecke {
    private String name;
    private String rasse;
    private int maxGeschwindigkeit;
    private int strecke;

    public Rennschnecke(String name, String rasse, int maxGeschwindigkeit, int strecke){
        this.name = name;
        this.rasse = rasse;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.strecke = strecke;
    }

    public void krieche(){
        Random random = new Random();
        int randomStrecke = random.nextInt(this.maxGeschwindigkeit);
        this.strecke=  randomStrecke + this.strecke;
    }

    public String toString(){
        return "Name: " + name + " Rasse: " + rasse + " Max Geschwindigkeit: "+ maxGeschwindigkeit + " Strecke: " + strecke;
    }

    public int getStrecke(){
        return this.strecke;
    }

    public String getName(){
        return this.name;
    }


}
