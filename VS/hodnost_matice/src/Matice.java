import java.io.*;
public class Matice {
    int prvky[][];
    
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
    
    public Matice(int radky, int sloupce) {
        prvky = new int[radky][sloupce];
    }
    
    public void fillByUser() {
        for (int i = 0; i < prvky.length; i++) {
            for (int j = 0; j < prvky[i].length; j++) {
                System.out.println("Zadejte prvek na pozici "+(i+1)+"."+(j+1));
                prvky[i][j] = ctiInt();
            }
        }
    }
    
    public void printArray() {
        for (int i = 0; i < prvky.length; i++) {
            for (int j = 0; j < prvky[i].length; j++) {
                System.out.print(prvky[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
