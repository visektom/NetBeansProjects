/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentaktraining;

/**
 * priklad z itnetworks.cz; http://www.itnetwork.cz/java/oop/java-resene-priklady-oop/
 * @author duck
 */
public class Truck {
    
    /**
     * nosnost trucku
     */
    public int nosnost = 3000;

    /**
     * nalozena zatez
     */
    public int naklad = 0;
    
    /**
     * metoda, ktera pricte zadanou vahu k jiz nalozenemu, pak check jestli to vubec jde nalozit, kdyz ano nalozi, kdyz ne, nenalozi
     * @param vaha, hmotnost ktera se bude nakladat
     * @return naklad, vraci hmotnost po nalozeni ci pokud nenalozeno, oak puvodni hmotnost
     */
    public int naloz(int vaha) {
        naklad += vaha;
        if(checkNosnost() == false) {
            printNaklad();
            return naklad;
        }else {
            System.out.println("Dalsi naklad nelze nalozit, prekracuje nosnost!");
            naklad -= vaha;
            return naklad;
        }  
    }
    
    /**
     * metoda, ktera odecte zadanou vahu od jiz nalozeneho, pak check jestli to vubec jde vylozit, kdyz ano vylozi, kdyz ne, nevylozi
     * @param vaha, hmotnost ktera se bude vykladat
     * @return naklad, vraci hmotnost po ylozeni ci pokud nevylozeno, oak puvodni hmotnost
     */
    public int vyloz(int vaha) {
        naklad -= vaha;
        if(checkNosnost() == false) {
            printNaklad();
            return naklad;
        }else {
            System.out.println("Dalsi naklad nelze vylozit, neni co!");
            naklad += vaha;
            return naklad;
        }
    }
    
    /**
     * kontrola, jestli naklad neni vetsi nez nosnost trucku
     * @return boolean hodnota, true kdyz je pretizeny, false kdyz ne
     */
    public boolean checkNosnost() {
        boolean tooHeavy = false; // pokud je naklad vetsi nez nosnost nebo pokud bysme odebirali vice nez je nalozeno
        
        if(naklad<nosnost && naklad>0) {
            tooHeavy = false;
        }else {
            tooHeavy = true;
        }
        return tooHeavy;
    }
    
    /**
     * vytiskne aktualni nalozeny naklad
     */
    public void printNaklad() {
        System.out.println("Naklad je: " +naklad);
    }
}
