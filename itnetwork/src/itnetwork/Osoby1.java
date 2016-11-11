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
public class Osoby1 {
    private String jmeno;
    public Osoby1 otec;
    public Osoby1 matka;
    
    public Osoby1(String jmeno) {
        this.jmeno = jmeno;
    }
    
    @Override
    public String toString() {
        return jmeno;
        }
}
