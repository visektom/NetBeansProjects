/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readvl;
import java.io.*;
/**
 *
 * @author duck
 */
public class ReadVl extends Thread {
    FileReader fr;
    BufferedReader in;
    String jmenoSouboru;
    public static int suma = 0;
    public static boolean hotovo = false;
    
    ReadVl(String jmeno) {
        super("Vlakno pro cteni");
        jmenoSouboru = jmeno;
    }
    
    public void run() {
        String radka;
        
        try {
            fr = new FileReader(jmenoSouboru);
            in = new BufferedReader(fr);
            while((radka = in.readLine()) != null) {
                suma += Integer.valueOf(radka).intValue();
                Thread.yield();
            }
            fr.close();
            hotovo = true;
                            
        } catch (IOException e) {
            System.out.println("Chyba v souboru!");
            hotovo = true;
        }
    }
    
static class Thread2 extends Thread {
    public Thread2(String jmeno) {
        super(jmeno);
    }
        
    public void run() {
        while(ReadVl.hotovo == false) {
            System.out.println(ReadVl.suma);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Vzbudili jste me brzy!");
            }
            
        }
        System.out.println(ReadVl.suma);
    }
}
    
static class Thread3 implements Runnable {
    private Thread zobrazVl = null;
    
    public void start() {
        zobrazVl = new Thread(this);
        zobrazVl.start();
    }
    
    public void run() {
        while(ReadVl.hotovo == false) {
            System.out.println(ReadVl.suma);
            
//            try {
                Thread.yield();
//            } catch(InterruptedException e) {
//                System.out.println("Probudili jste me brzy!");
//            }
        }
        System.out.println(ReadVl.suma);
    }
}

static class CreateFile {
    String fileName;
    File f1;
    FileWriter fwr;
        
    public CreateFile(String fileName) throws IOException {
        f1 = new File(fileName);
        f1.createNewFile();
    }
        
    public void wrLines(int lineCount) throws IOException {
        fwr = new FileWriter(f1);

        for(int i = 0; i<lineCount; i++) {
            fwr.write(i+1+"\n");
        }
        fwr.close();
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CreateFile file = new CreateFile("data.txt");
        file.wrLines(10000);
        
        ReadVl vlCteni = new ReadVl("data.txt");
        vlCteni.start();
        Thread3 vlVypis = new Thread3();
        vlVypis.start();
        
        
    }
    
}
