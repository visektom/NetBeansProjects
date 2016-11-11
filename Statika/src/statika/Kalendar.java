/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author duck
 */
public class Kalendar {
    
    public String getSettings() {
        String s = "";
        s += String.format("Jazyk: %s\n", Nastaveni.getJazyk());
        s += String.format("Barevne schema: %s\n", Nastaveni.getBarevneSchema());
        s += String.format("Spustit po startu: %s\n", Nastaveni.isSpustitPoStartu());
        return s;
    }
}
