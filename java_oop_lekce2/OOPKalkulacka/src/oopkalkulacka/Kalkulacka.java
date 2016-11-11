package oopkalkulacka;

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
 * Třída reprezentuje kalkulačku, které se zadají 2 čísla a ona
 * s nimi provádí základní aritmetické operace.
 * @author devbook.cz
 */
public class Kalkulacka {
        
    /**
     * 1. číslo
     */
    public double cislo1;
    /**
     * 2. číslo
     */
    public double cislo2;

    /**
     * Vrací součet atributů
     * @return Součet
     */
    public double soucet()
    {
        return cislo1 + cislo2;
    }
    
    /**
     * Vrací rozdíl atributů
     * @return Rozdíl
     */
    public double rozdil()
    {
        return cislo1 - cislo2;
    }
    
    /**
     * Vrací součin atributů
     * @return Součin
     */
    public double soucin()
    {
        return cislo1 * cislo2;
    }
    
    /**
     * Vrací podíl atributů
     * @return Podíl
     */
    public double podil()
    {
        return cislo1 / cislo2;
    }
    
}
