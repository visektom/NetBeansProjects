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

public class PesOsoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba karel = new Osoba("Karel Novák");
        Osoba lenka = new Osoba("Lenka Nováková");
        Pes azor = new Pes("Azor");
        karel.pes = azor;
        lenka.pes = azor;
        System.out.println(azor);
        // Zestárnutí psa
        karel.pes.zestarni();
        lenka.pes.zestarni();
        // Kontrolní výpis psa
        System.out.println(azor);
    }
    
}
