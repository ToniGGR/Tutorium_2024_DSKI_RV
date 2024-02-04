public class Operatoren {
    public static void main(String[] args) {
        String c1 = "j", c2 = "a" , c3 = "v" ;
        String s1 = c1 + c2 +c3 + "a";
        System.out.println("s1 : " + s1);


        // OUPUT : java


        int i1 = 1 , i2 = 1 ;
        int i3 = i1 * i1++;
        int i4 = i2 * ++i2;
        System.out.println(i3);
        System.out.println(i4);

        // OUTPUT : i3 : 1 / i4: 2

        double d1 = 0.25 , d2 = 5 ;
        double d3 = d1 * ++d2;
        d3 *= d3 ;
        System.out.println(d3);


        // OUTPUT : d4 : 2,25



        int i5 = 6 , i6 = 5;
        double i7 = (++i6 * i5) / i6-- ;
        System.out.println(i7 * i6);

        // OUTPUT : i6 30


        char c4 = 'A' , c5 = 'B' ;
        System.out.println(c4 == c5);

        // OUTPUT : false

        boolean b1 = true ;
        char c6 = 'L' , c7 = 'F' ;
        int i8 = 9;
        i8 /= i8 ;
        i8++ ;
        System.out.println(b1 || c6 == 'F');
        System.out.println(b1 && (10 % i8++ ==1));
        System.out.println(b1 && (!(c6 == c7)  && (i8 > 2)));


        // OUTPUT :  true , false , true

        int i9 = 7 , i10 = 8 ;
        int i11 = i9 - 9 + ++i10 ;
        i11 += ++i10 - (i9--) ;
        i11 -=5;
        System.out.println(i11);

        // OUTPUT :  5
        

        int a = 3 , b = 2 , c = 6 , d = 8;
        
        c /= (b++ > a || --a < ++b) ? a : b;        // c ist hier 3
        d %= (c-- == ++a || (c + 4) > b++ ) ? c : a;        // 2 mod 8 =0 --> d = 0

        System.out.println("a : " + a + "  b : " + b + "  c : " + c + "  d : " + d );

        // OUTPUT : a = 3 ; b = 4 ; c = 2 ; d = 0


        // Frage 1:
        int a = 5;
        int b = 3;
        int c = 8;
        int result1 = ++a * b-- + c++;
        System.out.println("Frage 1: " + result1);
        // Frage 2:
        int x = 12;
        int y = 4;
        int z = 2;
        boolean result2 = x % y == 0 && (x / y > z || x % z == 0);
        System.out.println("Frage 2: " + result2);
        // Frage 3:
        int m = 7;
        int n = 4;
        int o = 2;
        int result3 = m * (n + o) - m / n;
        System.out.println("Frage 3: " + result3);
        // Frage 4:
        boolean isMorning = true;
        boolean isWeekend = false;
        int temperature = 25;
        boolean result4 = (isMorning && temperature < 30) || (isWeekend &&
                temperature >= 25);
        System.out.println("Frage 4: " + result4);


    }
}
