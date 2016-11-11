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
public class Garaz {
    private Auto zaparkovaneAuto;
    
    public void vloz(Auto zaparkovaneAuto) {
        this.zaparkovaneAuto = zaparkovaneAuto;
    }
    
    @Override
    public String toString() {
        return String.format("V garazi je zaparkovane auto %s ", zaparkovaneAuto.getSpz());
    }
}
