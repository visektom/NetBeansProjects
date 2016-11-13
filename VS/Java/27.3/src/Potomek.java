/*
 * Potomek.java
 *
 * Created on 29. kvìten 2007, 21:51
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */

abstract class Rodic {
    public int i;
    public Rodic() {i = 1;}
    abstract int getI();
    final void setI(int noveI) {i = noveI;}
}
interface info {
    void kdoJsem();
}
interface Object {
    public int obj();
}

public class Potomek extends Rodic implements Object, info {
    int getI() {return i*2;}
    void setI() {i = 5;}
    public void kdoJsem() {}
    public int obj() {return i;}
    public static void main(String [] args) {
      //Rodic rod = new Rodic();
        Potomek pot = new Potomek();
    }
    
}
