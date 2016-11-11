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

/** Reprezentuje kalendář se záznamy */
class Kalendar
{
    /**
     * Slouží pro test viditelnosti, metoda vrátí všechna nastavení celého programu
     * @return Textový řetězec s nastavením celého programu
     */
    public String vratNastaveni()
    {
        String s = "";
        s += String.format("Jazyk: %s\n", Nastaveni.jazyk());
        s += String.format("Barevné schéma: %s\n", Nastaveni.barevneSchema());
        s += String.format("Spustit po startu: %s\n", Nastaveni.spustitPoStartu());
        return s;
    }

}