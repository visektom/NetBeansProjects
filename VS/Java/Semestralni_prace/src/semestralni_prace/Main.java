/*
 * Main.java
 *
 * Created on 1. leden 2007, 18:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package semestralni_prace;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 *
 * @author Tomas Visek
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
   
        
     Scanner sc = new Scanner(System.in);   
     
    
    int volba,volba2;
    float[][] m1 = vstup1();        // vstup matice 1
       
    float[][] m2 = vstup2();        // vstup matice 2
    
    System.out.println("Zadane matice:");
    System.out.println("Matice 1");
    vypisMatice (m1);
    System.out.flush();
    System.out.println("Matice 2");
    vypisMatice (m2);
    

    
    System.out.println("Vyberte co chcete s maticemi udelat:"); // Menu
    System.out.println("1) Secist");
    System.out.println("2) Odecist");
    System.out.println("3) Vynasobit");
    System.out.println("4) Vypocitat determinant");
    System.out.println("5) Vypsat transponovanou matici");
    System.out.println("6) Vypsat inverzni matici");
    
    
    
    volba=sc.nextInt();         // vyhodnoceni menu
    if (volba== 1) { 
        System.out.println("Soucet matic je:");  
    float[][] m3 = soucetMatic(m1, m2);
    vypisMatice(m3);
   
    }
    if (volba== 2) {    
        System.out.println("Rozdil matic je:");
    float[][] m3 = rozdilMatic(m1, m2);
    vypisMatice(m3);
    }
    
     
    if (volba== 3) { 
            System.out.println("Soucin matic je:");
            float[][] m3 = soucinMatic(m1, m2);
            vypisMatice(m3);}
       
    if (volba== 4) {FileWriter out = new FileWriter("vystup.txt"); 
                     System.out.println("Pro vypocet determinantu matice 1 stisknete 1.");
                     System.out.println("Pro vypocet determinantu matice 2 stisknete 2.");
                     System.out.println("Pro vypocet determinantu obou matic stisknete 3.");
                     volba2=sc.nextInt();
                     if (volba2==1){
                         float det1= determinant(m1);
                         System.out.println("Determinant matice 1 = " + det1);
                         out.write(String.valueOf(det1));
                         out.close();
                        }
                    
                     if (volba2==2){
                         float det2= determinant(m2);
                         System.out.println("Determinant matice 2 = " + det2);
                         out.write(String.valueOf(det2));
                         out.close();
                        }
                     if (volba2==3){
                         float det1= determinant(m1);
                         float det2= determinant(m2);
                         System.out.println("Determinant matic 1 a 2 = " + det1 +" a " + det2);
                         out.write(String.valueOf(det1));
                         out.write("\r\n\r\n");
                         out.write(String.valueOf(det2));
                         out.close();
                        }
                     
                    }
    if (volba==5) {FileWriter out = new FileWriter("vystup.txt"); 
                     System.out.println("Pro vypsani transponovane matice k matici 1 stisknete 1.");
                     System.out.println("Pro vypsani transponovane matice k matici 2 stisknete 2.");
                     volba2=sc.nextInt();
                     if (volba2==1){
                         float [][] m3 = transponovana(m1);
                         System.out.println("Transponovane matice k matici 1 = ");
                         vypisMatice(m3);}
                                                 
                    
                     if (volba2==2){
                        float [][] m3 = transponovana(m2);
                         System.out.println("Transponovana matice k matici 2 = ");
                         vypisMatice(m3);}
                        }
   
  if (volba==6) {FileWriter out = new FileWriter("vystup.txt"); 
                     System.out.println("Pro vypsani inverzni matice k matici 1 stisknete 1.");
                     System.out.println("Pro vypsani inverzni matice k matici 2 stisknete 2.");
                     System.out.println("Pro vypsani inverznich matic k maticim 1 a 2 stisknete 3.");
                     volba2=sc.nextInt();
                     if (volba2==1){
                         float [][] m3 = inverzni(m1);
                         System.out.println("Inverzni matice k matici 1 = ");
                         vypisMatice(m3);}
                                                 
                    
                     if (volba2==2){
                        float [][] m3 = inverzni(m2);
                         System.out.println("Inverzni matice k matici 2 = ");
                         vypisMatice(m3);}
                        
                     if (volba2==3){
                         float [][] m3= inverzni(m1);
                         float [][] m4= inverzni(m2);
                         System.out.println("Inverzni matice k maticim 1 a 2 jsou :");
                         vypisMatice(m3);
                         System.out.println("");
                         System.out.println("");
                         vypisMatice(m4);}
                }
                     
                    
    }
        
   static float[][] ctiMatici1() { // Naètení matice 1 do dvourozmìrného pole
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadejte pocet radku a pocet sloupcu matice 1");
    System.out.flush();
    int r1 = sc.nextInt();
    int s1 = sc.nextInt();
       float[][] m = new float[r1][s1];
       
    try{
        System.out.println("zadejte matici "+r1+"x"+s1);   // ošetøení chybného zadání
    for (int i=0; i<r1; i++)
      for (int j=0; j<s1; j++)
        m[i][j] = sc.nextInt();}catch(InputMismatchException e){System.out.println("Chyba zadani");}
    return m;}
    
  
static float[][] ctiMatici2() {  // Naètení matice 2 do dvourozmìrného pole
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadejte pocet radku a pocet sloupcu matice 2");
    System.out.flush();
    int r2 = sc.nextInt();
    int s2 = sc.nextInt();
    float[][] m = new float[r2][s2];
    try{// ošetøení chybného zadání
    System.out.println("zadejte matici "+r2+"x"+s2);   
    for (int i=0; i<r2; i++)
      for (int j=0; j<s2; j++)
        m[i][j] = sc.nextInt();}catch(InputMismatchException e){System.out.println("Chyba zadani");}
    return m;}
  
  static float[][] soucetMatic(float[][] m1, float[][] m2) {  // Souèet matic
    int r = m1.length;
    int s = m1[0].length;
    float[][] m = new float[r][s];
    for (int i=0; i<r; i++)
      for (int j=0; j<s; j++)
        m[i][j] = m1[i][j]+m2[i][j];
    return m;
  }

   static float[][] rozdilMatic(float[][] m1, float[][] m2) {   // Rozdil matic
    int r = m1.length;
    int s = m1[0].length;
    float[][] m = new float[r][s];
    for (int i=0; i<r; i++)
      for (int j=0; j<s; j++)
        m[i][j] = m1[i][j]-m2[i][j];
    return m;
  }
  
  
  static void vypisMatice(float[][] m) throws Exception {    // Vypis matice na obrazovku a do souboru
    FileWriter out = new FileWriter("vystup.txt");
      for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[i].length; j++){
       System.out.print(m[i][j]+" ");
       out.write(String.valueOf(m[i][j]));
       out.write(" ");
             }
      out.write("\r\n");
      System.out.println("");
          }out.close();
    
  }
  static float[][] transponovana(float[][] m){      // Vypocet transponovane matice
      int r = m.length;
      int s = m[0].length;
      float[][] tr = new float[r][s];
      for (int i=0; i<m.length; i++) {
        for (int j=0; j<m[i].length; j++){
            tr[i][j]= m[j][i];
        }
      } return tr;
  } 
  
  static float[][] soucinMatic(float[][] m1, float[][] m2) {        // Soucin matic
   
    int r = m1.length;
    int s = m1[0].length;
    int r1 = m1.length;
    int s1 = m1[0].length;
    int r2 = m2.length;
    int s2 = m2[0].length;
     
    float[][] m = new float[r][s];
    soucin:{  if (r1!=s2)   break soucin;    // Ošetøení možnosti výpoètu souèinu matic
    for(int i=0; i<r1; i++){
           for(int j=0; j<s2; j++){
              for(int k=0; k<r1; k++){
                  m[i][j] += m1[i][k]*m2[k][j];
                }
            }            
        }
  
    return m;
  }System.out.println("Pocet radku matice 1 neni stejny jako pocet sloupcu matice 2!!!"); 
   return m;
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
    }System.out.println("Matice neni ctvercova, determinant nelze spocitat!!!"); 
   return det;
               
}                   
         static float[][] doplnek (float[][] m1)  throws Exception{
      int rm = m1.length;
      float m[][] = new float [rm][rm];
      int ii, jj, im1, jm1;
      float det;
      for (int i = 0; i < rm; i++)
           for (int j = 0; j < rm; j++) {
                im1 = jm1 = 0;
		float mp[][] = new float[rm - 1][rm - 1];   //pomocna matice o 1 mensi
		for (ii = 0; ii < rm; ii++) {
			for (jj = 0; jj < rm; jj++) {
				if ((ii != i) && (jj != j)) {   //testuje zda prvek patri do doplnku
					mp[im1][jm1] = m1[ii][jj];
					jm1++;
						}
					}
				if ((ii != i) && (jj != j)) {
					im1++;
					}
				jm1 = 0;
				}
				det = determinant(mp);      
				m[i][j] = (float) Math.pow(-1, i + j) * det;    //vytvori matici doplnku
			}
		m = transponovana(m);
      return m;
  }
              
         static float[][] inverzni(float[][] m1)throws Exception{       //vypocet inverzni matice
		// inv(A) = 1/det(A) * doplnek(A)
        int rm = m1.length;
		float m[][] = new float[rm][rm];
       inverzni:{  if (m1.length!=m1[0].length)   break inverzni;    // Ošetøení možnosti výpoètu inv matice
                float md[][] = doplnek(m1);
                float detx = determinant(m1);
		float dd = 0;
		if (detx == 0) 
			System.out.println("Nelze invertovat.");
		else 
                    dd = 1 / detx;  // nasobeni prevracenou hodnotou det
		for (int i = 0; i < rm; i++)
			for (int j = 0; j < rm; j++) 
				m[i][j] = dd * md[i][j];    //det * doplnky
		return m;}
    
    System.out.println("Matice neni ctvercova, inverzni matici nelze spocitat!!!");
         return m;}
         
   
         public static float[][] nacti1() throws Exception {   // Nacteni m1 ze souboru
        Scanner sc = new Scanner(System.in);
        
        String nazev = "vstup1.txt";
        BufferedReader in = new BufferedReader(new FileReader(nazev));
        int i = Integer.valueOf(in.readLine());
        int j = Integer.valueOf(in.readLine());
        float [][]x= new float [i][j];
        for (int r=0;r<x.length;r++){
            for (int s =0; s<x[0].length;s++){
                x[r][s]= Float.valueOf(in.readLine());
            }
        }
        
        in.close();
        return x;
    }
public static float[][] vstup1()throws Exception{    // Vstup m1, zde uzivatel rozhoduje zda matici cist ze souboru nebo zadat
        Scanner sc = new Scanner(System.in);
        System.out.println("Vstup matice 1:");
        System.out.println("Zadejte 1 pro nacteni matice ze souboru");
        System.out.println("Zadejte 2 pro zadani matice rucne");
        int volba = sc.nextInt();
        while ((volba!=1)&(volba!=2)){
            System.out.println("Zadejte 1 nebo 2!");
            volba = sc.nextInt();
        }    
        if (volba==1){
            float[][]x=nacti1();
            return x;
        }else{
            float[][]x=ctiMatici1();
            return x;
        }
    }
 public static float[][] nacti2() throws Exception {         // Nacteni m2 ze souboru
        Scanner sc = new Scanner(System.in);
        
        String nazev = "vstup2.txt";
        BufferedReader in = new BufferedReader(new FileReader(nazev));
        int i = Integer.valueOf(in.readLine());
        int j = Integer.valueOf(in.readLine());
        float [][]x= new float [i][j];
        for (int r=0;r<x.length;r++){
            for (int s =0; s<x[0].length;s++){
                x[r][s]= Float.valueOf(in.readLine());
            }
        }
        
        in.close();
        return x;
    }
public static float[][] vstup2()throws Exception{  // Vstup m2, zde uzivatel rozhoduje zda matici cist ze souboru nebo zadat
        Scanner sc = new Scanner(System.in);
        System.out.println("Vstup matice 2:");
        System.out.println("Zadejte 1 pro nacteni matice ze souboru");
        System.out.println("Zadejte 2 pro zadani matice rucne");
        int volba = sc.nextInt();
        while ((volba!=1)&(volba!=2)){
            System.out.println("Zadejte 1 nebo 2!");
            volba = sc.nextInt();
        }    
        if (volba==1){
            float[][]x=nacti2();
            return x;
        }else{
            float[][]x=ctiMatici2();
            return x;
        }
    }
 int hodnost(float[][] m){      // Vypocet hodnosti matice
      int r = m.length;
      int s = m[0].length;
      int n=0;
      int h= r;
      for (int i=0; i<m.length; i++){n=0; System.out.println(n);
        for (int j=0; j<m[i].length; j++){
            if  (m[j][i]==0){ n++; System.out.println("n v if"+ n);
                                if (n==m.length) h--; System.out.println("h"+h);} 
        }
      } return h;
 }
}