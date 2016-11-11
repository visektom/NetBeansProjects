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
public class Auto {
    private String spz;
    private String barva;
            
    public Auto(String spz, String barva) {
        this.spz = spz;
        this.barva = barva;
    }
    
    public void zaparkuj(Garaz garaz) {
        garaz.vloz(this);
    }

    /**
     * @return the SPZ
     */
    public String getSpz() {
        return spz;
    }
}
