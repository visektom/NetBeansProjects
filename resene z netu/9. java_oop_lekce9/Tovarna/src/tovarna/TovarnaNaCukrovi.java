package tovarna;

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
 * Továrna na tvorbu cukroví
 * @author devbook.cz
 */
public class TovarnaNaCukrovi {    
    /**
     * Vytvoří banánové cukroví
     * @return Banánové cukroví
     */
    public static Cukrovi vyrobBananove()
    {
        return new Cukrovi("žlutá", "kulatý", 20);
    }
    
    /**
     * Vytvoří jahodové cukroví
     * @return Jahodové cukroví
     */
    public static Cukrovi vyrobJahodove()
    {
        return new Cukrovi("červená", "kulatý", 15);
    }
    
    /**
     * Vytvoří čokoládové cukroví
     * @return Čokoládové cukroví
     */
    public static Cukrovi vyrobCokoladove()
    {
        return new Cukrovi("hnědá", "hranatý", 25);
    }
}
