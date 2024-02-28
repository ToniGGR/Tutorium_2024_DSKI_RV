package Aktivitaetsdiagramm.Bankkonto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Main {
    public static ArrayList<String> warenkorb = new ArrayList<>();
    public static void main(String[] args) {

        Konto konto1 = new Konto("1", "konto1@web.de", "1234");
        Konto konto2 = new Konto("2", "konto2@web.de", "12345678");


        
        WareIndenWarenkorb("Tisch");
        WareIndenWarenkorb("Ball");
        if (abfragezumKauf()){
            if (check_konto(getEmail(), getPW())) {
                System.out.println("Erfolgreich gekauft");
            }
        }else System.out.println("Kauf abgebrochen");
        
    }

    public static void WareIndenWarenkorb (String ware){
        Main.warenkorb.add(ware);
    }

    public static boolean abfragezumKauf (){
        String answer = "y";
        
        while ( ! answer.toLowerCase().equals("y") || !answer.toLowerCase().equals("n") ){
        System.out.println("Warenkorb");
        //warenkorb.forEach(w -> System.out.println(w));
        for (String product : warenkorb) {
            System.out.println(product);
        }
        System.out.print("Moechten Sie die Artikelaus dem Warenkorb kaufen?[y/n]");
        Scanner sc = new Scanner(System.in);
        answer = sc.next();
        System.out.println();
        if (answer.toLowerCase().equals("y")){
            return true;
        }
        else if (answer.toLowerCase().equals("n")){
            return false;
        }
    }
    return false;

    }
    public static String getEmail (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mail:");
        String email = sc.next();
        System.out.println();
        return email;
    }

    public static String getPW (){
        Scanner sc = new Scanner(System.in);
        System.out.print("PW:");
        String PW = sc.next();
        System.out.println();
        return PW;
    }

    public static boolean check_konto (String email , String pw){
        for (Konto k : Konto.kontos){
            if (k.email.equals(email) && k.kennwort.equals(pw)){
                return true;
            }
        }
        return false;
    }
}
