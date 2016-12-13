/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itnetwork;
import java.sql.*;

/**
 *
 * @author duck
 */
public class Databaze {
    private String nazev;
    private String uzivatel;
    private String heslo;
    private static Databaze db;
    
    private Databaze(String nazev, String uzivatel, String heslo) {
        this.nazev = nazev;
        this.uzivatel = uzivatel;
        this.heslo = heslo;
    }
    
    public static Databaze getInstance() {
        if(db == null) {
            db = new Databaze("MySQL", "root", "root");
        }
        return db;
    }
    
    @Override
    public String toString() {
        return String.format("%s", getNazev());
    }

    /**
     * @return the nazev
     */
    public String getNazev() {
        return nazev;
    }
}
