/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_kap17;
import java.io.*;
import java.util.*;

class FiltrPripony implements FilenameFilter {
    String maska;
    
    FiltrPripony(String maska) {
        this.maska = maska;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        name.lastIndexOf(maska);
        name.startsWith(name);
        return true;
    }
}
/**
 *
 * @author duck
 */
public class Cviceni_kap17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String aktDir = System.getProperty("user.dir");
        File fileAbs = new File(aktDir, "a.txt");
        File fileRel = new File("TMP" + File.separator + "a.txt");
        File file = new File("a.txt");
        
        File file2 = new File("b.txt");
        File fld = new File("TMP");
        File flds = new File("1/2/3");
        
        if(file2.exists() == true)
            System.out.println("soubor " + file2 + " jiz existuje");
        else
            file2.createNewFile();
        
        if(file2.isFile() == true)
            System.out.println(file2 + " je soubor");

        if(fld.exists() == true)
            System.out.println("Adresar " + fld + " existuje");
        else
            fld.mkdir();
        
        if(fld.isDirectory() == true)
            System.out.println(fld + " je adresar");
        
        if(flds.exists() == true)
            System.out.println("slozky" + flds + " jiz existuji");
        else
            flds.mkdirs();
        
        System.out.println(new Date(file2.lastModified()));
        System.out.println(file2.length());
        System.out.println(new Date(fld.lastModified()));
        System.out.println(fld.length());
        
        file2.renameTo(new File("c.txt"));
        fld.renameTo(new File("TMP-OLD"));
        
        file2.delete();
        fld.delete();
//        new File("c.txt").delete();
//        new File("TMP-OLD").delete();
        
        File file4 = new File(aktDir);
//        String[] jmena = file4.list();
//        
//        for(int i = 0; i<jmena.length; i++)
//            System.out.println(jmena[i]);
        
        File[] files = file4.listFiles();
        
        for(int i = 0; i<files.length; i++)
            System.out.println(files[i].getName() + "\t" + files[i].length());
        System.out.println(System.getProperty("file.encoding"));
        System.getProperties().list(System.out);
        System.out.println(System.currentTimeMillis());
//        System.out.println(aktDir);
//        System.out.println("");
//        System.out.println(fileAbs.getAbsolutePath());
//        System.out.println(fileAbs.getName());
//        System.out.println(fileAbs.getParent());
//        System.out.println(fileAbs.isAbsolute());
//        System.out.println(fileAbs.getAbsoluteFile());
//        System.out.println(fileAbs.canWrite());
//        System.out.println("");
//        System.out.println(fileRel.getAbsolutePath());
//        System.out.println(fileRel.getName());
//        System.out.println(fileRel.getParent());
//        System.out.println("");
//        System.out.println("separator " + File.separator);
//        System.out.println("pathSeparator " + File.pathSeparator);
//        System.out.println(file.exists());
        
        
    }
    
}