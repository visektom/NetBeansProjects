/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author duck
 */
public class Mag extends Bojovnik {
    private int mana;
    private int maxMana;
    private int magickyUtok;
    
    public Mag(String jmeno, int zivot, int utok, int obrana, Kostka kostka, int mana, int magickyUtok) {
        super(jmeno, zivot, utok, obrana, kostka);
        this.mana = mana;
        this.maxMana = mana;
        this.magickyUtok = magickyUtok;
    }
    
    @Override
    public void utoc(Bojovnik souper) {
        if(mana<maxMana) {
            mana += 10;
            if(mana>maxMana) {
                mana = maxMana;
            }
                super.utoc(souper);
        }else {
            int uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s použil magii za %s hp", jmeno, uder));
            souper.branSe(uder);
            mana = 0;
        }
        
    }
    
    public String grafickaMana() {
        return grafickyUkazatel(mana, maxMana);
    }
}
