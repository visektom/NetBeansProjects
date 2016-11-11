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
public class DegToRad {
    
    public static double degToRad(double deg) {
        return deg*Math.PI/180;
    }
    
    public static double radToDeg(double rad) {
        return rad*180/Math.PI;
    }
    
    public static void vypis() {
        System.out.println("Prevod mezi stupni a radiany.\nZvol 1 nebo 2:\n1) prevod stupnu na radiany\n2) prevod radianu na stupne\n");
        Scanner sc = new Scanner(System.in);
        int volba = sc.nextInt();
        if(volba == 1) {
            System.out.println("Zadej stupne:");
            double deg = sc.nextDouble();
            System.out.println(deg+" stupnu je "+DegToRad.degToRad(deg)+" radianu");
        }
        if(volba == 2) {
            System.out.println("Zadej radiany:");
            double rad = sc.nextDouble();
            System.out.println(rad+" radianu je "+DegToRad.radToDeg(rad)+" stupnu");
        }
    }
}
