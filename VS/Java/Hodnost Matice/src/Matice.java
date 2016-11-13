import java.io.*;
/**
 * Trida, ktera obsahuje metody pro operace
 * s maticemi, tzn. vypsani matice a naplneni
 * matice uzivatelem
 *
 * @author Tomas Visek
 * @created Kveten 2007
 */
public class Matice {
    int prvky[][];
    
    /**
     * metoda pro naceni cisla ze vstupu
     */
    public static int ctiInt() {
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
     * konstruktor
     */
    public Matice(int radky, int sloupce) {
        prvky = new int[radky][sloupce];
    }
    /**
     * metoda, ktera vyzve uzivatele, aby naplnil matici
     */
    public void fillByUser() {
        for (int i = 0; i < prvky.length; i++) {
            for (int j = 0; j < prvky[i].length; j++) {
                System.out.println("Zadejte prvek na pozici "+(i+1)+"."+(j+1));
                prvky[i][j] = ctiInt();
            }
        }
    }
    /**
     * metoda, ktera vytiskne matici
     */
    public void printArray() {
        for (int i = 0; i < prvky.length; i++) {
            System.out.println("");
            for (int j = 0; j < prvky[i].length; j++) {
                System.out.print(prvky[i][j]+ " ");
            }
        }
    }
}
