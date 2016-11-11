/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentaktraining;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author duck
 */
    public class JenTakTraining {
    
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
        /**
         * vstupni test z Unicorn, priklad 1
         * @param int[] array vstupni pole nad kterym se udela aritmetricky prumer
         * @return vrati hodnotu aritmetrickeho prumeru prvku vstupniho pole
         */
        public static double aritmetic_mean(int[] array){
        int soucet = 0;
        double vysl = 0;
        
        for(int i=0; i<array.length; i++){
            soucet += array[i]; 
        }
        vysl=soucet/array.length;
        return vysl;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej prvni cislo: ");
//        int a = sc.nextInt();
//        System.out.println("Zadej druhe cislo: ");
//        int b = sc.nextInt();
//        System.out.println("Zadej treti cislo: ");
//        int c = sc.nextInt();
//        int[] array = {a, b, c};
//        System.out.println("Prumer je: " +aritmetic_mean(array));
        
//        byte[] pole = new byte[20];
//        System.out.println("delka byte pole je: " +pole.length);
//        
//        try{
//            int j = System.in.read(pole);
//            System.out.println("navratova hodnota System.in.read je: "+j+"\n");
//        }
//        catch(IOException e){
//            System.out.println("bla");
//        }
//        
//        for(int j=0; j<pole.length; j++){
//            System.out.println("Na pozici " +(j+1)+ " je cislo (ASCII kod in dec): " +pole[j]);
//        }
        /** Zdravic */
//        Zdravic zdravic = new Zdravic();
//        zdravic.text = "Nazdar, ty vole, "
//        zdravic.pozdrav("Karle");
//        zdravic.pozdrav("Vole!");
        /** Kalkulacka */
//        System.out.println("Zadej prvni cislo: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Zadej druhe cislo: ");
//        double num2 = sc.nextDouble();
//        Kalkulacka calc = new Kalkulacka(num1, num2);
//        calc.add();
//        calc.subtract();
//        calc.multiply();
//        calc.divide();
        /** Truck */
        Truck tatra = new Truck();
        System.out.println("Nosnost auta je: " + tatra.nosnost + " a pocatecni naklad je: " +tatra.naklad);
        tatra.naloz(3000);
        tatra.naloz(1);
        tatra.vyloz(300);
        tatra.vyloz(3000);
    }
    
}
