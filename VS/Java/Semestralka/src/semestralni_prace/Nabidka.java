package semestralni_prace;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Nabidka.java
 *
 * Created on 12. zברם 2007, 14:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
    /**
     * trida, ktera vytvori listu s tlacitkem pocitej
     */
    public class Nabidka extends JComponent {
        protected JButton pocitat;
        protected JPanel infoPanel;
        
        public Nabidka(MainWindow mw) {
            //ListenerNabidka ln = new ListenerNabidka();
        
            infoPanel = new JPanel();
            pocitat = new JButton();
            pocitat.setText("Pocitej");
            pocitat.setName("pocitat");
            infoPanel.add(pocitat);
            pocitat.addActionListener(mw);
        }
    }
