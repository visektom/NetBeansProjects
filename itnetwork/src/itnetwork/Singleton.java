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
public class Singleton {
//    Databaze db1 = new Databaze("db1", "alois", "hesloVeslo"); 
    Databaze db = Databaze.getInstance();
//    System.out.println(db);
}
