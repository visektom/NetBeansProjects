package pesosoba;

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
 * Reprezentuje psa
 * @author devbook.cz
 */
public class Pes {
    /**
     * Jméno
     */
    private String jmeno;
    /**
     * Věk
     */
    private int vek = 1;
    
    /**
     * Inicializuje instanci
     * @param jmeno Jméno
     */
    public Pes(String jmeno)
    {
        this.jmeno = jmeno;
    }
    
    /**
     * Nechá psa zestárnout o  rok
     */
    public void zestarni()
    {
        vek++;
    }
    
    /**
     * Vrátí textovou reprezentaci psa
     * @return Textová reprezentace psa
     */
    @Override
    public String toString()
    {
        return jmeno + " (" + vek + " let)";
    }
}
