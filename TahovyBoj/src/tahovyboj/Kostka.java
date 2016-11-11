/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;
import java.util.Random;

/**
 *
 * @author duck
 */
public class Kostka {
    private Random random;
    private int pocetSten;
    
    public Kostka(int pocetSten) {
        this.pocetSten = pocetSten;
        random = new Random();
    }
    
    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }
    public int hod() {
        return random.nextInt(pocetSten)+1;
    }
    
    @Override
    public String toString() {
        return String.format("Kostka s %s stenami", pocetSten);
    }
    /**
     * @return the pocetSten
     */
    public int getPocetSten() {
        return pocetSten;
    }
}
