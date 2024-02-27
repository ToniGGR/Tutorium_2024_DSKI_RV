package Klassendiagramm_Hotel;

public class MainHotel {
    public static void main(String[] args) {
        BudgetHotel bgH = new BudgetHotel("abc", AccomodationCategory.SPA, 50, "Thailand");
        HotelBookingPlatform expedia = new HotelBookingPlatform("expedia");
        expedia.addHotelToPlatform(bgH);
        expedia.rateHotel(5, bgH);
        System.out.println(expedia.getBestRatedBudgetHotel().getName());
    }
}
