/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_kap5;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author duck
 */
public class Cviceni_kap5 {
    
    public static int ctiInt(){
        byte[] pole = new byte[20];
        String nacteno;
        int i;

        try{
            System.out.println("Zadej cislo:");
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
    
    public static void ternarni(int a, int b){
        //a>b ? System.out.println("Mensi cislo je: " + b + '\n' + "Vetsi cislo je: " +a ) : System.out.println("Mensi cislo je: " +a+ '\n' + "Vetsi cislo je: " +b);
        //(a > b) ? 1 : 2;
        if(a>b)
           System.out.println("Mensi cislo je: " + b + '\n' + "Vetsi cislo je: " +a);
        else
           System.out.println("Mensi cislo je: " + a + '\n' + "Vetsi cislo je: " +b);
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("i je " + a + " " +b);
//        ternarni(a, b);



        
    }
    
}
