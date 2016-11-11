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
public class Bojovnik {
    protected String jmeno;
    protected int zivot;
    protected int maxZivot;
    protected int utok;
    protected int obrana;
    protected Kostka kostka;
    private String zprava;
    
    public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }
    
    @Override
    public String toString() {
        return jmeno;
    }
    
    public boolean nazivu() {
        return (zivot>0);
    }

    public void branSe(int uder) {
        int zraneni = uder - (obrana + kostka.hod());
        if(zraneni>0) {
            zivot -= zraneni;
            zprava = String.format("%s utrpel poskozeni %s hp", jmeno, zraneni);
            if (zivot<=0) {
                zivot = 0;
                zprava += " a zemrel";
            }
        }else {
            zprava = String.format("%s odrazil utok", jmeno);
        }
        nastavZpravu(zprava);
    }
    
    public void utoc(Bojovnik souper) {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s utoci s uderem za %s hp", jmeno, uder));
        souper.branSe(uder);
    }
    
    protected void nastavZpravu(String zprava) {
        this.zprava = zprava;
    }
    
    public String vratPosledniZpravu() {
        return zprava;
    }
    
        protected String grafickyUkazatel(int aktualni, int maximalni) {
        String s = "";
        int celkem = 20;
        double pocet = Math.round((double) aktualni / maximalni * celkem);
        
        if((pocet == 0) && (nazivu())) {
            pocet = 1;
        }
        for(int i = 0; i<pocet; i++) {
            s += "█";
        }
        for (int i = 0; i < celkem - pocet; i++) {
            s += " ";
        }
        return s;
    }

    public String grafickyZivot() {
        return grafickyUkazatel(zivot, maxZivot);
    }
}
