package ProbeklausurGebäude;

import java.util.ArrayList;
import java.util.Collections;

public class Gebäude {
    private String name;
    private long kostenAllerRäume;
    private ArrayList<Raum> räume;
    public Gebäude(String name){
        this.name = name;
        this.kostenAllerRäume = 0;
        this.räume = new ArrayList<>();
    }

    public ArrayList<Raum> getRäume() {
        return this.räume;
    }
    public void addRaum(Raum r){
        this.räume.add(r);
    }
    public ArrayList<Büro> getBuero(){
        ArrayList<Büro> büros = new ArrayList<>();
        for(Raum r: räume){
            if(r instanceof Büro){
                Büro b = (Büro) r;
                büros.add(b);
            }
        }
        return büros;
    }
    public Raum getRandomRaum(){
        try {
            int random = (int) (Math.random() * (this.räume.size()));
            Raum r = this.räume.get(random);
            return r;
        }catch(Exception e){
            System.out.println("Keine Räume gefunden");
            return null;
        }
    }
    public ArrayList<Raum> sortiereRäumeAbstKosten() {
        ArrayList<Raum> r = this.räume;
        Collections.sort(r);
        return r;
    }
    public Raum getTeuersterRaum(){
        try {
            return this.sortiereRäumeAbstKosten().get(0);
        }  catch (Exception e) {
            System.out.println("Keine Räume gefunden");
            return null;
        }
    }
    public void print_gebäude(){
        int i = this.räume.size();
        while(i != 0){
            System.out.println();
        }
    }

}
