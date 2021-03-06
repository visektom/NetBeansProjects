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
 * Reprezentuje auto
 * @author devbook.cz
 */
public class Auto {
    
    /**
     * SPZ
     */
    private String spz;    
    /**
     * Barva
     */
    private String barva;
    
    /**
     * Inicializuje novou instanci
     * @param spz SPZ
     * @param barva  Barva
     */
    public Auto(String spz, String barva)
    {
        this.spz = spz;
        this.barva = barva;
    }
    
    /**
     * Vrátí SPZ auta
     * @return SPZ auta
     */
    public String vratSpz()
    {
        return spz;
    }
    
    /**
     * Zaparkuje auto do garáže
     * @param garaz Garáž
     */
    public void zaparkuj(Garaz garaz)
    {
        garaz.vloz(this);
    }
}
