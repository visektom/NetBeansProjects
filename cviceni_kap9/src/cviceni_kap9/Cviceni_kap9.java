/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni_kap9;

/**
 *
 * @author duck
 */
public class Cviceni_kap9 extends Object {

    static byte[] bajty = {(byte)'e', (byte)'v', (byte)'a'};
    static char[] znaky = {'M', 'a', 'r', 't', 'i', 'n', 'a'};
    static StringBuffer buf = new StringBuffer("bry den");
    
    static String s1 = new String("cao");
    static String s2 = new String(s1);
    static String s3 = new String(bajty);
    static String s4 = new String(bajty, 1, 2);
    static String s5 = new String(znaky);
    static String s6 = new String(znaky, 3, 4);
    static String s7 = new String(buf);
    static String s8 = new String("Ahoj");
    static String s9 = new String("Ahoi");
    static String s10 = new String("AHOJ");
    static String s11 = new String("mala a VELKA");
    static String s12 = new String("\r\n\t Hoj \t\r\n");
    static String s13 = new String("\r\n\t Hoj \t\r\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(s1+s2);
        System.out.println(s3.concat(s3));
        System.out.println(s8.compareTo(s9));
        System.out.println(s9.compareTo(s8));
        System.out.println(s10.toLowerCase());
        System.out.println(s9.toUpperCase());
        System.out.println(s8.equals(s8));
        System.out.println(bajty[0]);
        System.out.println(bajty[1]);
        System.out.println(bajty[2]);
        System.out.println(znaky[0]);
        System.out.println(znaky[1]);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println(s1.replace('c', 'g'));
        System.out.println(s5.substring(1, 4));
        System.out.println(s5.charAt(2));
        System.out.println(s11.indexOf('a'));
        System.out.println(s11.lastIndexOf('a'));
        s13 = s12.trim();
        System.out.println("Zacatek:" + s12 + ":konec");
        System.out.println("Zacatek:" + s13 + ":konec");
        
        boolean b = true;
        int i = 1234567;
        double d = Math.PI;
        String s = String.valueOf(b);
        System.out.println("s: "+s);
        s = String.valueOf(i);
        System.out.println("i: "+s);
        s = String.valueOf(d);
        System.out.println("d: "+s);
        i = s.indexOf('.');
        s = s.substring(0, i+6);
        System.out.println("s: "+s);
        
        int j = 225;
        System.out.println(j+" binarne: "+Integer.toBinaryString(j));
        System.out.println(j+" osmickove: "+Integer.toOctalString(j));
        System.out.println(j+" hexa: "+Integer.toHexString(j));
        
        StringBuffer b1, b2, b3;
        b1 = new StringBuffer();
        b2 = new StringBuffer(100);
        b3 = new StringBuffer("Ahoj");
        System.out.println("b1: "+b1+" delka: "+b1.length()+" kapacita "+b1.capacity());
        System.out.println("b2: "+b2+" delka: "+b2.length()+" kapacita "+b2.capacity());
        System.out.println("b3: "+b3+" delka: "+b3.length()+" kapacita "+b3.capacity());
        b1.ensureCapacity(36);
        b2.setLength(220);
        System.out.println("b1: "+b1+" delka: "+b1.length()+" kapacita "+b1.capacity());
        System.out.println("b2: "+b2+" delka: "+b2.length()+" kapacita "+b2.capacity());
        System.out.println("b3: "+b3+" delka: "+b3.length()+" kapacita "+b3.capacity());
        b3.reverse();
        System.out.println("obracene: "+ b3);
        b3.append(" wurst");
        System.out.println("append: "+ b3);
        b3.delete(3, 6);
        System.out.println("delete: "+ b3);
        b3.deleteCharAt(4);
        System.out.println("delete char: "+ b3);
        b3.insert(3, "an w");
        System.out.println("insert: "+ b3);
        b3.replace(6, 10, "wurst");
        System.out.println("replace: "+ b3);
        System.out.println("charAt: "+ b3.charAt(1));
        b3.setCharAt(1, 'x');
        System.out.println("setChar: "+ b3);
        String s14 = b3.toString();
        System.out.println("s: "+s14);
        String s15 = b3.substring(1);
        System.out.println("s: "+s15);
        String s16 = b3.substring(1, 7);
        System.out.println("s: "+s16);
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('\u0BE7'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetterOrDigit('/'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isWhitespace('\r'));
        char e = 'a';
        System.out.println(Character.toUpperCase(e));
        int a = Character.digit('3', 10);
        int c = Character.digit('F', 16);
        System.out.println(a);
        System.out.println(c);
        int z = (int)'X';
        System.out.println(z); 
        if(buf instanceof StringBuffer)
            System.out.println("1");
        else
            System.out.println("0");
        int[] pole = new int[4];
//        int[] pole = {1, 2, 3, 4, 5};
//        pole = new int[5];
//        pole = {1, 2, 3, 4, 5};
        System.out.println(""+pole.length);
        for(int k = 0; k<pole.length; k++) {
            System.out.println(pole[i]);
        }
    }
    
}
