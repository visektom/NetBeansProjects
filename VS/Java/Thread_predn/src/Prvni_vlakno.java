public class Prvni_vlakno extends Thread{
    public Prvni_vlakno (String moje){
        super(moje);
    }
    public void run() {
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i + ". " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Probuzen brzo");
            }
        }
    }
    public static void main(String[] args ) {
        Prvni_vlakno ahoj = new Prvni_vlakno("ahoj");
        ahoj.start();
        new Prvni_vlakno("zdarec").start();
        new Prvni_vlakno("ciao").start();
    }
}
