package Klassendiagramm_AmusementPark;

public class AmusementPark {
    public static void main(String[] args) {
        Person p1 = new Person("Max", 176,20);
        AmusementParkRide ride1 = new AmusementParkRide("Achterbahn", 150, FunLevel.PROFESSIONAL);
        ride1.isAllowedOn(p1);
        System.out.println(ride1.toString());
    }
}
