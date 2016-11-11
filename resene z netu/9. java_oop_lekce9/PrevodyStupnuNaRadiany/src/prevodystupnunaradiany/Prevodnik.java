package prevodystupnunaradiany;

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
 * Obsahuje pomocné metody pro převod mezi radiány a stupni
 * @author devbook.cz
 */
public class Prevodnik {
        
    /**
     * Převede radiány na stupně
     * @param radiany Hodnota v radiánech
     * @return Hodnota ve stupních
     */
    public static double radianyNaStupne(double radiany)
    {
        return radiany * 180 / Math.PI;
    }
    
    /**
     * Převede stupně na radiány
     * @param stupne Hodnota ve stupních
     * @return Hodnota v radiánech
     */
    public static double stupneNaRadiany(double stupne)
    {
        return stupne * Math.PI / 180;
    }
}
