/*
 * ReadVl.java
 *
 * Created on 9. kvìten 2007, 19:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
import java.io.*;

public class ReadVl extends Thread{
    FileReader fr;
    BufferedReader in;
    String jmenoSouboru;
    static public long suma = 0;
    static public boolean hotovo = false;
    
        /** Creates a new instance of ReadVl */
    public ReadVl (String jmeno) {
        super("Vlakno pro cteni");
        jmenoSouboru = new String(jmeno);
    }
    
    public void run() {
        String radka;
        
        try {
            fr = new FileReader(jmenoSouboru);
            in = new BufferedReader(fr);
            
            while((radka = in.readLine()) != null){
                suma += Integer.parseInt(radka);
                Thread.yield();
            }
            
        } catch (IOException e) {
                System.out.println("Chyba v souboru");
                hotovo = true;
          }    
    }
    
}
