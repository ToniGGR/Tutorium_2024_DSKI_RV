public class SwitchCase {
    /*
     * 1:
     * Mit dem Scanner soll die Uhrzeit vom User abgefragt werden.
     * Erstelle ein Switch Case Statement welches je nach Tageszeit eine Begruessung ausgibt 
     * 
     * (19 - 23 Uhr) --> Guten Abend
     * (24 - 5 Uhr) --> Gute Nacht
     * (6 - 12 Uhr) --> Guten Morgen
     * ansonsten --> Guten Tag
     */

    public static void main(String[] args) {
        sayHello(7);
    }
    public static void sayHello (int time) {
        switch (time) {
            case 19,20,21,22,23:
                System.out.println("Guten Abend");
                break;
            case 24,1,2,3,4,5 :
                System.out.println("Gute Nacht");
                break;
            case 6,7,8,9,10,11,12 :
                System.out.println("Guten Morgen");
                break;
            default:
                System.out.println("Guten Tag");
                break;
        }
    }
}
