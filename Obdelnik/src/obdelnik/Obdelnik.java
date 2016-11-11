/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obdelnik;

/**
 *
 * @author duck
 */
public class Obdelnik {

    /**
     *
     */
    public int vyska;

    /**
     *
     */
    public int sirka;
    
    /**
     *
     * @param vyska
     * @param sirka
     */
    public Obdelnik(int vyska, int sirka) {
        this.sirka = sirka;
        this.vyska = vyska;        
    }
    
    /**
     *
     * @return
     */
    public int obvod() {
        int pom;
        pom = 2*(vyska + sirka);
        return pom;
    }
    
    /**
     *
     * @return
     */
    public int obsah() {
        return (vyska*sirka);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obdelnik obd = new Obdelnik(1,2);
        
        obd.vyska = 5;
        obd.sirka = 3;
        int o = obd.obvod();
        
        System.out.println("Obvod je: " +o);
        
    }
    
}
