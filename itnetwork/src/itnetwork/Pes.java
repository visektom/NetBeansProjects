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
public class Pes {
    private String jmeno;
    private int vek;
    
    public Pes(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    public void zestarni(int roky) {
        vek += roky;
    }

    /**
     * @return the vek
     */
    public String toString() {
        return String.format("Vek psa %s je %s.", jmeno, vek);
    }
}
