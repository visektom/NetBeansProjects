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
public class Clovek {
    private String jmeno;
    private int unava;
    private int spanek;
    
    public Clovek(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public int run(int pocetKm) {
        if(unava+pocetKm<=20) {
            unava += pocetKm;
        }else {
            System.out.println("Jsem prilis unaveny, potrebuji spat!");
        }
        return unava;
    }
    
    public int sleep(int pocetHodin) {
        if(unava-10*pocetHodin<0) {
           System.out.println("Jsem prespaly!");
        }else {
            unava -= 10*pocetHodin;
        }
        return unava;
    }
    /**
     * @return the unava
     */
    public int getUnava() {
        return unava;
    }

    /**
     * @return the spanek
     */
    public int getSpanek() {
        return spanek;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

}
