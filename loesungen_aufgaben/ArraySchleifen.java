import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class ArraySchleifen {

    public static void main(String[] args) {
        /*
         * 1:
         * Erstellen Sie ein Array, befuellen Sie es mit Zahlen und geben Sie es auf der Konsole aus
         * 
         * 
         * 2:
         * Iterieren Sie ueber das Array, subtrahieren Sie jede Zahl mit 5 und speichern Sie die neue Zahl wieder in das Array rein. 
         * Geben Sie dann das Array wieder mithilfe einer while Schleife auf der Konsole aus.
         * 
         * 3: 
         * Schreiben Sie eine Methode, was eine Zahl als Parameter bekommt. Die Methode soll ein Array mit der Laenge der eingegebenen Zahl erstellen.
         * Das Array soll mit einer aufsteigenden Zahlenfolge bei 1 begonnen werden
         * 
         * Inputparameter 5 --> [1,2,3,4,5]
         * 
         * 4: Erstellen Sie eine Methode was fuer ein int Array unbestimmter Laenge den Durchschnitt der Werte ausrechnet.
         * 
         * 
         * 5: Schreiben Sie eine Methode mit 2 Input parametern, welche einem eingegebenen Array Felder hinzufuegt.
         * Die Input Parameter sind ein String - Array und eine Zahl. Wenn die Zahl groesser als die bisherige Array Laenge ist, dann erstellt die Methode
         * ein neues Array der Laenge des neuen Array. In dem Array sind an den ersten Positionen die Werte des alten Arrays gespeichert. Die neuen, leeren Felder
         * sind mit leeren Strings "" gefuellt.
         * Ansonsten gebe einen Fehler auf der Konsole aus
         * 
         * Inputparameter : ["String1" , "String2"] , 4 --> ["String1" , "String2" , "" , ""] 
         * Inputparameter : ["String1" , "String2"] , 1 --> "Fehler: Die neue Laenge ist kleiner als die Alte"
         * 
         * Ergaenzen Sie die methode damit dass anstatt den leeren Strings die Nutzer gewusnschte Strings eingeben koennen
         * 
         * 
         */


        aufgabe_eins();
        String [] strArray = {"Anton" , "Lisa"};
        for (String str : enhanceArray(strArray, 8)){
            System.out.println(str);
        }

        aufgabe_sieben();

    }
    public static void aufgabe_eins (){
        int [] int_array = new int[5];
        Random rd = new Random();
        for (int i = 0 ;  i < int_array.length ; i++){
            int_array[i] = rd.nextInt(10) + 1 ;
            System.out.println(int_array[i]);
        }
        System.out.println();
    }

    public static void aufgabe_zwei (){
        int [] int_array = {1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i < int_array.length ; i++){
            int temp = int_array[i];
            int_array[i] = temp -5;
        }
        for (int i : int_array){
            System.out.println(i);
        }
        System.out.println();
    }
    public static int [] aufgabe_drei (int length){
        int [] temp_array = new int[length];
        for (int i = 0 ; i < temp_array.length ; i++){
            temp_array[i] = i + 1;
        }
        return temp_array;
    }

    public static double get_average (int [] input_array){
        int sum = 0;

        for (int i : input_array){
            sum += i;
        }
        return sum / input_array.length;
    }


    public static String[] enhanceArray (String [] input_array , int newLength){
        if (newLength < input_array.length){
            System.out.println("Die Laenge des neuen Arrays ist kleiner als das jetzige");
            return input_array;
        }
        String [] newArray = new String[newLength];
        for (int i = 0 ; i < input_array.length ; i++){
            newArray[i] = input_array[i] ;
        }
        for (int i = input_array.length ; i < newLength ; i++){
            newArray[i] = "EMPTY STRING";
        }
        return newArray;
    }

    public static void aufgabe_sechs () {

        ArrayList <String> myList = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String response ;
        do {
            System.out.println("Was soll hinzugefuegt werden?");
            String item = sc.nextLine();
            myList.add(item);
            System.out.println("Moechtest du was hinzufuegen?");
            response = sc.nextLine();
            
        } while (response.equals("j"));
        System.out.println("Die Liste enthaelt:");
        for (String s : myList){
            System.out.println(s);
        }
    }

    public static void aufgabe_sechs_2 (){
        ArrayList <String> myList = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String response = "";
        do {

            if (!response.equals("r")){
                System.out.println("Was soll hinzugefuegt werden?");
                String item = sc.nextLine();
                myList.add(item);
            }
            else {
                System.out.println("Was soll loeschen?");
                String delItem = sc.nextLine();
                if (myList.remove(delItem)){
                    System.out.println("Das Item wurde geloescht");
                }
            }

            System.out.println("Moechtest du was hinzufuegen?");
            response = sc.nextLine();
            
        } while (response.equals("j")|| response.equals("r"));
        System.out.println("Die Liste enthaelt:");
        for (String s : myList){
            System.out.println(s);
        }
    }

    public static void aufgabe_sieben () {
        int [] int_array = {1,2,3,4,5};
        int [] new_array = new int[int_array.length];
        for (int i = 0 ; i < int_array.length ; i ++){
            if (i == 0){
                new_array[i] = int_array[int_array.length -1];
            }
            else {
                new_array[i] = int_array[i-1];
            }

        }

        for (int i : new_array){
            System.out.println(i);
        }
    }
}