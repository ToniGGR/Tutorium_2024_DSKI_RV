import java.util.Random;
import java.util.Scanner;

public class Einfache_Methoden {
    public static void main(String[] args) {
        System.out.println(calculate_age(2004));
        System.out.println(get_volume_squared_pyramid(1, 2));
        say_hello_to("Mein Name");
        System.out.println(celsius_to_fahrenheit(17));

        aufgabe_sieben();
    }

    public static int calculate_age (int birth_year){
        int currentYear = 2024 ;
        int age = currentYear - birth_year;
        return age ;
    }

    public static  double get_volume_squared_pyramid (double length , double height){
        double length_squared = length * length;
        double volume = (1.0/3.0) * length_squared * height;
        return volume;
    }

    public static void say_hello_to (String name){
        System.out.println("Hello " +  name);
    }

    public static double celsius_to_fahrenheit (double tempInCels) {
        return (tempInCels * 1.8) + 32;
    }

    public static void aufgabe_sechs (){
        int hoehe , breite;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geb die Hoehe ein:");
        hoehe = sc.nextInt();
        System.out.println("Geb die Breite ein:");
        breite = sc.nextInt();

        for (int i = 0; i < hoehe ; i++){
            for (int j = 0 ;  j < breite ; j ++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void aufgabe_fuenf (){
        String input ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gieb das Wort ein:");
        input = sc.nextLine();

        for (int i = 0 ; i < input.length() / 2 ; i ++){
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)){
                continue;
            }
            else {
                System.out.println("kein Palindrom");
                break;
            }
        }
    }

    public static void aufgabe_sieben (){
        int number1 , number2, number3 ;
        Random rd = new Random();
        do {
            number1 = rd.nextInt(10) + 1;
            number2 = rd.nextInt(10) + 1;
            number3 = rd.nextInt(10) + 1;
        } while (number1 == number2 || number3 == number1 || number2 == number3);

        System.out.println(" Die Nummern sind:" + Integer.toString(number1) + Integer.toString(number2) + Integer.toString(number3)  );
    }


}
