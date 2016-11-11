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
	 
	 
package statickenastaveni;


/** Třída reprezentuje statický registr s nastavneím programu */
class Nastaveni
{
    /** Jazyk programu, hodnoty: CZ, SK, EN */
    private static String jazyk = "CZ";
    /** Barevné schéma, hodnoty: celene, cervene, modre */
    private static String barevneSchema = "cervene";
    /** Spuštění aplikace po startu operačního systému */
    private static boolean spustitPoStartu = true;

    /**
     * Vrátí jazyk programu
     * @return Jazyk programu
     */
    public static String jazyk()
    {
        return jazyk;
    }

    /**
     * Vrátí barevné schéma
     * @return Barevné schéma
     */
    public static String barevneSchema()
    {
        return barevneSchema;
    }

    /**
     * Vrátí, zda se má program spustit při startu operačního systému
     * @return True pokud ano, jinak False
     */
    public static boolean spustitPoStartu()
    {
        return spustitPoStartu;
    }

}
