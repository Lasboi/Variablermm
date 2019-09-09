/**
 * Developed by András Ács (acsandras@gmail.com)
 * Added long descriptions by Lasse Nielsen
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 2019-09-09
 */

public class Variabler {

    public static void main(String[] args) {

        // Primitive datatyper
        byte a = 127;
        short c = 1001;
        int b = 10024;
        
        //Java kan ikke læse en long på over 9 tal medmindre man definere i sin kode at man gerne vil have et langt tal.
        //Java kan komme til at læse over 9 cifre hvis man sætter et L (stort eller lille l) bag sit tal og på den måde
        //Kan man benytte en long til sit fulde potentiale.
        long xMax = 9223372036854775807L;
        long xMin = -9223372036854775808L;

        b = a + c;

        // Decimaltal
        double d = 2.7;
        float e = 5.0f;

        // Boolean
        boolean f = true;
        boolean g = false;

        // String
        String navn = "Peter";

        // Char
        char i = 'b';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println(a+b);
        System.out.println(a+d);
        System.out.println(a+h);


    }

}
