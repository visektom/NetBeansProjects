package rodokmeny;

/*
 *  _____ _______         _                      _              
 * |_   _|__   __|       | |                    | |             
 *   | |    | |_ __   ___| |___      _____  _ __| | __  ___ ____
 *   | |    | | '_ \ / _ \ __\ \ /\ / / _ \| '__| |/ / / __|_  /
 *  _| |_   | | | | |  __/ |_ \ V  V / (_) | |  |   < | (__ / / 
 * |_____|  |_|_| |_|\___|\__| \_/\_/ \___/|_|  |_|\_(_)___/___|
 * 
 * IT ZPRAVODAJSTVÍ  <>  PROGRAMOVÁNÍ  <>  HW A SW  <>  KOMUNITA
 * 
 * Tento zdrojový kód je součástí výukových seriálů na 
 * IT sociální síti WWW.ITNETWORK.CZ	
 *	
 * Kód spadá pod licenci prémiového obsahu a vznikl díky podpoře
 * našich členů. Je určen pouze pro osobní užití a nesmí být šířen.
 *
 */

/**
 * Reprezentuje rodokmen určité osoby
 * @author devbook.cz
 */
public class Rodokmen {
    /**
     * Kořen rodokmenu, tedy osoba, pro kterou se vypisuje
     */
    private Osoba koren;
    
    /**
     * Inicializuje instanci
     * @param koren Osoba, která je kořenem rodokmenu
     */
    public Rodokmen(Osoba koren)
    {
        this.koren = koren;
    }

    /**
     * Vypíše osobu a předky osoby
     * @param osoba Osoba
     */
    private void vypisOsobuAPredky(Osoba osoba)
    {
        if (osoba != null)
        {
            System.out.println(osoba);
            vypisOsobuAPredky(osoba.otec);
            vypisOsobuAPredky(osoba.matka);
        }           
    }

    /// <summary>
    /// Vypíše rodokmen
    /// </summary>
    public void vypis()
    {
        System.out.println("Rodokmen pro osobu " + koren);
        vypisOsobuAPredky(koren);
    }
}
