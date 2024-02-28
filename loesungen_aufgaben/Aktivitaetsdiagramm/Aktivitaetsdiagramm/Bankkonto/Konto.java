package Aktivitaetsdiagramm.Bankkonto;

import java.util.ArrayList;

public class Konto {
    public String id;
    public String email;
    public String kennwort;


    public static ArrayList <Konto> kontos = new ArrayList<>();

    public Konto (String id , String email , String kennwort){
        this.id = id;
        this.email = email;
        this.kennwort = kennwort;
        Konto.kontos.add(this);
    }
}
