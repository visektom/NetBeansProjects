/*
 * Okno.java
 *
 * Created on 21. kvìten 2007, 9:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;

public class Okno extends JFrame {
    
    /**
     * Design GUI.
     */
    public Okno() {
        super("Hodnost Matice");
        setSize(500, 400);
        Container cont = getContentPane();
        setVisible(true);
        cont.setBackground(new Color(0,0,255));
        
        BorderLayout border = new BorderLayout();
        Panel nahore = new Panel();
        cont.add(nahore, border.NORTH);
        
        
        
        JLabel matice = new JLabel("Matice:");
        JLabel radky = new JLabel("radky");
        nahore.add(matice);
        nahore.add(radky);
        JLabel sloupce = new JLabel("sloupce");
        nahore.add(sloupce);
        getContentPane().add(nahore, border.NORTH);
    }
    
    public static void main(String [] args) {
        Okno win = new Okno();
    }
}
