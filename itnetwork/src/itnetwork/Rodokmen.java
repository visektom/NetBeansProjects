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
public class Rodokmen {
    private Osoby osoba;
    
    public Rodokmen(Osoby osoba) {
        this.osoba = osoba;
    }
    
    private void vypisOsobuAPredky(Osoby osoba) {
        if(osoba != null) {
            System.out.println(osoba);
            vypisOsobuAPredky(osoba.otec);
            vypisOsobuAPredky(osoba.matka);
        }
    }
    
    public void vypis() {
        System.out.println("Rodokmen pro osobu "+osoba+" je:");
        vypisOsobuAPredky(osoba);
    }
}
