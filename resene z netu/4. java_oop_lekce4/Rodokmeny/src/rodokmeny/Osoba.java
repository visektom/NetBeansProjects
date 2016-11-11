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
 * Reprezentuje osobu v rodokmenu
 * @author devbook.cz
 */
public class Osoba {    
    /**
     * Otec osoby
     */
    public Osoba otec;
    /**
     * Matka osoby
     */
    public Osoba matka;
    /**
     * Celé jméno osoby
     */
    private String jmeno;

    /**
     * Inicializuje osobu
     * @param jmeno Celé jméno osoby
     * @param otec Otec osoby
     * @param matka Matka osoby
     */
    public Osoba(String jmeno, Osoba otec, Osoba matka)
    {
        this.otec = otec;
        this.matka = matka;
        this.jmeno = jmeno;
    }

    /**
     * Vrátí textovou reprezentaci osoby
     * @return Textová reprezentace osoby<
     */
    @Override
    public String toString()
    {
        return jmeno;
    }
}
