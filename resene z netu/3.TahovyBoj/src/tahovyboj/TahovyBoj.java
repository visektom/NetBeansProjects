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

public class TahovyBoj {

    public static void main(String[] args) {
        // vytvoření
        Kostka sestistenna = new Kostka();
        Kostka desetistenna = new Kostka(10);

        // hod šestistěnnou
        System.out.println(sestistenna);
        for (int i = 0; i < 10; i++)
            System.out.print(sestistenna.hod() + " ");

        // hod desetistěnnou
        System.out.println("\n\n" + desetistenna);
        for (int i = 0; i < 10; i++)
            System.out.print(desetistenna.hod() + " ");
    }
}
