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
public class Hra {
    private Lokace aktualniLokace;
    
    public Hra() {
        Lokace hrad = new Lokace("Hrad", "Stojis pred starym hradem tycicim se nad krajinou. Vrata jsou zavrena, zkus zabusit, treba Ti nekdo otevre!");
        Lokace les1 = new Lokace("Les", "Jsi na lesni ceste, ktera se klikati za za obzor, kde mizi v siluete zapadajiciho slunce. Ticho podvecerniho lesa obcas prerusi zpev poslednich ptaku.");
        Lokace les2 = new Lokace("Lesni rozcesti", "Nachazis se na lesnim rozcesti.");
        Lokace les3 = new Lokace("Hluboky les", "Nachazis se v hlubokem lese. Okolo tebe je husta hradba stromu, kterou se klikati sotva znatelna cesta.");
        Lokace rybnik = new Lokace("Rybnik", "Dosel jsi ke brehu maleho rybnika. Hladina je v bezvetri jako zrcadlo. Kousek od tebe je drevene molo se stavidlem.");
        Lokace les4 = new Lokace("Lesni mytinka", "Dosel jsi na lesni mytinku, ktera se hemzi lesni zveri.");
        Lokace dum = new Lokace("Mestecko", "Objevil jsi male mestecko uprostred lesa. Vypada to, ze tam je celkem zivo.");
        hrad.vychod = les1;
        les1.zapad = hrad;
        les1.vychod = les2;
        les2.zapad = les1;
        les2.vychod = les3;
        les2.jih = les4;
        les3.zapad = les2;
        les3.vychod = rybnik;
        rybnik.zapad = les3;
        les4.sever = les2;
        les4.vychod = dum;
        dum.zapad = les4;
        aktualniLokace = les2;
    }
    public void zpracujPrikaz(String prikaz) {
        prikaz = prikaz.toLowerCase();
        if(prikaz.startsWith("jdi")) {
            if(prikaz.endsWith("sever") && aktualniLokace.sever != null) {
                aktualniLokace = aktualniLokace.sever;
            }else if(prikaz.endsWith("jih") && aktualniLokace.jih != null) {
                aktualniLokace = aktualniLokace.jih;
            }else if(prikaz.endsWith("vychod") && aktualniLokace.vychod != null) {
                aktualniLokace = aktualniLokace.vychod;
            }else if(prikaz.endsWith("zapad") && aktualniLokace.zapad != null) {
                aktualniLokace = aktualniLokace.zapad;
            }
                System.out.println("Timto smerem nelze jit!\n");
        
        }else if(!prikaz.equals("konec")) {
            System.out.println("Muj slovnik neobsahuje tento prikaz!");
        }
    }
    /**
     * @return the aktualniLokace
     */
    public Lokace getAktualniLokace() {
        return aktualniLokace;
    }
}
