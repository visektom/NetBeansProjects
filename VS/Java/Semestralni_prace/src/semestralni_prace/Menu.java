/*
 * Menu.java
 *
 * Created on 5. zברם 2007, 11:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author Duck911
 */
public class Menu extends JComponent {
    
     public JMenuBar bar = new JMenuBar();
     private JMenu soubor = new JMenu();
     private JMenu help = new JMenu();
     private JMenuItem zadej = new JMenuItem();
     private JMenuItem konec = new JMenuItem();
     private JMenuItem about = new JMenuItem();
     
    /** Creates a new instance of Menu */
    public Menu() {
        ListenerMenu lm = new ListenerMenu();
        
        soubor.setText("Soubor");
        help.setText("Help");
        
        bar.add(soubor);
        bar.add(help);
        
        zadej.setText("Zadej Matici");
        zadej.setName("zadej");
        zadej.addActionListener(lm);
        soubor.add(zadej);
        
        konec.setText("Konec");
        konec.setName("konec");
        konec.addActionListener(lm);
        soubor.add(konec);
        
        about.setText("About");
        about.setName("about");
        help.add(about);
        about.addActionListener(lm);
        
    }
    
}
