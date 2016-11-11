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
 * Reprezentuje cukroví
 * @author devbook.cz
 */
public class Cukrovi {    
    /**
     * Barva
     */
    private String barva;
    /**
     * Tvar
     */
    private String tvar;
    /**
     * Váha v gramech
     */
    private int vaha;

    /**
     * Inicializuje novou instanci
     * @param barva Barva
     * @param tvar Tvar
     * @param vaha Váha
     */
    public Cukrovi(String barva, String tvar, int vaha)
    {
        this.barva = barva;
        this.tvar = tvar;
        this.vaha = vaha;
    }
    
    /**
     * Vrátí textovou reprezentaci cukroví
     * @return Textová reprezentace cukroví
     */
    @Override
    public String toString()
    {
        return "Cukroví barvy " + barva + ", tvaru " + tvar + " a váhy " + vaha + "g";
    }
}
