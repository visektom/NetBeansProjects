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

/** Třída reprezentující uživatele systému */
class Uzivatel
{
    /** Celé jméno uživatele i s příjmením */
    private String jmeno;
    /** Heslo uživatele */
    private String heslo;
    /** Slouží k ukládání, zda je uživatel přihlášený či nikoli */
    private boolean prihlaseny;
    /** Unikátní ID uživatele */
    private int id;
    /** Minimální délka hesla */
    private static int minimalniDelkaHesla = 6;
    /** Id pro další instanci uživatele */
    private static int dalsiId = 1;

    /**
     * Vytvoří novou instanci uživatele
     * @param jmeno Celé jméno uživatele i s příjmením
     * @param heslo Heslo uživatele
     */
    public Uzivatel(String jmeno, String heslo)
    {
        this.jmeno = jmeno;
        this.heslo = heslo;
        prihlaseny = false;
        // přiřazení ID
        id = dalsiId;
        dalsiId++;
    }

    /**
     * Přihlásí uživatele do systému
     * @param zadaneHeslo heslo zadané člověkem u počítače
     * @return True při úspěšném přihlášení, false při špatném hesle
     */
    public boolean prihlasSe(String zadaneHeslo)
    {
        if (zadaneHeslo.equals(heslo)) // kontrola hesla
        {
            prihlaseny = true;
            return true;
        }
        else
            return false; // hesla nesouhlasí
    }

    /**
     * Vrátí minimální délku hesla
     * @return Minimální délka hesla
     */
    public static int vratMinimalniDelkuHesla()
    {
        return minimalniDelkaHesla;
    }

    /**
     * Zvaliduje zadané heslo
     * @param heslo Heslo k validaci
     * @return True při validním hesle, jinak false
     */
    public static boolean zvalidujHeslo(String heslo)
    {
        if (heslo.length() >= minimalniDelkaHesla)
        {
            // podrobnou logiku validace hesla vynecháme
            return true;
        }
        return false;
    }

    /**
     * Vrátí id uživatele
     * @return Id uživatele
     */
    public int vratId()
    {
        return id;
    }

}