package singleton;

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
 * Ukázka implementace návrhového vzoru Singleton v Javě
 * @author sdraco
 */
public class Databaze {
    /**
     * Privátní instance
     */
    private static Databaze instance;
    /**
     * Instanční proměnná
     */
    private String jmeno;
   
    /**
     * Privátní konstruktor zabraňuje instanciaci
     */
    private Databaze(String jmeno)
    {
        this.jmeno = jmeno;
    }

    /**
     * Jediná možnost vytvoření instance je přes statickou metodu
     * @return Instance databáze
     */
    public static Databaze getInstance()
    {
        if (instance == null)
            instance = new Databaze("MySQL");
         return instance;
    }

     /**
      * @return the jmeno
      */
    public String getJmeno() {
         return jmeno;
    }

     /**
      * @param jmeno the jmeno to set
      */
    public void setJmeno(String jmeno) {
         this.jmeno = jmeno;
    }
}
