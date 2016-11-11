/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentaktraining;

/**
 * priklad z itnetworks.cz; http://www.itnetwork.cz/java/oop/java-resene-priklady-oop/
 * @author duck
 */
public class Kalkulacka {
    
    public double num1;
    public double num2;
    
    public Kalkulacka(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double add() {
        double res=0;
        
        res=num1+num2;
        System.out.println("Soucet je: " +res);
        
        return res;
    }
    
    public double subtract() {
        double res=0;
        
        res=num1-num2;
        System.out.println("Rozdil je: " +res);
        
        return res;
    }
    
    public double multiply() {
        double res=0;
        
        res=num1*num2;
        System.out.println("Soucin je: " +res);
        
        return res;
    }
    
    public double divide() {
        double res=0;
        
        res=num1/num2;
        System.out.println("Podil je: " +res);
        
        return res;
    }
    
}
