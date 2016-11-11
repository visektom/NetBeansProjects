package lide;

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
 * Reprezentuje člověka
 * @author devbook.cz
 */
public class Clovek {
    
    /**
     * Celé jméno
     */
    private String jmeno;
    /**
     * Věk
     */
    private int vek;
    /**
     * Únava
     */
    private int unava = 0;
    
    /**
     * Inicializuje novou instanci
     * @param jmeno Celé jméno
     * @param vek Věk
     */
    public Clovek(String jmeno, int vek)
    {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    /**
     * Spí danou dobu
     * @param doba Doba v hodinách
     */
    public void spi(int doba)
    {
        unava -= doba * 10;
        if (unava < 0)
            unava = 0;
    }
    
    /**
     * Uběhne danou vzdálenost
     * @param vzdalenost Vzdálenost v Km
     */
    public void behej(int vzdalenost)
    {
        if (unava + vzdalenost <= 20)
            unava += vzdalenost;
        else
            System.out.println("Jsem příliš unavený");
    }

    /// <summary>
    /// Vrátí textovou reprezentaci člověka
    /// </summary>
    /// <returns>textová reprezentace člověka</returns>
    @Override
    public String toString()
    {
        return String.format("%s (%d)", jmeno, vek);
    }
}
