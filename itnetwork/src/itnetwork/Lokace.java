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
public class Lokace {
    public Lokace sever;
    public Lokace jih;
    public Lokace vychod;
    public Lokace zapad;
    private String nazev;
    private String popis;
    
    public Lokace(String nazev, String popis) {
        this.nazev = nazev;
        this.popis = popis;
    }
    @Override
    public String toString() {
        String vystup = nazev+"\n"+popis+"\n\n";
        String smery = "Muzes jit na: ";
        if(sever != null) {
            smery += "sever "; 
        }
        if(jih != null) {
            smery += "jih "; 
        }
        if(vychod != null) {
            smery += "vychod ";
        }
        if(zapad != null) {
            smery += "zapad ";
        }
        vystup += smery+"\n";
        return vystup;
    }
    
}
