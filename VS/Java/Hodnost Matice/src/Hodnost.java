import java.util.*;
import java.io.*;

/**
 * Trida, ktera obsahuje metody pro vypocet
 * hodnosti matice
 *
 * @author Tomas Visek
 * @created Kveten 2007
 */
public class Hodnost {
    static {Locale.setDefault(Locale.US);}
    
    static Matice input;
    
    /**
     * metoda pro nacteni cisla
     * @return vraci nactene cislo
     */
    public static int ctiInt() {        // metoda pro nacteni cisla
        byte[] pole = new byte [20];
        String nacteno;
        int i;
        
        try {
            System.in.read(pole);
            nacteno = new String(pole).trim();
            i = Integer.valueOf(nacteno).intValue();
            return i;        
        }
        catch (IOException e) {
            System.out.println("Chybne nactene cislo!");
            return 0;
        }
    }
    
    /**
     * metoda, ktera vyzve uzivatele k naplneni matice
     * @param objekt typu Matice
     * @return vraci naplnenou matici
     */
    public static Matice naplneniMatice(Matice X) {
        System.out.println("- - - Program pro poèítání hodnosti matice - - -\nZadejte:");
        System.out.println("Pocet radku matice");
        int radky = ctiInt();       // nactu pocet radku
        System.out.println("Pocet sloupcu matice");
        int sloupce = ctiInt();     // nactu pocet sloupcu
        X = new Matice(radky, sloupce);     // vytvori novy objekt X tridy Matice
        
        X.fillByUser();     // naplneni X prvky 
        X.printArray();    // vytisknuti matice
        return X;
    }
    
    /**
     * pokud je prvek na pozici 1.1 nulovy, prohodi 
     * cely prvni radek za posledni a radky pak odzdola 
     * posune smerem nahoru
     * @param objekt pole typu Matice, kde chceme zajistit nenulovy prvni prvek
     * @return vraci pole typu Matice
     */
    public static Matice nenulovyPrvniPrvek(Matice pole) {
        Matice pomocna = new Matice(pole.prvky.length, pole.prvky[0].length);
        int pocet = 0;
        pomocna = pole;
        while ((pole.prvky[0][0] == 0) && (pocet < pole.prvky.length-1)){
            for (int i = 0; i < pole.prvky.length-1; i++) {
                for (int j = 0; j < pole.prvky[i].length; j++) {
                    pomocna.prvky[i][j] = pole.prvky[i+1][j];
                    //pomocna.prvky[pole.prvky.length-1] = prvniRadek;
                }
            }
            pocet++;
        }
        return pomocna;
    }
    
    /**
     * metoda, ktera prevede vstupni matici pomoci
     * Gaussovy eliminacni metody na horni trojuhelnikovou 
     * matici
     * @param objekt pole typu Matice, kterou chceme upravit
     * @return vraci opet pole typu Matice
     */
    public static Matice gaussovaEl(Matice pole) {
        Matice vysledek = new Matice(pole.prvky.length, pole.prvky[0].length);
        double nasobitel = 1;
        for (int i = 0; i < pole.prvky.length-1; i++) {
            for (int j = 0; j < pole.prvky[i].length; j++) {
                nasobitel = (pole.prvky[i][j]/pole.prvky[i+1][j]);
                
            }
        }
        System.out.println(nasobitel);
        return vysledek;
    }
        /**
     * metoda main
     * @param args 
     */
    public static void main(String[] args ) {
        Scanner scan=new Scanner(System.in);
        
        Matice nova = naplneniMatice(input);
        System.out.println("\n");
        nenulovyPrvniPrvek(nova).printArray();
        System.out.println("\n");
        gaussovaEl(nova);
    }
}
