package nahodnevety;

import java.util.Random;

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
 * Generátor náhodných vět
 * @author devbook.cz
 */
public class GeneratorVet {
    /**
     * Slovní zásoba přívlastků
     */
    private String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    /**
     * Slovní zásoba předmětů
     */
    private String[] podmety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    /**
     * Slovní zásoba příslovcí
     */
    private String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se spožděním"};
    /**
     * Slovní zásoba sloves
     */
    private String[] slovesa = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    /**
     * Slovní zásoba příslovečných určení místa
     */
    private String[] pum = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};
    /**
     * Generátor náhodných čísel
     */
    private Random generator = new Random();

    /// <summary>
    /// Vrátí náhodné slovo z pole
    /// </summary>
    /// <param name="pole">Vstupní pole</param>
    /// <returns>Náhodné slovo</returns>
    private String nahodneSlovo(String[] pole)
    {
        int index = generator.nextInt(pole.length);
        String slovo = pole[index];
        return slovo;
    }

    /// <summary>
    /// Vrátí náhodnou větu
    /// </summary>
    /// <returns>Náhodná věta</returns>
    public String generuj()
    {
        return String.format("%s %s %s %s %s", 
            nahodneSlovo(privlastky), 
            nahodneSlovo(podmety),
            nahodneSlovo(prislovce), 
            nahodneSlovo(slovesa), 
            nahodneSlovo(pum)
        );
    }
}
