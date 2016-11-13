package semestralni_prace;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * Menu.java
 *
 * Created on 12. zברם 2007, 14:34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
    /**
     * trida, ktera vytvori listu s polozkami Matice a Help
     */
    public class Menu extends JComponent {
        protected JMenuBar bar = new JMenuBar();
        protected JMenu soubor = new JMenu();
        protected JMenu help = new JMenu();
        protected JMenuItem zadej = new JMenuItem();
        protected JMenuItem konec = new JMenuItem();
        protected JMenuItem about = new JMenuItem();
        
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
