/*
 * Nabidka.java
 *
 * Created on 5. zברם 2007, 11:42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
/**
 *
 * @author Duck911
 */
public class Nabidka extends JComponent {
    
    private JButton pocitat;

    public static JPanel infoPanel;
    
    /** Vytvori panel s tlacitkem pocitej  */
    public Nabidka() {
        ListenerNabidka ln = new ListenerNabidka();
        
        infoPanel = new JPanel();
        pocitat = new JButton();
        pocitat.setText("Pocitej");
        pocitat.setName("pocitat");
        infoPanel.add(pocitat);
        pocitat.addActionListener(ln);
    }
    
}
