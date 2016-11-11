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
public class Statika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uzivatel u = new Uzivatel("Karel", "hovnoSeVzneslo");
        Uzivatel v = new Uzivatel("Komar", "banikPyco");
        System.out.println("Minimalni delka hesla je: "+Uzivatel.getMinimalniDelkaHesla());
        System.out.println("Jmeno 1. uzivatele je: "+u.getJmeno());
        System.out.println("ID 1. uzivatele je: "+u.getId());
        System.out.println("Jmeno 2. uzivatele je: "+v.getJmeno());
        System.out.println("ID 2. uzivatele je: "+v.getId());
        System.out.println("Heslo je validni: "+Uzivatel.zvalidujHeslo("heslo"));
//        Math m = new Math();
        Kalendar k = new Kalendar();
        System.out.println("");
        System.out.println(k.getSettings());
    }
    
}
