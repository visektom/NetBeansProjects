package semestralni_prace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * ListenerMenu.java
 *
 * Created on 12. záøí 2007, 14:37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
    /**
     * listener, ktery provede ukony po vybrani polozky z menu
     */
    class ListenerMenu implements ActionListener {
            
        public void actionPerformed(ActionEvent e) {
            JMenuItem a = (JMenuItem) e.getSource();
            int pom = 0;
            if(a.getName()=="zadej") pom = 1;
            if(a.getName()=="konec") pom = 2;
            if(a.getName()=="about") pom = 3;
        
            switch(pom) {
                case 1: String pocetRadku = JOptionPane.showInputDialog(null, "Zadejte pocet radku: ");
                    MainWindow.radky = Integer.parseInt(pocetRadku);
                    
                    String pocetSloupcu = JOptionPane.showInputDialog(null, "Zadejte pocet sloupcu: ");
                    MainWindow.sloupce = Integer.parseInt(pocetSloupcu); 
                    
                    MainWindow.refresh(MainWindow.radky, MainWindow.sloupce); 
                    break;                   
                    
                case 2: System.exit(0); break;
                case 3: JOptionPane.showMessageDialog(null, "Created by Tomas Visek, Semestral Project PJV/LS - 2007 ©"); break;
                default: System.out.println("Error!");;
            
            }
        }
    }
