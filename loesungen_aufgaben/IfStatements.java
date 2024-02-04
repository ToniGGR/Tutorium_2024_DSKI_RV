import java.util.Scanner;

public class IfStatements {
    /*
     * 
     * 1:
     * Schreibe eine Methode die Uerberprueft, ob eine Zahl zwischen 10 & 16 liegt.
     * Das Format der Methdode: between10And16(number:int){}
     * Wenn die Number zwischen 10 und 16 ist soll eine Konsolenausgabe mit dem Text: "Die nummer ist zwischen 10 und 15" ausgegeben werden
     * Falls nicht, soll die ebenfalls ein Text ueber die Konsole ausgegeben werden.
     * 
     * 2:
     * Ergaenze die oben erstellte Methode durch eine weitere Info. Wenn die Zahle ueber 15 ist soll eine Meldung augegeben werden.
     * Wenn die Zahl kleiner als 10 ist dann soll ebenfalls der Nutzer darueber ueber die Konsole informiert werden
     * 
     * 3:
     * Erstelle ein String Array mit fester Laenge und fuelle dieses Array mit Strings deiner Wahl. 
     * Die Inputparameter sind einerseits das Array und andererseits die ueberpruefte Laenger der String
     * Schreibe eine Methode, die die Anzahl an Strings des Arrays zurueckgibt, die ueber einer Laenge bestimmten sind. 
     * 
     * 
     * 
     */

     public static void main(String[] args) {
        between10And16(8);
        between10And16_2(10);
        String [] names = {"Anton" , "Lisa" , "Benjamin" , "Jeremy" , "Greta" , "Magarethe"};
        System.out.println(howOftenInArray(names, -1));

        aufgabe_fuenf();
     }

     public static void between10And16 (int number){
        if (number >= 10 && number < 16){
            System.out.println("Die Nummer liegt zwischen 16 und 10");
        }
        else {
            System.out.println("Die Nummer liegt nicht zwischen 16 und10");
        }
    }

    /*public static void between1And5 (int number){
        System.out.println( (number < 5)  ,"Jo" , "nein");
    }
    */

    public static void between10And16_2 (int number){
        if (number >= 10 && number < 16){
            System.out.println("Die Nummer liegt zwischen 16 und 10");
        }
        else if (number > 15) {
            System.out.println("Die Nummer ist groesser als 15");
        }
        else {
            System.out.println(" Die Nummer ist kleiner als 10");
        }
    }

    public static int howOftenInArray (String [] StrArray , int max_length){
        int counter = 0;
        if (max_length < 0){
            System.out.println("Bitte Argumente Ueber 0 eingeben");
            return 0;
        }
        for (String str : StrArray){
            if (str.length() > max_length ){
                counter ++;
            }
        }
        return counter;
    }

    public static void aufgabe_fuenf (){
        String password = "meinPassw8rd" ;
        String input ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie ein Password ein:");
        input = sc.nextLine();
        if (input.equals(password)){
            System.out.println("Das Passwort stimmt");
        }
        else {
            System.out.println("Das PW stimmt nicht");
        }
        
    }
}
