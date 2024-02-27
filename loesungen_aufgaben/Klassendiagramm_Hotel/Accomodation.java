package Klassendiagramm_Hotel;

public class Accomodation {
    private String name;
    private AccomodationCategory category;
    private int numOfRooms;
    public Accomodation(String name, AccomodationCategory category, int numOfRooms){
        this.name = name;
        this.category = category;
        this.numOfRooms = numOfRooms;
    }
    public String getName(){
        return this.name;
    }
    public AccomodationCategory getCategory(){
        return this.category;
    }
    public int getNumOfRooms(){
        return this.numOfRooms;
    }
}
