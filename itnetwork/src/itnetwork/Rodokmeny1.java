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
public class Rodokmeny1 {
    private Osoby1 aktualniOsoba;
    
    public Rodokmeny1() {
    Osoby1 abraham = new Osoby1("Abraham Simpson");
    Osoby1 penelope = new Osoby1("Penelope Olsen");
    Osoby1 bouvier = new Osoby1("Pan Bouvier");
    Osoby1 jackie = new Osoby1("Jackie Bouvier");
    Osoby1 herb = new Osoby1("Herb Powers");
    Osoby1 homer = new Osoby1("Homer Simpson");
    Osoby1 marge = new Osoby1("Marge Bouvier");
    Osoby1 selma = new Osoby1("Selma Bouvier");
    Osoby1 bart = new Osoby1("Bart Simpson");
    herb.otec = abraham;
    herb.matka = penelope;
    homer.otec = abraham;
    homer.matka = penelope;
    marge.otec = bouvier;
    marge.matka = jackie;
    selma.otec = bouvier;
    selma.matka = jackie;
    bart.otec = homer;
    bart.matka = marge;
//    bart.otec.otec = abraham;
//    bart.otec.matka = penelope;
//    bart.matka.otec = bouvier;
//    bart.matka.matka = jackie;
    aktualniOsoba = homer;
//    aktualniOsoba.otec = abraham;
//    aktualniOsoba.matka = penelope;
    }
    
    public void getBart() {
        System.out.println(aktualniOsoba.otec +""+ aktualniOsoba.matka);
    }
    
    public void getHomer() {
        System.out.println("Rodokmen pro osobu "+aktualniOsoba+" je:\n"+aktualniOsoba+"\n"+aktualniOsoba.otec+"\n"+aktualniOsoba.matka+"\n");
    }
    
    public void getOsoba(String jmeno) {
        Rodokmeny1 r = new Rodokmeny1();
        Osoby1 o = new Osoby1("");
        if(jmeno == "Abraham Simpson" || jmeno == "Penelope Olsen" || jmeno == "Pan Bouvier" || jmeno == "Jackie Bouvier") {
            System.out.println("Rodokmen neni dostupny!");
        }else if(jmeno == "Herb Powers" && aktualniOsoba.otec == o) {
            aktualniOsoba = r.herb;
        }
//        System.out.println("Rodokmen pro osobu "+aktualniOsoba+" je:\n"+aktualniOsoba+"\n"+aktualniOsoba.otec+"\n"+aktualniOsoba.matka+"\n");
    }
//    @Override
//    public String toString() {
//        return String.format("Rodokmen pro osobu je:");
//    }
    
//    public void vypisOsoby(String osoba) {
//        System.out.println(aktualniOsoba);
//        System.out.println("Rodokmen pro osobu "+osoba+" je:\n"+aktualniOsoba.otec);
//        System.out.println(osoba);
//    }
}
