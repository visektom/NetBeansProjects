package semestralni_prace;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * MaticovyPole.java
 *
 * Created on 12. zברם 2007, 14:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
/**
 * trida, ktera vytvori spodni cast, kam se zadaji cisla matice
 */
class MaticovyPole extends JComponent {
    JTextField [][] matice;
    JPanel panel;
    
    public MaticovyPole(int radky, int sloupce) {
        
        panel = new JPanel();
        matice = new JTextField[radky][sloupce];
        GridLayout srg = new GridLayout(radky,sloupce);
        panel.setLayout(srg);
        
        for(int i=0; i<radky; i++){
            for(int j=0; j<sloupce; j++){
                matice[i][j] = new JTextField();
                panel.add(matice[i][j]);
            }
        }
    }
}