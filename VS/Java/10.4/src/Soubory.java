import java.util.*;
import java.io.*;
class UkazkovyObject implements Serializable {
    
}
class Vlakno extends Thread {
    private int cislo = 5;
    public Vlakno() {
        super("name");
        start();
    }
    public void run() {
        for (int i = cislo; i <= 0; i++) {
            System.out.println(cislo);
            if(cislo-- == 0) return;
        }
    }
}
public class Soubory {
    static {Locale.setDefault(Locale.US);}
    
    public static void main(String[] args ) {
        Scanner scan=new Scanner(System.in);
        
        
        File f = new File("neco.txt");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        
        /*UkazkovyObject pole[] = new UkazkovyObject[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = new UkazkovyObject(i+1, i+2, i+3);
            System.out.println(pole[i]);
        }*/
    }
}
