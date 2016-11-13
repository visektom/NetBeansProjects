/*
 * Okynko.java
 *
 * Created on 29. kvìten 2007, 18:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Okynko extends JFrame implements ActionListener {
    JButton btn1 = new JButton("OK");
    JButton btn2 = new JButton("OK");
    /** Creates a new instance of Okynko */
    public Okynko() {
        setLayout(new BorderLayout());
        setSize(333,333);
        getContentPane().add(btn1, BorderLayout.WEST);
        getContentPane().add(btn2, BorderLayout.SOUTH);
        setVisible(true);
        
        b.addActionListener(new ActionListener) {
            public void actionPerformed(ActionEvent e){;
        }}
    }
    public void actionPerformed(ActionEvent e) {
        
    }
    
   public static void main(String [] args) {
       Okynko okno = new Okynko();
   }
    
}
