/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itnetwork;
import java.util.Scanner;

/**
 *
 * @author duck
 */
public class Itnetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Trida Clovek
//        Clovek typek = new Clovek("Karel Varel");
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
//        typek.run(10);
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
//        typek.run(10);
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
//        typek.run(10);
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
//        typek.sleep(2);
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
//        typek.run(10);
//        System.out.println(typek.getJmeno()+" ("+typek.getUnava()+")");
        //Trida NahodneVety
//        NahodneVety veta = new NahodneVety();
//        for(int i=0; i<10; i++) {
//            veta.createSentence();
//        }
        //Trida Auto
//        Garaz garaz = new Garaz();
//        Auto kchar = new Auto("1SR3931", "Stribrna");
//        kchar.zaparkuj(garaz);
//        System.out.println(garaz);
        //Tridy Osoba, Pes
//        Pes alik = new Pes("Alik", 1);
//        System.out.println(alik);
//        Osoba karel = new Osoba("Karel", alik);
//        Osoba lenka = new Osoba("Lenka", alik);
//        karel.pes.zestarni(1);
//        lenka.pes.zestarni(1);
//        System.out.println(karel.pes);
//        System.out.println(lenka.pes);
        //Trida Lokace, Hra
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tato hra slouzi jako cviceni k pouziti referenci.\n"
//                + "Muzes prochazet virtualnim svetem pomoci textovych prikazu jako \"jdi na vychod/zapad/sever nebo jih.\"\n"
//                + "Hru ukoncis prikazem \"konec.\"\n");
//        Hra hra = new Hra();
//        String prikaz = "";
//        while(!prikaz.equalsIgnoreCase("konec")) {
//            System.out.println(hra.getAktualniLokace());
//            System.out.println("Zadej prikaz:");
//            prikaz = sc.nextLine();
//            hra.zpracujPrikaz(prikaz);
//        }
       //Trida Rodokmen, Rodokmeny, Osoby
//       Rodokmeny1 houmrovi = new Rodokmeny1();
//       houmrovi.getBart();
//       houmrovi.getHomer();
//       houmrovi.getOsoba("Homer Simpson");
//       System.out.println(houmrovi);
//        Osoby abraham = new Osoby("Abraham Simpson", null, null);
//        Osoby penelope = new Osoby("Penelope Olsen", null, null);
//        Osoby pan = new Osoby("Pan Bouvier", null, null);
//        Osoby jackie = new Osoby("Jackie Bouvier", null, null);
//        Osoby herb = new Osoby("Herb Powers", abraham, penelope);
//        Osoby homer = new Osoby("Homer Simpson", abraham, penelope);
//        Osoby marge = new Osoby("Marge Simpson", pan, jackie);
//        Osoby selma = new Osoby("Selma Bouvier", pan, jackie);
//        Osoby bart = new Osoby("Bart Simpson", homer, marge);
//        Rodokmen rdkHomer = new Rodokmen(homer);
//        Rodokmen rdkBart = new Rodokmen(bart);
//        rdkHomer.vypis();
//        System.out.println("");
//        rdkBart.vypis();
//      Trida DegToRad
//        DegToRad.vypis    ();
//      Trida Factory, Cukrovi
//        System.out.println(Factory.bananove());
//        System.out.println(Factory.bananove());
//        System.out.println(Factory.bananove());
//        System.out.println(Factory.bananove());
//        System.out.println(Factory.jahodove());
//        System.out.println(Factory.jahodove());
//        System.out.println(Factory.jahodove());
//        System.out.println(Factory.cokoladove());
//        System.out.println(Factory.cokoladove());
//      Trida Singleton, Databaze
        Databaze db = Databaze.getInstance();
        System.out.println(db);
        System.out.println(db.getNazev());
    }
}