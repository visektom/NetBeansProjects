/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author duck
 */
public class Arena {
    private Bojovnik bojovnik1;
    private Bojovnik bojovnik2;
    private Kostka kostka;
    private int kolo = 1;
    
    public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kostka kostka) {
        this.bojovnik1 = bojovnik1;
        this.bojovnik2 = bojovnik2;
        this.kostka = kostka;
    }
    
    private void vypisZpravu(String zprava) {
        System.out.println(zprava);
        try {
            Thread.sleep(500);
        }catch(InterruptedException ex) {
            System.err.println("Chyba, nepovedlo se uspat vlákno");
        }
    }
    
    public void zapas() {
        // puvodni poradi
        Bojovnik b1 = bojovnik1;
        Bojovnik b2 = bojovnik2;
        System.out.println("Vítejte v aréně!");
        System.out.printf("Dnes se utkají %s s %s! \n\n", bojovnik1, bojovnik2);
        
        // prohození bojovníků
        boolean zacinaBojovnik2 = (kostka.hod() <= kostka.getPocetSten() / 2);
        if (zacinaBojovnik2)
        {
                b1 = bojovnik2;
                b2 = bojovnik1;
        }
        System.out.printf("Začínat bude bojovník %s! \n\nZápas může začít...", b1);
        
        while (b1.nazivu() && b2.nazivu()) {
                b1.utoc(b2);
                vykresli();
                vypisZpravu(b1.vratPosledniZpravu()); // zpráva o útoku
                vypisZpravu(b2.vratPosledniZpravu()); // zpráva o obraně
               
                if(b2.nazivu()) {
                    b2.utoc(b1);
                    vykresli();
                    vypisZpravu(b2.vratPosledniZpravu()); // zpráva o útoku
                    vypisZpravu(b1.vratPosledniZpravu()); // zpráva o obraně
                }
                System.out.println();
        }
    }
    
    private void vypisBojovnika(Bojovnik b) {
        System.out.println(b);
        System.out.print("Zivot: ");
        System.out.println(b.grafickyZivot());
        if (b instanceof Mag)
        {
                System.out.print("Mana:  ");
                System.out.println(((Mag)b).grafickaMana());
        }
    }
    
    private void vykresli() {
        System.out.println("\n"
                + "   __    ____  ____  _  _    __   \n"
                + "  /__\\  (  _ \\( ___)( \\( )  /__\\  \n"
                + " /(__)\\  )   / )__)  )  (  /(__)\\ \n"
                + "(__)(__)(_)\\_)(____)(_)\\_)(__)(__)\n");
        System.out.println("Zacina "+kolo+". kolo\nBojovnici: \n");
        vypisBojovnika(bojovnik1);
        System.out.println();
        vypisBojovnika(bojovnik2);
        System.out.println();
        kolo++;
    }
}
