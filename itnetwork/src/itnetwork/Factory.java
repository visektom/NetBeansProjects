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
public class Factory {
    
    public static Cukrovi bananove() {
        return new Cukrovi("zluta", "kulaty", 20);
    }
    
    public static Cukrovi jahodove() {
        return new Cukrovi("cervena", "kulaty", 15);
    }
    
    public static Cukrovi cokoladove() {
        return new Cukrovi("hneda", "hranaty", 25);
    }
}
