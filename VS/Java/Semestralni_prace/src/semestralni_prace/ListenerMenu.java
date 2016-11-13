/*
 * ListenerMenu.java
 *
 * Created on 5. záøí 2007, 11:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Duck911
 */
public class ListenerMenu implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        JMenuItem a = (JMenuItem) e.getSource();
        int pom = 0;
        if(a.getName()=="zadej") pom = 1;
        if(a.getName()=="konec") pom = 2;
        if(a.getName()=="about") pom = 3;
        
        switch(pom) {
            case 1:  break;
            case 2: System.exit(0); break;
            case 3: JOptionPane.showMessageDialog(null, "Created by Tomas Visek, Semestral Project PJV - LS 2007 ©"); break;
            default: System.out.println("Chyba tlacitka");;
            
        }
            
    }
    
}
