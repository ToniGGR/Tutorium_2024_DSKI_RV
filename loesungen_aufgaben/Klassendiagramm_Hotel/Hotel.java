package Klassendiagramm_Hotel;

import java.util.ArrayList;

public class Hotel extends Accomodation{

    private ArrayList<Integer> rating;
    private String location;
    public Hotel(String name, AccomodationCategory category, int numOfRooms, String location) {
        super(name, category, numOfRooms);
        this.location = location;
        this.rating = new ArrayList<>();
    }
    public String getLocation(){
        return this.location;
    }
    public void addRating(int nRating){
        this.rating.add(nRating);
    }
    public double getAverageRating(){
        int sumRating = 0;
        for(int r: rating){
            sumRating += r;
        }
        return sumRating/rating.size();
    }
    public ArrayList<Integer> getRating(){
        return this.rating;
    }
}
