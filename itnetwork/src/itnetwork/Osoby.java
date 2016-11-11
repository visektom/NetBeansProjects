/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itnetwork;

/**
 *
 * @author duck
 */
public class Osoby {
    private String jmeno;
    public Osoby otec;
    public Osoby matka;
    
    public Osoby(String jmeno, Osoby otec, Osoby matka) {
        this.jmeno = jmeno;
        this.otec = otec;
        this.matka = matka;
    }

    /**
     * @return the jmeno
     */
    @Override
    public String toString() {
        return jmeno;
    }
}
