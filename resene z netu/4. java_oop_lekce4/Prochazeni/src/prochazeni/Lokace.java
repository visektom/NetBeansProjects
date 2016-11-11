package prochazeni;

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

public class Lokace {
    /**
     * Lokace na severu
     */
    public Lokace sever;
    /**
     * Lokace na jihu
     */
    public Lokace jih;
    /**
     * Lokace na západě
     */
    public Lokace zapad;
    /**
     * Lokace na východě
     */
    public Lokace vychod;
    /**
     * Název lokace
     */
    private String nazev;
    /**
     * Dlouhý popis lokace
     */
    private String popis;

    /**
     * Inicializuje novou instanci
     * @param nazev Název lokace
     * @param popis Dlouhý popis
     */
    public Lokace(String nazev, String popis)
    {
        this.nazev = nazev;
        this.popis = popis;
    }

    /**
     * Vrátí textovou reprezentaci lokace
     * @return Textová reprezentaci lokace
     */
    @Override
    public String toString()
    {
        String vystup = nazev + "\n";
        vystup += popis + "\n\n";
        String smery = "";
        if (sever != null)
            smery += "sever ";
        if (jih != null)
            smery += "jih ";
        if (zapad != null)
            smery += "západ ";
        if (vychod != null)
            smery += "východ ";
        if (!smery.equals(""))
            vystup += "Můžeš jít na " + smery + "\n";
        return vystup;
    }
}
