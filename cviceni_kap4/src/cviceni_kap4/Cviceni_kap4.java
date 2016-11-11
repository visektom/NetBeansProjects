/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_kap4;
import java.io.*;
import java.lang.reflect.Array;
import java.util.stream.IntStream;
import java.util.Arrays;
/**
 *
 * @author duck
 */
public class Cviceni_kap4 {

    // ukol 1
    public static char ctiZnak(){
        try{
            System.out.println("Zadej znak: ");
            int i = System.in.read();
            char c = (char) i;
            System.out.println("Vstup: " + c );
            char d = (char) (i+1);
            System.out.println("Vystup: " + d);
            return c;        
        }
        catch(IOException e){
            System.out.println("Chybne nactene cislo!");
            return 0;
        }

    }
    // ukol 2, ale vypise decimalni hodnotu ASCII znaku misto znaku samotneho
    public static char ctiZnakDec(){
        
        try{
            System.out.println("Zadej znak: ");
            char c = (char) System.in.read();
            System.out.println("Vstup: " + c);
//            int i = (int) c;
            System.out.println("Vystup: " + c + " = " + (int) c);
            return c;
        }
        catch(IOException e){
            System.out.println("Chybne nactene cislo!");
            return 0;
        }
    }
    // metoda pro nacteni celociselneho vstupu, nacte vice cisel do pole
    public static int ctiInt(){
        byte[] pole = new byte[20];
        String nacteno;
        int i;

        try{
            System.in.read(pole);
            nacteno = new String(pole).trim();
            i = Integer.valueOf(nacteno).intValue();
            return i;
        }
        catch(IOException e){
            System.out.println("Chybne nactene cislo: ");
            return 0;
        }
    }

    // metoda pro nacteni realneho vstupu, nacte vice cisel do pole
    public static double ctiDouble(){
        byte[] pole = new byte[20];
        String nacteno;
        double i;
        
        try{
            System.in.read(pole);
            nacteno = new String(pole).trim();
            i = Double.valueOf(nacteno).doubleValue();
            return i;
        }
        catch(IOException e){
            System.out.println("Chybne nactene cislo: ");
            return 0;
        }
    }
    // melo to nacitat CHARy do pole (jako ctiInt, ctiDouble), ale nefunguje
    public static char ctiChar(){
        byte[] pole = new byte[20];
        String nacteno;
        int i;
        
        try{
            return (char) System.in.read(pole);
        }
        catch(IOException e){
            System.out.println("Chybne nactene cislo: ");
            return 0;
        }
    }
    // ukol 3
    public static int tax(){
        
        System.out.println("Zadejte cenu bez dane: ");
        int i = ctiInt();        
        System.out.println("Cena bez dane je: " + i);
            
        double cena = i*1.25;
        System.out.println("Prodejni cena s dani (25%) je: " + cena);
        return 0;
    }
    // ukol 4
    public static double readRealWriteInt(){
        
        System.out.println("Zadejte realne cislo: ");
        double i = ctiDouble();
        System.out.println(i);
        int j = (int) i;
        System.out.println("Cela cast je: " + j);
        return 0;
    }
    //ukol 5, nacte mala pismena a vrati velka pismena
    public static String smallToCaps(){
        byte[] pole = new byte[3];
        String nacteno;
//        String out;
//        int i;
        
        
        try{
            System.out.println("Zadej tri mala pismena (a-z): ");
            System.in.read(pole);
            byte[] pole2 = new byte[3]; // uloziste pro prevod na velka pismena
            for(int j = 0; j<3; j++){
                pole2[j] = (byte) (pole[j] - 32);
            }
            nacteno = new String(pole2).trim();
//            out = nacteno.toUpperCase();
//            return out;
            return nacteno;
//            Integer.valueOf(nacteno);
            
//            return i;
            
        }
        catch(IOException e){
            System.out.println("Neni male pismeno!");
            return "Neni male pismeno!";
        }

    }
    //ukol 6
    public static int[] threeInts(){
        byte[] pole = new byte[3];
        String nacteno;
        int soucet, soucin, prumer, min, max;

        try{
            System.out.println("Zadej tri jednociferna cisla: ");
            int[] vysl = new int[5];
            System.in.read(pole);
            nacteno = new String(pole).trim();
            
//            int pole2[] = new int[3];
//            for(int j=0; j<3; j++){
//                pole2[j] = pole[j];
//            }
//            soucet = (int) IntStream.of(pole2).sum();
//            soucet = 1;
            soucin = 2;
//            prumer = 3;
//            min = 4;
//            max = 5;
            System.out.println(Arrays.toString(pole));
            System.out.println(nacteno);
            return vysl;
        }
        catch(IOException e){
            int[] nul = new int[5];
            System.out.println("Chybne nactene cislo: ");
            return nul;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ctiZnak();
//        ctiZnakDec();
//        tax();
//        readRealWriteInt();
//        ctiChar();  //nefunguje
//        smallToCaps();
//        int a = ctiInt();
//        System.out.println("pole je: " + a);
//        System.out.println("Caps jsou: " + smallToCaps());
        threeInts();
        
    }
    
}
