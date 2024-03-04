package Probeklausur;

public class Labor extends Vorlesungsraum{
    

    public Labor ( int Raumnummer , long kosten , String name , int laenge , int breite , int hoehe , int anzahlPersonen ){
        super (Raumnummer ,kosten, name , laenge , breite , hoehe , anzahlPersonen , Fachgebiet.CHEMIE);
}

}
