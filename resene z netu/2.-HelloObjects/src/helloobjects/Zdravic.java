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


package helloobjects;

/** Třída reprezentuje zdravič, který slouží ke zdravení uživatelů */
class Zdravic
{
	/** Text pozdravu */
	public String text;

	/**
	 * Pozdraví uživatele textem pozdravu a jeho jménem
	 * @param  jmeno  Jméno uživatele
	 * @return      Text s pozdravem
	 */
	public String pozdrav(String jmeno)
	{
		return String.format("%s %s", text, jmeno);
	}

}
