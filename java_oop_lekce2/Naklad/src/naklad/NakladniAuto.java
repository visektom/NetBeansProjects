package naklad;

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
 * Reprezentuje nákladní auto
 * @author devbook.cz
 */
public class NakladniAuto {
    /**
     * Nosnost
     */
    public int nostnost = 3000;
    /**
     * Hmotnost nákladu
     */
    public int hmotnostNakladu = 0;
    
    /**
     * Pokusí se naložit náklad o dané hmotnosti
     * @param hmotnost Hmotnost nakládaného nákladu
     */
    public void naloz(int hmotnost)
    {
        if (hmotnostNakladu + hmotnost <= nostnost)
        {
            hmotnostNakladu += hmotnost; 
        }
    }
    
    /**
     * Pokusí se vyložit náklad o dané hmotnosti
     * @param hmotnost Hmotnost vykládaného nákladu
     */
    public void vyloz(int hmotnost)
    {
        if (hmotnost <= hmotnostNakladu)
        {
            hmotnostNakladu -= hmotnost;
        }
    }

    /**
     * Vypíše kolik je naloženo
     */
    public void vypisNalozeni()
    {
        System.out.printf("V nákladním autě je naloženo %d kg\n", hmotnostNakladu);
    }
}
