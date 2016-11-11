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
	 
	 
package statika;

public class Statika {

    public static void main(String[] args) {
        Uzivatel u = new Uzivatel("Tomáš Marný", "heslojeveslo");
        System.out.printf("ID prvního uživatele: %s\n", u.vratId());
        Uzivatel v = new Uzivatel("Olí Znusinudle", "csfd1fg");
        System.out.printf("ID druhého uživatele: %s\n", v.vratId());
        System.out.printf("Minimální délka hesla uživatele je: %s\n", Uzivatel.vratMinimalniDelkuHesla());
        System.out.printf("Validnost hesla \"heslo\" je: %s\n", Uzivatel.zvalidujHeslo("heslo"));
    }
}
