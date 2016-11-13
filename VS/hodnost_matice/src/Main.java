import java.io.IOException;
import java.util.*;

public class Main {
    static {Locale.setDefault(Locale.US);}
    
    public static int ctiInt() {
        byte[] pole = new byte [20];
        String nacteno;
        int i;
        
        try {
            System.in.read(pole);
            nacteno = new String(pole).trim();
            i = Integer.valueOf(nacteno).intValue();
            return i;        
        }
        catch (IOException e) {
            System.out.println("Chybne nactene cislo!");
            return 0;
        }
    }
    
    public static Matice gem (Matice x){
        
       for (int xs=0; xs<x.prvky.length; xs++){          //eliminovany sloupec              
            for (int r=xs+1; r<x.prvky.length; r++ ){   
            for (int rad= xs+1; (x.prvky[xs][xs]==0)&(rad<x.prvky.length);rad++){  // v pripade, ze je jmenovatel konstanty 0, prohodime radky
                
                for (int i=xs; i<x.prvky.length; i++){
                int pom;
                pom = x.prvky[xs][i];
                x.prvky[xs][i]=x.prvky[rad][i];
                x.prvky[rad][i]=pom;
                
                }
            }
                
            if (x.prvky[xs][xs]==0){                  //v pripade lin zavislosti radku
                xs++;
            }     
                
            float k = x.prvky[r][xs]/x.prvky[xs][xs];           //radkova konstanta
            
            for (int s=0; s<x.prvky[0].length; s++){
                x.prvky[r][s]-= k*x.prvky[xs][s];
                  
            }
            }
       }
        int h = hodnost(x);
    return x;
    
    }
    
    static int hodnost(Matice m){      // Vypocet hodnosti matice
      int r = m.prvky.length;
      int s = m.prvky[0].length;
      int n=0;
      int h=0;
      int x=0;
      
      for (int i=0; i<m.prvky.length; i++){n=0;
        for (int j=0; j<m.prvky[i].length; j++){
            if  (m.prvky[i][j]==0){n++;
                             if (n==m.prvky.length) h++;} 
        }
      }x=r-h; 
      return x;
      
    }
        
    
    static Matice X;
    
    public static void main(String[] args ) {
        System.out.println("Pocet radku");
        int radky = ctiInt();
        System.out.println("Pocet sloupcu");
        int sloupce = ctiInt();
        X = new Matice(radky, sloupce);
        
        X.fillByUser();
        X.printArray();
        
        gem(X);
        System.out.println("--------------------------------------------\n\n");
        System.out.println("Hodnost zadane matice je: " +hodnost(X));

    }
}
