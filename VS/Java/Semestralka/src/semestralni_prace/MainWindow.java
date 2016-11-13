/*
 * MainWindow.java
 *
 * Created on 5. zברם 2007, 12:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package semestralni_prace;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * trida vykreslujici okno
 * @author Duck911
 */
public class MainWindow extends JFrame implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
            JButton a = (JButton) e.getSource();
            
            if(a.getName()=="pocitat") {
                vypocet(radky, sloupce);   
            }
        }
    
    /**
     * vytvori novou instanci tridy ManiWindow
     * @param args a
     */
    public static void main(String[] args) {
        new MainWindow();
    }
    
    static JPanel obsah;
    static Menu menu;
    static Nabidka nabidka;
    static MaticovyPole matice;
    
    static int radky = 2;
    static int sloupce = 2;

    /**
     * Konstruktor, vytvori okno JFrame a v nem udela list s menu,
     * pod tim panel s tlacitkem pocitej a pod tim jsou okna pro
     * vepsni cisel zadane matice
     */
    public MainWindow() {
        super("Hodnost Matice");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        obsah = (JPanel) this.getContentPane();
        setSize(500, 500);
        setLocation(400, 0);
        
        menu = new Menu();
        nabidka = new Nabidka(this);
        matice = new MaticovyPole(2,2);
        
        menu.bar.setPreferredSize(new Dimension(20,40));
        nabidka.infoPanel.setPreferredSize(new Dimension(20,20));
        matice.panel.setPreferredSize(new Dimension(30,400));
        
        add(menu.bar, BorderLayout.NORTH);
        add(nabidka.infoPanel, BorderLayout.CENTER);
        add(matice.panel, BorderLayout.SOUTH);
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
    /**
     * metoda pro opetovne vykresleni okna po zadani noveho poctu
     * radku a sloupcu
     * @param radky pocet radku
     * @param sloupce pocet sloupcu
     */
    public static void refresh(int radky, int sloupce) {
        JTextField[][] pole;
        pole = new JTextField[radky][sloupce];
        obsah.removeAll();
        
        matice = new MaticovyPole(radky, sloupce);
        //nabidka = new Nabidka(this);
        menu = new Menu();
        
        for (int i=0; i<radky; i++) {
            for (int j=0; j<sloupce; j++) {
                pole[i][j] = new JTextField();
            }
        }
        
        //setSize(500, 500);
        
        menu.bar.setPreferredSize(new Dimension(20, 40));
        nabidka.infoPanel.setPreferredSize(new Dimension(20, 20));
        matice.panel.setPreferredSize(new Dimension(30, 400));
        
        obsah.add(menu.bar, BorderLayout.NORTH);
        obsah.add(nabidka.infoPanel, BorderLayout.CENTER);
        obsah.add(matice.panel, BorderLayout.SOUTH);
        obsah.updateUI();
        
    }
    
    /**
     * provadi Gaussovu eliminacni metodu, prevadi matici na horni
     * trojuhelnikovy tvar
     * @param matice vstupni matice
     * @return vraci matici prevedenou na horni trojuhelnikovy tvar
     */
    public float[][] GaussovaEl(float [][] matice) {
        for (int i = 0; i < matice.length; i++) {
            for (int j = i+1; j < matice.length; j++) {
                
                for (int k = i+1; ((matice[i][i]==0)&(k<matice.length)); k++) {
                    for (int l = i; l < matice.length; l++) {
                        float pomocna;
                        pomocna = matice[i][l];
                        matice[i][l] = matice[k][l];
                        matice[k][l] = pomocna;
                        
                    }
                }
                
                if(matice[i][i]==0) {
                   i++; 
                }
                
                float nasobitel = matice[j][i]/matice[i][i];  //radkova konstanta
                
                for (int k = 0; k < matice[0].length; k++) {
                    matice[j][k] -= nasobitel*matice[i][k];
                }
            }
            printArray(matice);
        }
        int hodnost = hodnost(matice);
        return matice;
    }
    
    /**
     * metoda, ktera vraci hodnost zadane matice
     * @param matice vstupni matice
     * @return vystupni matice
     */
    public int hodnost(float [][] matice) {
        int radky = matice.length;
        int sloupce = matice[0].length;
        int hodnost = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[i].length; j++) {
                if(matice[i][j]==0) {
                    x++;
                    
                    if(x==matice.length) {
                        y++;
                    }
                    
                }
            }
        }
        hodnost = radky - y;
        return hodnost;
    }
    
    /**
     * metoda, ktera ziska zadana cisla a po stisknuti tlacitka pocitej
     * zobrazi na obrazovce upravy a nakonec vyslednou hodnost matice
     * @param radky pocet radku
     * @param sloupce pocet sloupcu
     */
    public void vypocet(int radky, int sloupce){ 
        
         float cislo;
         float [][] mat;
         mat = new float [radky][sloupce];
         String znak;
      
         for (int i = 0; i < radky; i++) {
             for (int j = 0; j < sloupce; j++) {
                 znak = matice.matice[i][j].getText();
                 cislo = Float.parseFloat(znak);
                 mat [i][j] = cislo;
             }
         }
         
             float [][] m = GaussovaEl(mat);
             int h= hodnost(m);
             JOptionPane.showMessageDialog(null,h);
         
         
    
    }
    
    /**
     * metoda, ktera prevede matici na String a pote vypise na monitor
     * @param matice vstupni matice
     */
    public void printArray(float [][] matice) {
        String retezec = " ";
        
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[i].length; j++) {
                retezec = retezec + String.valueOf(matice[i][j] + " ");
            }
            retezec = retezec + "\n";
        }
        JOptionPane.showMessageDialog(null, retezec);
    }
    
}
