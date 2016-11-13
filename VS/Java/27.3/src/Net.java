/*
 * Net.java
 *
 * Created on 30. kvìten 2007, 17:00
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
import java.net.*;
public class Net {
    
    /** Creates a new instance of Net */
    public Net() {
    }
    public static void main(String [] args) {
        
        try {
        Socket s = new Socket("localhost", 453);
        ServerSocket ss = new ServerSocket(453);
        } catch (Exception e) {
            System.out.println("etwas");
        }
    }
}
