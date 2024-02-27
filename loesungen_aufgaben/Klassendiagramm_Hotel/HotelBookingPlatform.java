package Klassendiagramm_Hotel;

import java.net.Inet4Address;
import java.util.ArrayList;

public class HotelBookingPlatform {
    private String name;
    private ArrayList<Hotel> hotel;
    public HotelBookingPlatform(String name){
        this.name = name;
        this.hotel = new ArrayList<>();
    }
    public void rateHotel(int bewertung, Hotel hotel){
        hotel.addRating(bewertung);
    }
    public BudgetHotel getBestRatedBudgetHotel() {
        BudgetHotel bHotel = null;
        int bestRating = 0;
        for (Hotel h : hotel) {
            if (h instanceof BudgetHotel) {
                BudgetHotel budgetH = (BudgetHotel) h;
                for (Integer r : budgetH.getRating()) {
                    if (bestRating < r) {
                        bestRating = r;
                        bHotel = budgetH;
                    }
                }
            }
        }
        return bHotel;
    }
    public void addHotelToPlatform(Hotel hotel){
        this.hotel.add(hotel);
    }
    public void print(){
        System.out.println(this.name + " \n Unser Angebot");
        for(Hotel h: hotel){
            System.out.println(hotel.toString());
        }
    }

}
