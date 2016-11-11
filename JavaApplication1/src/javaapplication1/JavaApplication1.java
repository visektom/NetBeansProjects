/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;

/**
 *
 * @author duck
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        byte b = 127; //range from -128 to 127
        short s = 32767; //range from -32768 to 32767
        int i  = 2147483647; //range from -2147483648 to 2147483647
        long l = 9223372036854775807L; //range from -9223372036854775808 to 9223372036854775807
        float f = 7.1e-14F; //range from +-1.4e-45 to +-3.4e38
        double d = 3.14; //range from +- 4.9e-324 to +- 1.7e308
        char ch = 'A';
        int intmin = Integer.MIN_VALUE;
        int intmax = Integer.MAX_VALUE;
        System.out.println("Cau Krokodyle! Nize rozsah celociselnych zakladnich datovych typu...");
        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("ch = "+ch);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("integer min value is: = "+intmin);
        System.out.println("integer max value is: = "+intmax);
        System.out.println("Program kon\u010D\u00ED\n\007");
        
        double nula = 0;
        double vysledek  = 5.0/0;
        System.out.println("vysledek je: " +vysledek);
        if(Double.POSITIVE_INFINITY == vysledek){
            System.out.println("kladne nekonecno");
        }
        if(Double.isInfinite(vysledek) == true){
            System.out.println("je to proste nekonecno");
        }
        vysledek = nula/nula;
        System.out.println(vysledek);
        if(Double.isNaN(vysledek)){
            System.out.println("neni cislo");
        }
        
//        s=b;
//        System.out.println(s);
//        b= (byte) s;
//        System.out.println(b);
    }
/*
public static realtypy(nula, vysledek){
    double nula = 0;
    double vysledek  = 5.0/0;
    System.out.println("vysledek je: " +vysledek);
    return vysledek;
}    */
}
