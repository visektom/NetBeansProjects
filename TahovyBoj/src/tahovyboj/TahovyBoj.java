/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;
import java.util.Random;
/**
 *
 * @author duck
 */
public class TahovyBoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Kostka sestistenna = new Kostka();
//        Kostka desetistenna = new Kostka(10);
//        System.out.println("Pocet sten je: "+ sestistenna.getPocetSten());
//        System.out.println("Pocet sten je: "+ desetistenna.getPocetSten());
//        System.out.println(sestistenna);
//        for(int i=0; i<10; i++) {
//            System.out.print(sestistenna.hod()+" ");
//        }
//        System.out.println("\n\n"+desetistenna);
//        for(int i=0; i<10; i++) {
//            System.out.print(desetistenna.hod()+" ");
//        }
//        System.out.println("\n");
//        Kostka kostka = new Kostka(10);
//        Bojovnik bojovnik = new Bojovnik("Karel", 100, 50, 20, kostka);
//        System.out.printf("Bojovnik se jmenuje: %s\n", bojovnik);
//        System.out.printf("Bojovnik je nazivu: %s\n", bojovnik.nazivu());
//        System.out.printf("Pocet zivotu bojovnika: %s\n", bojovnik.grafickyZivot());
//        System.out.println("");
//        Bojovnik souper = new Bojovnik("Zabijak", 100, 55, 15, kostka);        
//        System.out.printf("Bojovnik se jmenuje: %s\n", souper);
//        System.out.printf("Bojovnik je nazivu: %s\n", souper.nazivu());
//        System.out.printf("Pocet zivotu bojovnika: %s\n", souper.grafickyZivot());
//        System.out.println("");
//        souper.utoc(bojovnik);
//        System.out.println(souper.vratPosledniZpravu());
//        System.out.println(bojovnik.vratPosledniZpravu());
//        System.out.printf("Zivot %s je po utoku: %s\n", bojovnik, bojovnik.grafickyZivot());
//        System.out.println("");

        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Karel", 100, 20, 10, kostka);
//        Bojovnik souper = new Bojovnik("Zabijak", 100, 55, 15, kostka);
        Bojovnik smajdalf = new Mag("Smajdalf", 60, 15, 12, kostka, 30, 45);
        Arena arena = new Arena(bojovnik, smajdalf, kostka);
        arena.zapas();
    }
    
}
