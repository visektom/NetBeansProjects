/*
 * MaticovyPole.java
 *
 * Created on 5. zברם 2007, 15:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Duck911
 */
public class MaticovyPole extends JComponent {
        
    JTextField [][] maticovyPole;
    static JPanel panel;
    
    /** Creates a new instance of MaticovyPole */
    public MaticovyPole(int radky, int sloupce) {
        
        panel = new JPanel();
        maticovyPole = new JTextField[radky][sloupce];
        GridLayout srg = new GridLayout(radky,sloupce);
        panel.setLayout(srg);
        
        for(int i=0; i<radky; i++){
            for(int j=0; j<sloupce; j++){
                maticovyPole[i][j] = new JTextField();
                panel.add(maticovyPole[i][j]);
            }
        }
    }
    
    public void refresh(int radky, int sloupce) {
        JTextField [][] maticovyPole;
        maticovyPole = new JTextField[radky][sloupce];
        MainWindow.obsah.removeAll();
        MainWindow.pole = new MaticovyPole(radky, sloupce);
        MainWindow.nabidka = new Nabidka();
        MainWindow main= new MainWindow();
        
        for (int i=0; i < radky; i++) {
            for (int j=0; j < sloupce; j++) {
                maticovyPole[i][j] = new JTextField();
            }
        }
        
        setSize(500,500);
        
    }
}
