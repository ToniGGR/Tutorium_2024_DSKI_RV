package Rennschnecke;

import java.util.ArrayList;

public class Rennen {
    private String name;
    private int anzahlSchnecken;

    ArrayList<Rennschnecke> teilnehmer = new ArrayList<>();

    public Rennen(String name){
        this.name = name;
        this.anzahlSchnecken = teilnehmer.size();
    }

    public void addRennschnecke(Rennschnecke neueRennschnecke){
        teilnehmer.add(neueRennschnecke);
        this.anzahlSchnecken = teilnehmer.size();
    }

    public void removeRennschnecke(String name){
        teilnehmer.remove(name);
    }

    public String toString(){
        return "Name: " + name + " Anzahl teilnehmende Schnecken: " + anzahlSchnecken;
    }

    public Rennschnecke ermittleGewinner(){
        for (Rennschnecke r: teilnehmer){
            if(r.getStrecke() >= 200) {
                System.out.println("Gewinner!!: "+ r.toString());
                return r;
            }
        }
        return null;
    }

    public void lasseSchneckenKriechen(){
        for (Rennschnecke r : teilnehmer){
            r.krieche();
        }
    }

    public void durchfuehren(){
        while (ermittleGewinner() == null){
            lasseSchneckenKriechen();
        }
    }

}
