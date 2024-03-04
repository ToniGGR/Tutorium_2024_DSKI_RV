package Probeklausur;

public class Buero extends Raum {
    private String person;

    public Buero (int Raumnummer , long kosten , String name , int laenge , int breite , int hoehe , String person){
        super (Raumnummer ,kosten, name , laenge , breite , hoehe);
        this.person = person;
    }

    @Override
    public void print_information() {
        System.out.println("Buero von " + this.person + "  Raumnummer:" +  this.Raumnummer);
    }

    @Override
    public boolean getIsBuchbar() {
        return false;
    }

    
}
