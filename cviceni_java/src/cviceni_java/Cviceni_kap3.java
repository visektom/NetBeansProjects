/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_java;

/**
 *
 * @author duck
 */
public class Cviceni_kap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        getRanges1();
//        getRanges2();
//        realDeleni();
//        pip();
//        celaCast();
//        logSoucin();
          logSoucet();
          
    }
    
    public static void getRanges1(){
        byte bmin = Byte.MIN_VALUE;
        byte bmax = Byte.MAX_VALUE;
        short smin = Short.MIN_VALUE;
        short smax = Short.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        int imax = Integer.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        long lmax = Long.MAX_VALUE;
        
        System.out.println("Rozsahy celociselnych datovych typu jsou: \n" + 
                "Byte od " + bmin + " do " + bmax + "\n" +
                "Short od " + smin + " do " + smax + "\n" +
                "Int od " + imin + " do " + imax + "\n" +
                "Long od " + lmin + " do " + lmax);
    }
    
    public static void getRanges2(){
        double dmin = Double.MIN_VALUE;
        double dmax = Double.MAX_VALUE;
        float fmin = Float.MIN_VALUE;
        float fmax = Float.MAX_VALUE;
        
        System.out.println("Rozsahy realnych datovych typu jsou: \n" + 
                "Double od " + dmin + " do " + dmax + "\n" +
                "Float od " + fmin + " do " + fmax);
    }
    
    public static void realDeleni(){
        double a = Math.random();
        double b = Math.random();
        double c = 0;
        double podil = a/b;
        System.out.println("a je: " + a + ", b je: " + b + ", jejich podil je: " + podil);
        
        if(podil == Double.NEGATIVE_INFINITY || podil == Double.POSITIVE_INFINITY || Double.isNaN(podil)){
            System.out.println("Delitel je prilis male cislo!");
        }else{
            System.out.println("Podil je: " + podil);
        }
    }
    
    public static void pip(){
        System.out.println("Ma pipnout, ale nepipa, je to kram! \007");
    }
    
    public static void celaCast(){
        double d = 3.14;
        System.out.println("Cela cast cisla " + d + " je: " + (int) d );
    }
    
    public static void logSoucin(){
        byte a = 31;
        byte b = 32;
        byte c = 33;
        
        if(a == 32 && ++b == 32){
            c = 127;
        }
        System.out.println("Tak tohle byl logicky zkraceny soucin\n" +
                    "a = " + a + "\n" +
                    "b = " + b + "\n" +
                    "c = " + c);
        
        byte d = 1;
        byte e = 2;
        byte f = 3;
        
        if(d == 1 & ++e == 3){
            f = 127;
            }
        System.out.println("Tak tohle byl logicky uplny soucin\n" +
                    "d = " + d + "\n" +
                    "e = " + e + "\n" +
                    "f = " + f);
        
        
//        System.out.println("Logicky zkraceny soucin je: " + (a & b) + "\n" +
//                           "Logicky uplny soucin je: " + (a & b));
    }
    
    public static void logSoucet(){
        byte a = 1;
        byte b = 2;
        byte c = 3;
        
        if(a == 1 || ++b == 2){
            c = 55;
        }
        System.out.println("Tak tohle byl logicky zkraceny soucet\n" +
                    "a = " + a + "\n" +
                    "b = " + b + "\n" +
                    "c = " + c);
        
        byte d = 1;
        byte e = 2;
        byte f = 3;
        
        if(d == 1 | ++e == 6){
            f = 33;
        }
        System.out.println("Tak tohle byl logicky uplny soucet\n" +
                    "d = " + d + "\n" +
                    "e = " + e + "\n" +
                    "f = " + f);
        
    }}

