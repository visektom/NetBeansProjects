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

package referencnitypy;


public class Uzivatel {
    /** Věk uživatele v letech */
    public int vek;
    /** Jméno a příjmení uživatele */
    public String jmeno;

    /**
     * Vytvoří novou instanci uživatele
     * @param jmeno Jméno a příjmení
     * @param vek Věk v letech
     */
    public Uzivatel(String jmeno, int vek)
    {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    /** Vrátí textovou reprezentaci uživatele */
    @Override
    public String toString()
    {
        return jmeno;
    }
}
