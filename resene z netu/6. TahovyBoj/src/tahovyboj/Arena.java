	/*
	 *	       __          __                __            
	 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
	 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
	 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
	 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
	 *                                                   
	 *                                                           
	 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
	 * 
	 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
	 *	sociální síti DEVBOOK.CZ	
	 *	
	 *	Kód můžete upravovat pod licencí MIT, 
	 *	tedy jak chcete, jen zmiňte odkaz na www.devbook.cz :-) 
	 */

package tahovyboj;

public class Arena {
    /** První bojovník v aréne */
    private Bojovnik bojovnik1;
    /** Druhý bojovník v aréně */
    private Bojovnik bojovnik2;
    /** Hrací kostka */
    private Kostka kostka;

    /**
     * Vytvoří novou instanci arény
     * @param bojovnik1 První bojovník v aréne
     * @param bojovnik2 Druhý bojovník v aréně
     * @param kostka Hrací kostka
     */
    public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kostka kostka)
    {
        this.bojovnik1 = bojovnik1;
        this.bojovnik2 = bojovnik2;
        this.kostka = kostka;            
    }

    /** Simuluje zápas bojovníků */
    public void zapas()
    {
            // původní pořadí
            Bojovnik b1 = bojovnik1;
            Bojovnik b2 = bojovnik2;
            System.out.println("Vítejte v aréně!");
            System.out.printf("Dnes se utkají %s s %s! \n\n", bojovnik1, bojovnik2);
            // prohození bojovníků
            boolean zacinaBojovnik2 = (kostka.hod() <= kostka.vratPocetSten() / 2);
            if (zacinaBojovnik2)
            {
                    b1 = bojovnik2;
                    b2 = bojovnik1;
            }
            System.out.printf("Začínat bude bojovník %s! \n\nZápas může začít...", b1);

            // cyklus s bojem
            while (b1.nazivu() && b2.nazivu())
            {
                    b1.utoc(b2);
                    vykresli();
                    vypisZpravu(b1.vratPosledniZpravu()); // zpráva o útoku
                    vypisZpravu(b2.vratPosledniZpravu()); // zpráva o obraně
                    if (b2.nazivu())
                    {
                            b2.utoc(b1);
                            vykresli();
                            vypisZpravu(b2.vratPosledniZpravu()); // zpráva o útoku
                            vypisZpravu(b1.vratPosledniZpravu()); // zpráva o obraně
                    }
                    System.out.println();
            }
    }

    /** Vykreslí informační obrazovku */
    private void vykresli()
    {
        System.out.println("-------------- Aréna -------------- \n");
        System.out.println("Zdraví bojovníků: \n");
        System.out.printf("%s %s\n", bojovnik1, bojovnik1.grafickyZivot());
        System.out.printf("%s %s\n", bojovnik2, bojovnik2.grafickyZivot());
    }

    /**
     *  Vypíše zprávu do konzole s dramatickou pauzou
     * @param zprava Zpráva
     */
    private void vypisZpravu(String zprava)
    {
        System.out.println(zprava);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Chyba, nepovedlo se uspat vlákno!");
        }
    }
}