package auta;

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
 * Reprezentuje garáž
 * @author devbook.cz
 */
public class Garaz {
    /**
     * Instance auta, které je v garáži zaparkované
     */
    private Auto auto;
    
    /**
     * Vloží auto do garáže
     * @param auto Auto
     */
    public void vloz(Auto auto)
    {
        this.auto = auto;
    }
    
    /**
     * Vrátí textovou reprezentaci garáže
     * @return Textová reprezentace garáže
     */
    @Override
    public String toString()
    {
        return "V garáži je auto: " + auto.vratSpz();
    }
}
