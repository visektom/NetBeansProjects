package kamaradi;

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
    public String jmeno;    
    /**
     * Věk
     */
    public int vek;
    /**
     * Kamarád
     */
    public Clovek kamarad;

    /**
     * Vypíše text, ve kterém se človek představí
     */
    public void predstavSe()
    {
        System.out.printf("Ahoj, já jsem %s, je mi %d let a můj kamarád je %s\n", jmeno, vek, kamarad.jmeno);
    }
    
}
