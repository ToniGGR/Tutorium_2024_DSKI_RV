package Probeklausur;

import java.util.ArrayList;
import java.util.Collections;

public class Gebaeude  {

    private ArrayList<Raum> raeume = new ArrayList<>();
    
    private String name ;
    private long kostenAllerRaeume;

    public Gebaeude (String name){
        this.name = name;
        this.kostenAllerRaeume = 0;
    }
    
    public ArrayList <Raum> getraeume() {
        return this.raeume;
    }
    
    public void addRaum (Raum raum){
        this.kostenAllerRaeume += raum.getKosten();
        this.raeume.add(raum);
    }

    public ArrayList <Buero> getBueros (){
        ArrayList <Buero> bueros = new ArrayList<>();


        for (Raum r : raeume){
            if (r  instanceof Buero){
                Buero b_temp = (Buero) r;
                bueros.add(b_temp);
            }
        }
        return bueros;
    }

    public Raum getRandomRaum (){
        return this.raeume.get((int) (Math.random()*(this.raeume.size()) ));
    }

    public ArrayList <Raum> sortiereAbsteigendNachKosten(){
        ArrayList <Raum> tempraeume = this.raeume;
        Collections.sort(tempraeume);
        return tempraeume;
    }

    public Raum getTeuersterRaum (){
        try {
            return this.sortiereAbsteigendNachKosten().get(0);
        }
        catch (Exception e){
            System.out.println("Keine Raeume hinzugefuegt");
            return null;
        }
        
    }

}
