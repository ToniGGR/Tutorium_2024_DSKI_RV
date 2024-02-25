package Vererbung;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <Flugzeug> flugzeuge = new ArrayList<>();

        Doppeldecker d1 = new Doppeldecker("Doppeldeckerersteller1", 250, "1");
        Doppeldecker d2 = new Doppeldecker("Doppeldeckerersteller2", 350, "2" , false);
        Doppeldecker d3 = new Doppeldecker("Doppeldeckerersteller1", 450, "3");

        Verkehrsflugzeug v1 = new Verkehrsflugzeug("AIRBUS", 370, "4");
        Verkehrsflugzeug v2 = new Verkehrsflugzeug("BOEING", 480, "5");

        A320 a1 = new A320(500,"6");
        A320 b1 = new A320(420, "7");

        //Verkehrsflugzeug b1temp = (Verkehrsflugzeug) b1;
        //b1.setHersteller("BOEING");

        flugzeuge.addAll(List.of(d1,d2,d3,v1,v2,a1,b1));

        for (String s : AlleMatriklenummerLoopingFlugzeugeUnDOffenenCockpit(flugzeuge)){
            System.out.println(s);
        }
    }


    public static void printAllVerkehrsflugzeuge (ArrayList <Flugzeug> flugzeuge){
        ArrayList <Verkehrsflugzeug> verkehrsflugzeuge = new ArrayList<>();

        for (Flugzeug flugzeug : flugzeuge){
            if (flugzeug instanceof Verkehrsflugzeug){
                Verkehrsflugzeug verkehrsflugzeug = (Verkehrsflugzeug) flugzeug;
                verkehrsflugzeuge.add(verkehrsflugzeug);
                System.out.println(verkehrsflugzeug.getImmatNummer());
            }
        }


    }


    public static void getAnzahlByFlugzeugklasse (ArrayList <Flugzeug> flugzeuge) {
        int anzahlVerkehrsflugzeug = 0, anzahlA320 = 0 , anzahlDoppeldecker =0 ;
        for (Flugzeug f : flugzeuge){
            if (f instanceof A320){
                anzahlA320 +=1;
            }
            else if (f instanceof Verkehrsflugzeug){
                anzahlVerkehrsflugzeug += 1;
            }

            else if (f instanceof Doppeldecker){
                anzahlDoppeldecker += 1;
            }

            else {
                continue;
            }
        }

        System.out.println("Anzahl Verkehsflugzeuge : " + anzahlVerkehrsflugzeug +
            " Anzahl A320 " + anzahlA320 + " Anzahl Doppeldecker:  " + anzahlDoppeldecker);
    }

    public static ArrayList <String> AlleMatriklenummerLoopingFlugzeugeUnDOffenenCockpit (ArrayList <Flugzeug> flugzeuge){
        ArrayList <String> LoopingflugzeugeOffeneCockpits = new ArrayList<>();


        for (Flugzeug f : flugzeuge){
            if (f instanceof Doppeldecker){
                Doppeldecker dtemp = (Doppeldecker) f;
                if ( dtemp.getLooping() && dtemp.getOffenesCockpit()){
                    LoopingflugzeugeOffeneCockpits.add(dtemp.getImmatNummer());
                }
                
            }
        }
        return LoopingflugzeugeOffeneCockpits;
    }


}
