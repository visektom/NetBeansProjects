/*
 * Zivocich.java
 *
 * Created on 30. kvìten 2007, 9:48
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
abstract class Zivocich {
    String typ;
    public Zivocich(String typ) {
        this.typ = new String(typ);
    }
    public void vypisInfo() {
        System.out.println(typ+ ", ");
        vypisDelku();
    }
    public abstract void vypisDelku();
}

class Ptak extends Zivocich {
    int delkaKridel;
    public Ptak(String typ, int delka) {
        super(typ);
        delkaKridel = delka;
    }
    public void vypisDelku() {
        System.out.println("delka kridel: " +delkaKridel);
    }
}
class Had extends Zivocich {
    int delkaTela;
    public Had(String typ, int delka) {
        super(typ);
        delkaTela = delka;
    }
    public void vypisDelku() {
        System.out.println("delka tela: " +delkaTela);
    }
}
