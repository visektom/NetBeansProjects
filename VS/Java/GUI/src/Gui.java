import java.util.*;
public class Gui {
    static {Locale.setDefault(Locale.US);}
    public SimpleWindow() {
        
    }
    public static void main(String[] args ) {
        Scanner scan=new Scanner(System.in);
        System.out.println(">>>  START "+Locale.getDefault()+"  # 1  \n");
        
        String s=scan.nextLine();
        System.out.println("s="+s);
        
        // int n=scan.nextInt();
        // System.out.println("n="+n);
        
        // double x=scan.nextDouble();
        // System.out.println("x="+x);
        
        System.out.println(">>>  STOP");
    }
}
