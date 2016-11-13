public class Vlakno2 extends Thread{

    public void run() {
        while (ReadVl.hotovo = false) {
            System.out.println(ReadVl.suma + "\r");
            Thread.yield();
        }
        System.out.println(ReadVl.suma);
    }
    
    public static void main(String[] args ) {
        ReadVl v1Cteni = new ReadVl("data.txt");
        v1Cteni.start();
        Vlakno2 v1Vypis = new Vlakno2();
        v1Vypis.start();
    }
}
