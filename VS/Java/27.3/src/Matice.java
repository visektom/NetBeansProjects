package matice;
import java.io.*;
import java.util.*;

/**
 * <p>Title: Matice</p>
 * <p>Description: Program na pocitani s maticemi</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Zdenek Svecar
 * @version 1.0
 */

public class Matice {
    public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Zadejte rozmer matice neznamych a stisknete Enter:");
    int r = scan.nextInt();
    while(r<2)
    {
     System.out.print("Zadejte cislo vyssi nez 1, prosim");
    r = scan.nextInt();
    }
     double[][] pole, pole4, pole6;
     double[] vpravo, upraven_vpravo, pole2, pole3, pole5;
     int  q=0;
     double[] a = new double[r];
     pole = input(r);
     vpravo = prava_strana(r);

     vystup3(pole);

pole4 = zkopiruj(pole);            //Zkopiruje pole
pole5 = zkopiruj_vpravo(vpravo);   //Zkopiruje vektor pravych stran
     while(q<r)
  {
     pole = zkopiruj(pole4);
     vpravo = zkopiruj_vpravo(pole5);
     if(q>0)
     {
     pole = preskup(pole);

      //vystup3(pole);
      }
   pole4 = zkopiruj(pole);

     byte pocet = 0;
     while(pole.length>1)
    {
      pocet++;    //vyjadruje napr. i pocet hledani neznamych

    //podivat se, jestli na pozici pole[0][0] neni 0, pokud ano, prehodit radky

      //vystup3(pole);
      pole6 = zkopiruj(pole);//vytvorit dlasi pole, kam strcit pole
      pole=uprav_matici_aby_nebyla_nula_na_zacatku(pole);

      //vystup3(pole);
      vpravo=uprav_pravou_stranu_podle_matice(pole6,vpravo);

      //vystup2(vpravo);

      vpravo = upravena_prava_strana( vpravo, pole, pocet );
      pole = vynuluj_pod_prvkem(pole);
      pole = vyber(pole);
    }
      a[q] = spocitej_x(pole, vpravo);
    //vystup2(vpravo);
   q++;
  }
    //vystup2(a);

  otoc_a_vyhod(a);    
  }


    public static double[][] input(int r) {
           Scanner scan = new Scanner(System.in);
     double[][] vstupni_pole = new double [r][r];
       for(byte i=0; i<r; i++)
       {
        for(byte j=0; j<r; j++)
        {
          int y = i+1;
          int z = j+1;
         System. out. print("Zadejte hodnotu prvku na pozici A[" +y+ "," +z+ "]:  ");
         vstupni_pole[i][j] = scan.nextDouble();
        }
    }
        return vstupni_pole;
     }
    public static double[] prava_strana(int r){
         Scanner scan = new Scanner(System.in);
     double[] vektor_pravych_stran = new double [r];
       for(byte i=0; i<r; i++)
       {
          int y = i+1;
         System. out. print("Zadejte hodnotu prvku na pozici B["+y+"]:   ");
         vektor_pravych_stran[i] = scan.nextDouble();
    }
        return vektor_pravych_stran;
     }

    public static double[][] vynuluj_pod_prvkem(double[][] b){
      double[] c = new double[b.length];
      for(int k=0; k<b.length;k++){
        c[k] = b[k][0];    //V c je sloupec 00, 10, 20, ...
      }
      
      for(byte i=1;i<b.length;i++){
          for(byte j=0; j<b.length;j++){
              b[i][j] = c[i]*b[0][j] - b[0][0]*b[i][j];  //chyba: bere pro vypocet
                                                      //nuly z vypoctuu
          }
      }
    return b;
}

    public static double[] upravena_prava_strana(double[] h, double[][] g, byte pocatecni_index)    //vektor pravych stran, matice >> upraveny vektor pravych stran
     {int snizeno_o_1 = pocatecni_index -1;
       for(byte i=pocatecni_index, j=1 ; j<g.length ; i++, j++)
       {
        h[i] = h[snizeno_o_1]*g[j][0] - g[0][0]*h[i];
       }
     return h;
     }



    public static void otoc_a_vyhod(double[] a)
               {
                 double pom;
                 int pulka = a.length/2;
                for(int i=0; i<pulka;i++) //otoci pole kolem svisle osy
                {
                 pom = a[i];
                 a[i] = a[a.length-1-i];
                 a[a.length-1-i] = pom;
                }
                System.out.print("Vektor neznamych: ");
                for(int j=0; j<a.length;j++)
                {
                System.out.print(""+a[j]+"  ");
                }
              System.out.print(".   (Je-li vysledkem NaN, pak soustava nem\u00e1 pr\u00e1v\u011b jedno \u0159e\u0161en\u00ed)");
              }



public static double[][] vyber(double[][] p){
        double[][] c = new double[p.length - 1][p.length - 1];
        int d = 1;
        while (d <= p.length - 1){
          System.arraycopy(p[d], 1, c[d - 1], 0, p.length - 1);
          d++;
        }
        return c;
      }

public static int[][] vynulovana (int[][] a, int ktery_radek, int[][] p)
   {
    for(int j=0;j<a.length;j++)
    {
    p[ktery_radek][j] = a[ktery_radek][j];
    }
   return p;
   }

public static double[][] preskup(double [][] b) {//Preskupi vektory x1, x2, x3  >  x3, x1, x2
   double[][] c = new double[b.length][b.length];
    for(int j = 0; j<b.length; j++){
     c[j][0] = b[j][b.length-1];
    }
    for(int i=0; i<b.length; i++){
     for(int k=1; k<b.length; k++){
      c[i][k] = b[i][k-1];
     }
    }
   return c;
  }

public static double spocitej_x(double[][] a, double[] b)  //Spocita neznamou
  {
   double d = b[b.length-1]/a[0][0];
   return d;
  }

  public static double[][] zkopiruj(double[][] p)
        {
          double[][] c = new double[p.length][p.length];
          byte d = 0;
          while (d < p.length)
          {
            System.arraycopy(p[d], 0, c[d], 0, p.length);
            d++;
          }
          return c;
        }

    public static double[] zkopiruj_vpravo(double[] p)
               {
                 double[] c = new double[p.length];
                 byte d = 0;
                 while (d < p.length)
                 {
                   System.arraycopy(p, 0, c, 0, p.length);
                   d++;
                 }
                 return c;
               }

    public static double[][] uprav_matici_aby_nebyla_nula_na_zacatku(double pole[][]) { //pokud jsou v 1. sloupci same 0, vrati vstupni matici
       byte pocitadlo =0;
          while((pole[0][0]==0)&&(pocitadlo<pole.length)) { //muze byt i "pole.length+1000"
    double nova[][] = new double[pole.length][pole.length];
          
           for(int i=0;i<pole.length-1;i++) {
              for(int j=0;j<pole.length;j++){
               nova[pole.length-1][j] = pole[0][j];
               nova[i][j] = pole[i+1][j];
                    //posouvej radky o 1 nahoru - tady je chyba
              }
          }
            
           for(int i=0;i<pole.length;i++){
              for(int j=0;j<pole.length;j++){
               pole[i][j]=nova[i][j];
             }
           }
            pocitadlo++;
          }
        return pole;
               }
    
    public static double[] uprav_pravou_stranu_podle_matice(double pole[][], double a[])
 {
        byte pocitadlo =0;
           while((pole[0][0]==0)&&(pocitadlo<pole.length)) //muze byt i "pole.length+1000"
           {
             double nova[][] = new double[pole.length][pole.length];
            for(int i=0;i<pole.length-1;i++)
              {
                for(int j=0;j<pole.length;j++)
               {
                 nova[pole.length-1][j] = pole[0][j];
                 nova[i][j] = pole[i+1][j];
               }
              }
              for(int i=0;i<pole.length;i++)
              {
                for(int j=0;j<pole.length;j++)
               {
                 pole[i][j]=nova[i][j];
               }
             }
             pocitadlo++;
           //prava strana zde
          double b[] = new double[a.length];      //tady je asi chyba -nevidi, co je v while cyklu
           for(int m = 0;m<a.length-pole.length;m++)
           {
           b[m]=a[m];
           }
            for(int k=a.length-pole.length;k<a.length-1;k++)
            {
             b[k] = a[k+1];
             b[a.length-1] = a[a.length-pole.length];
            }//vystup2(b);
            for(int l=0;l<a.length;l++)
            {
             a[l]=b[l];
            }
           }
           return a;
 }





  public static void vystup2(double[] a)
           {
            for(int i=0; i<a.length;i++)
            {
             System.out.print(""+a[i]+" , ");
            }
           }
           public static void vystup3(double[][] a)
                        {
                         for(int i=0; i<a.length;i++)
                         {System.out.println("");
                           for(int j=0; j<a.length;j++)
                          System.out.print(""+a[i][j]+" , ");

                         }
                         System.out.println("");
                         System.out.println("");
           }
}