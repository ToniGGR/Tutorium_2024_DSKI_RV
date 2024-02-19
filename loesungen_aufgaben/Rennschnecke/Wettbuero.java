package Rennschnecke;

import java.util.ArrayList;

public class Wettbuero {
    ArrayList<Wette> wetten = new ArrayList<>();
    public static int faktor = 1;
    public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler){
        Wette neueWette = new Wette(schneckenName, wettEinsatz, spieler);
        wetten.add(neueWette);
    }

    public void rennenDurchfuehren(Rennen r){
        r.durchfuehren();
        for(Wette w: wetten){
            if(w.getName() == r.ermittleGewinner().getName()){
                w.setGewinn(w.getEinsatz()*faktor);
                System.out.println("Gewinner: " + w.spieler + " Gewinn: " + w.getGewinn());
            }
        }
    }

    public String toString(){
        return wetten.toString();
    }

}
