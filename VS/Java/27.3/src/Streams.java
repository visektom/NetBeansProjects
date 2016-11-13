import java.io.*;
import java.util.*;
/*
 * Streams.java
 *
 * Created on 30. kvìten 2007, 15:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
public class Streams {
    public static void main(String [] args) throws IOException {
    File nf = new File("a.txt");
    File of = new File("b.txt");
    
    if (nf.exists() == true){
        BufferedReader fr = new BufferedReader();
        FileWriter fw = new FileWriter(of);
        int c;
        while ((c = fr.read()) != -1){
            fw.write(c);
        }
        
        fr.close();
        fw.close();
    }
    }

    
}
