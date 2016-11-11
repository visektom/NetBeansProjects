/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentaktraining;

/**
 *
 * @author duck
 */

/** Třída reprezentuje zdravič, který slouží ke zdravení uživatelů
 *  priklad z itnetworks.cz; http://www.itnetwork.cz/java/oop/java-tutorial-prvni-objektova-aplikace-hello-object-world
 */
public class Zdravic {
    
    /** Text pozdravu */
    String text;
    
    /**
    * Pozdraví uživatele textem pozdravu a jeho jménem
    * @param  jmeno  Jméno uživatele
    * @return      Text s pozdravem
    */
    public void pozdrav(String jmeno) {
        System.out.println(text +jmeno);
    }
}
