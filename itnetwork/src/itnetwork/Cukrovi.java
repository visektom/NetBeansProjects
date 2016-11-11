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
public class Cukrovi {
    private String barva;
    private String tvar;
    private int hmotnost;
    
    public Cukrovi(String barva, String tvar, int hmotnost) {
        this.barva = barva;
        this.tvar = tvar;
        this.hmotnost = hmotnost;
    }
    
    @Override
    public String toString() {
        return String.format("Cukrovi barvy "+barva+", tvaru "+tvar+" a vahy "+hmotnost+"g");
    }
}
