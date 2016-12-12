/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_kap20;

/**
 *
 * @author duck
 */
public class Cviceni_kap20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vlakno1 v1 = new Vlakno1("jsem vlakno1.1");
        v1.start();
        Vlakno1 v2 = new Vlakno1("jsem vlakno1.2");
        v2.start();
        Vlakno1 v3 = new Vlakno1("jsem vlakno1.3");
        v3.start();
        Vlakno1 v4 = new Vlakno1("jsem vlakno1.4");
        v4.start();
    }
    
}

class Vlakno1 extends Thread {
    public Vlakno1(String jmeno) {
        super(jmeno);
    }
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(i + ". " + getName());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Probudili jste me predcasne!");
        }
    }
}
