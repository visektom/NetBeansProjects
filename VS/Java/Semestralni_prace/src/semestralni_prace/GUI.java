/*
 * GUI.java
 *
 * Created on 15. srpen 2007, 12:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package semestralni_prace;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 *
 * @author Tomas Visek
 */
public class GUI extends JFrame{
    public static void main(String[] args) {
        new GUI();
    }
 
    
    JPanel content;
    Info info;
    Pole matice;
    Menu menu;
    
    int r=2;
    int s=2;
 
    public GUI (){
        super("Hodnost Matice");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        content = (JPanel) this.getContentPane();
        setSize(500,500);
        setLocation(400,0); 
                
        matice = new Pole(r, s);
        info = new Info();
        menu = new Menu();
       
        menu.menubar.setPreferredSize(new Dimension(20,40));
        info.infoPanel.setPreferredSize(new Dimension(20,20));    
        matice.panel.setPreferredSize(new Dimension(30,400));
        
        add(menu.menubar, BorderLayout.NORTH);
        add(info.infoPanel, BorderLayout.CENTER);
        add(matice.panel, BorderLayout.SOUTH);
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
  
    class Menu extends JComponent{
     private JMenuBar menubar = new JMenuBar();
     private JMenu matice = new JMenu();
     private JMenu help = new JMenu();
     private JMenuItem zadej = new JMenuItem();
     private JMenuItem konec = new JMenuItem();
     private JMenuItem about = new JMenuItem();
     
    
     public Menu(){
     PosluchacMysMenu pmenu = new PosluchacMysMenu();
     
      matice.setText("Matice");
      help.setText("Help");
      menubar.add(matice);
      menubar.add(help);
      

      zadej.setText("Zadej matici");
      zadej.setName("zadej");
      konec.setText("Konec");
      konec.setName("konec");
      
      matice.add(zadej);
      
      zadej.addActionListener(pmenu);
      matice.add(konec);
      konec.addActionListener(pmenu);
      about.setText("About");
      about.setName("about");
      help.add(about);
      about.addActionListener(pmenu); 
     }
    }
    class Info extends JComponent{
     private int cas = 0;
     private JButton pocitej;
     private JLabel label;
     private JPanel infoPanel;
     ButtonGroup soustava= new ButtonGroup();
      JRadioButton radio1;
      JRadioButton radio2;
      
         
     public Info()
     {    
      infoPanel = new JPanel();
      pocitej = new JButton();
      pocitej.setText("pocitej");
      pocitej.setName ("pocitej");
      radio1 = new JRadioButton();
      radio2 = new JRadioButton();
      radio1.setText ("Hodnost matice");
      radio1.setName ("radio1");
      radio1.setSelected(true);
      radio2.setText ("Determinant");
      radio2.setName ("radio2");
      soustava.add(radio1);
      soustava.add(radio2);
    
      label = new JLabel();
      label.setText("Co chces pocitat?");
      PosluchacMysInfo pmi = new PosluchacMysInfo(radio1, radio2);
      pocitej.addActionListener(pmi);
      GridLayout srg = new GridLayout(1,3);
      infoPanel.setLayout(srg);
      infoPanel.add(pocitej);
      infoPanel.add(label);
      infoPanel.add(radio1);
      infoPanel.add(radio2);
     }
                    
    } 
    class Pole extends JComponent{
     
        
     JTextField [][] pole;
     JPanel panel;
     
      public Pole(int r,int s) {
         float cislo;
   
      panel = new JPanel();
      pole = new JTextField[r][s];
      GridLayout srg = new GridLayout(r,s);
      panel.setLayout(srg); 
      for(int i=0;i<r;i++){
         for(int j=0;j<s;j++){
            pole[i][j] = new JTextField();
         
            panel.add(pole[i][j]);
             
               }} 
      
      }
    }
    
    public void obnov(int r, int s){
     JTextField [][] pole;
     pole = new JTextField[r][s];
     content.removeAll();
     matice = new Pole(r, s);
     info = new Info();
     menu = new Menu();
        for(int i=0;i<r;i++){
         for(int j=0;j<s;j++){
            pole[i][j] = new JTextField();
         
         }}
     setSize(500, 500);
     menu.menubar.setPreferredSize(new Dimension(20,40));
     info.infoPanel.setPreferredSize(new Dimension(20,20));    
     matice.panel.setPreferredSize(new Dimension(30,400));
        
     content.add(menu.menubar, BorderLayout.NORTH);
     content.add(info.infoPanel, BorderLayout.CENTER);
     content.add(matice.panel, BorderLayout.SOUTH);
     content.updateUI();
        
           }
    
    class PosluchacMysMenu implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JMenuItem a = (JMenuItem) e.getSource();
            int pom = 0;
            if(a.getName()=="ctidet") pom = 1;
            if(a.getName()=="ctimat") pom = 2;
            if(a.getName()=="zadej") pom = 3;
            if(a.getName()=="konec") pom = 4;
            if(a.getName()=="about") pom = 5;
            
            switch(pom) 
            { case 1: 
                
                       // Nacteni m ze souboru
        Scanner sc = new Scanner(System.in);
        
        String nazev = "vstup1.txt";
                    BufferedReader in;
                    try { 
                        in = new BufferedReader(new FileReader(nazev));
                        int u = Integer.valueOf(in.readLine());
                        int v = Integer.valueOf(in.readLine());
                        float [][]x= new float [u][v];
                        obnov (u,v);
                        for (int r=0;r<x.length;r++){
                            for (int s =0; s<x[0].length;s++){
                                
                                x[r][s] = Float.valueOf(in.readLine());
                                matice.pole[r][s].setText("" + x[r][s]);

                            }}

                        float det=1;
                        determinant:{  if (x.length!=x[0].length)   break determinant;    // Ošetøení možnosti výpoètu determinantu
                        int r = x.length;
                        int s = x[0].length;
                        if (r == 2)         // poukd matice je 2x2 výpoèet probíhá souèinem hodnot na diagonálách
                        {
                            det = x[0][0]*x[1][1] - x[1][0]*x[0][1];
                            JOptionPane.showMessageDialog(null, det); 
                        }
                        else  {for (int xs=0; xs<x.length; xs++){          //Gaussova eliminace na horni trojuhelnikovou matici              
                        for (r=xs+1; r<x.length; r++ ){   
                        for (int rad= xs+1; (x[xs][xs]==0)&(rad<x.length);rad++){                      // kdyz jmenovatel konstanty= 0, prohodime radky
                
                        for (int i=xs; i<x.length; i++){
                            float pomoc;
                            pomoc = x[xs][i];
                            x[xs][i]=x[rad][i];
                            x[rad][i]=pom;
                            }
                    }
                
                    if (x[xs][xs]==0){                  //v pripade lin zavislosti radku
                    xs++;
                    }     
                
                    float k = x[r][xs]/x[xs][xs];           //radkova konstanta
            
                    for (s=0; s<x[0].length; s++){
                    x[r][s]-= k*x[xs][s];
                }   
            }
            }
            
          }
                                            
         for (int i=0; i<r; i++){
            for (int j=0;j<s ; j++){
               if (i==j) det = det* x[i][j];
            }
         }
   
        }
    
            JOptionPane.showMessageDialog(null,"Hodnota determinantu matice je: " + det); 
                        in.close();
                
                    
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }           
                             break;
                             
                case 2:
                            // Nacteni m ze souboru
                    String nazev2 = "vstup2.txt";
                    BufferedReader in2;
                     try {
                        in2 = new BufferedReader(new FileReader(nazev2));
                        int u = Integer.valueOf(in2.readLine());
                        int v = Integer.valueOf(in2.readLine());
                        float [][]x= new float [u][v];
                        obnov (u,v);
                        for (int r=0;r<x.length;r++){
                            for (int s =0; s<x[0].length;s++){
                                 x[r][s] = Float.valueOf(in2.readLine());
                                
                                 matice.pole[r][s].setText("" + x[r][s]);
                          }
                        }
                        
                        in2.close();
        
                        for (int xs=0; xs<x.length; xs++){          //eliminovany sloupec              
                        for (int r=xs+1; r<x.length; r++ ){   
                        for (int rad= xs+1; (x[xs][xs]==0)&(rad<x.length);rad++){                      // v pripade, ze je jmenovatel konstanty 0, prohodime radky
                
                            for (int i=xs; i<x.length; i++){
                            float pom2;
                                pom2 = x[xs][i];
                                x[xs][i]=x[rad][i];
                                x[rad][i]=pom2;
                
                                    }
                                }
                
                    if (x[xs][xs]==0){                  //v pripade lin zavislosti radku
                        xs++;
                                    }     
                
                        double k = x[r][xs]/x[xs][xs];           //radkova konstanta
            
                        for (int s=0; s<x[0].length; s++){
                            x[r][s]-= k*x[xs][s];
                        }
                    }   vypisMatice(x);
           }
    
            int h=hodnost(x);
            JOptionPane.showMessageDialog(null,"Hodnost matice je: " + h);
    
        
                     } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                     } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                     } catch (IOException ex) {
                        ex.printStackTrace();
                     }   
                    
                    
                            break;
                case 3: 
                    String pocetr = JOptionPane.showInputDialog(null, "Zadejte pocet radku: ");
                    r = Integer.parseInt(pocetr);
                    
                    String pocets = JOptionPane.showInputDialog(null, "Zadejte pocet sloupcu: ");
                    s = Integer.parseInt(pocets);
                    
                    obnov (r,s);
                    
                    break;    
                    
                    
                case 4: System.exit(0); break;
                case 5: JOptionPane.showMessageDialog(null, "Created by Tomas Visek, Semestral Project PJV - LS 2007 ©");
                default: System.out.println("Chyba tlacitka");
                }
            }
    
    }
    
    class PosluchacMysInfo implements ActionListener{
    JRadioButton radio1;
    JRadioButton radio2;
     
        public PosluchacMysInfo (JRadioButton radio1, JRadioButton radio2)
        {this.radio1= radio1;
         this.radio2= radio2;
        }
        public void actionPerformed(ActionEvent e) {
      vypocet(r,s,radio1);
                            }
    }
    
    public void vypocet(int r, int s, JRadioButton radio1){ 
        
         float cislo;
         float [][] x;
         x=new float [r][s];
         String znak;
      
      for(int i=0;i<r;i++){
         for(int j=0;j<s;j++){
                
                znak=matice.pole[i][j].getText();
                cislo= Float.parseFloat(znak);
                x [i][j] = cislo;
            } }
    if (radio1.isSelected()==false) {
        float det= determinant (x) ;
        System.out.println(det);
         JOptionPane.showMessageDialog(null,"Hodnota determinantu matice je : "+det );}
    else if (radio1.isSelected()==true){   
         float [][] m = gem(x);
            
         int h= hodnost(m);
        JOptionPane.showMessageDialog(null,h);
    }
    }
    
    
    static float determinant(float [][] m1) {
    float det=1;
    determinant:{  if (m1.length!=m1[0].length)   break determinant;    // Ošetøení možnosti výpoètu determinantu
    int r = m1.length;
    int s = m1[0].length;
    if (r == 2)                               // pokud matice je 2x2 výpoèet probíhá souèinem hodnot na diagonálách
       {
        det = m1[0][0]*m1[1][1] - m1[1][0]*m1[0][1];
        
        return det;
    }
    else  {for (int xs=0; xs<m1.length; xs++){          //Gaussova eliminace na horni trojuhelnikovou matici              
                for (r=xs+1; r<m1.length; r++ ){   
                    for (int rad= xs+1; (m1[xs][xs]==0)&(rad<m1.length);rad++){                      // kdyz jmenovatel konstanty= 0, prohodime radky
                
                        for (int i=xs; i<m1.length; i++){
                            float pom;
                            pom = m1[xs][i];
                            m1[xs][i]=m1[rad][i];
                            m1[rad][i]=pom;
                            }
                    }
                
                    if (m1[xs][xs]==0){                  //v pripade lin zavislosti radku
                    xs++;
                    }     
                System.out.println(r-xs);
            float k = m1[r][xs]/m1[xs][xs];           //radkova konstanta
            
            for (s=0; s<m1[0].length; s++){
                m1[r][s]-= k*m1[xs][s];
            }
         }
       }
            
    }
                                            
         for (int i=0; i<r; i++){
            for (int j=0;j<s ; j++){
               if (i==j) det = det* m1[i][j];}
         }
       
    return det;
    }
   JOptionPane.showMessageDialog(null,"Matice neni ctvercova, determinant nelze spocitat!!!");
               
               return det;
} 
    
    
    
     public float[][] gem (float [][]x){
       //int d=1;
        
       for (int xs=0; xs<x.length; xs++){          //eliminovany sloupec              
            for (int r=xs+1; r<x.length; r++ ){   
            for (int rad= xs+1; (x[xs][xs]==0)&(rad<x.length);rad++){           // v pripade, ze je jmenovatel konstanty 0, prohodime radky
                
                for (int i=xs; i<x.length; i++){
                float pom;
                pom = x[xs][i];
                x[xs][i]=x[rad][i];
                x[rad][i]=pom;
                
                }
            }
                
            if (x[xs][xs]==0){                  //v pripade lin zavislosti radku
                xs++;
            }     
                
            float k = x[r][xs]/x[xs][xs];           //radkova konstanta
            
            for (int s=0; s<x[0].length; s++){
                x[r][s]-= k*x[xs][s];
                  
            }
            }vypisMatice(x);
       }
        int h = hodnost(x);
    return x;
    
    }

    int  hodnost(float[][] m){      // Vypocet hodnosti matice
      int r = m.length;
      int s = m[0].length;
      int n=0;
      int h=0;
      int x=0;
      
      for (int i=0; i<m.length; i++){n=0;
        for (int j=0; j<m[i].length; j++){
            if  (m[i][j]==0){n++;
                             if (n==m.length) h++;} 
        }
      }x=r-h; 
      return x;
      
    }

    static void vypisMatice(float[][] m)  {    // Vypis matice na obrazovku a do souboru
    String matice=" ";
      for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[i].length; j++){
       
       matice = matice + String.valueOf(m[i][j]+"  ");
       }
      matice = matice + "\n";
     }
         JOptionPane.showMessageDialog(null,matice);
          }
}
