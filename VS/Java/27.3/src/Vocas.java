/*
 * Thread.java
 *
 * Created on 30. kvìten 2007, 16:17
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
public class Vocas extends Thread {
    
    /** Creates a new instance of Thread */
    public Vocas(String jmeno) {
        super(jmeno);
    }
    public void run() {
        
    }
    public static void main(String [] args) {
        Vocas bla = new Vocas("Meine");
        bla.start();
        new Vocas("Deine").start();
    }
}
