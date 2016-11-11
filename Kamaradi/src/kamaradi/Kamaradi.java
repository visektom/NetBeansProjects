/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamaradi;

/**
 * priklad z itnetworks.cz; http://www.itnetwork.cz/java/oop/java-resene-priklady-oop/
 * @author duck
 */
public class Kamaradi {

    /**
     * jmeno osoby
     */
    public String jmeno = "";

    /**
     * vek osoby
     */
    public int vek = 0;

    /**
     * kamarad
     */
    public Kamaradi mujKamarad;
    
    /**
     * vytvori kamarada s parametry nize
     * @param jmeno
     * @param vek
     */
    public Kamaradi(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    /**
     * vypise predstavovaci frazi
     */
    public void predstaveni() {
        System.out.println("Ahoj, ja jsem "+jmeno+" je mi "+vek+" a muj kamarad je "+mujKamarad.jmeno);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kamaradi karel = new Kamaradi("Karel Novy", 33);
        Kamaradi pepa = new Kamaradi("Pepa Stary", 23);
        
        karel.mujKamarad = pepa;
        pepa.mujKamarad = karel;
        karel.predstaveni();
        pepa.predstaveni();
    }
    
}
