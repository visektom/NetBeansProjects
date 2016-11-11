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

/**
 * Třída spravuje základní objekty hry
 * @author devbook.cz
 */
public class Hra {
    
    /**
     * Aktuální lokace
     */
    private Lokace aktualniLokace;
    
    /**
     * Vytvoří herní svět
     */
    public Hra()
    {
        // Vytvoření lokací
        Lokace hrad = new Lokace("Hrad", "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\nKlíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");
        Lokace les1 = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\nslunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace les2 = new Lokace("Lesní rozcestí", "Nacházíš se na lesním rozcestí.");
        Lokace les3 = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\nslunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace rybnik = new Lokace("Rybník", "Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\nod tebe je dřevěná plošina se stavidlem.");
        Lokace les4 = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\nslunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace dum = new Lokace("Dům", "Stojíš před svým rodným domem, citíš vůni čerstvě nasekaného dřeva, která se line\nz hromady vedle vstupních dvěří.");
        // Propojení lokací
        hrad.vychod = les1;
        les1.zapad = hrad;
        les1.vychod = les2;
        les2.zapad = les1;
        les2.vychod = les3;
        les2.jih = les4;
        les3.zapad = les2;
        les3.vychod = rybnik;
        rybnik.zapad = les3;
        les4.sever = les2;
        les4.vychod = dum;
        dum.zapad = les4;
        // Uložení aktuální lokace
        aktualniLokace = dum;
    }

    /**
     * Zpracuje textový příkaz
     * @param prikaz Příkaz
     */
    public void zpracujPrikaz(String prikaz)
    {
        prikaz = prikaz.toLowerCase();
        if (prikaz.startsWith("jdi"))
        {
            if (prikaz.endsWith("sever") && (aktualniLokace.sever != null))
                aktualniLokace = aktualniLokace.sever;
            else if (prikaz.endsWith("jih") && (aktualniLokace.jih != null))
                aktualniLokace = aktualniLokace.jih;
            else if (prikaz.endsWith("západ") && (aktualniLokace.zapad != null))
                aktualniLokace = aktualniLokace.zapad;
            else if (prikaz.endsWith("východ") && (aktualniLokace.vychod != null))
                aktualniLokace = aktualniLokace.vychod;
            else 
                System.out.println("Tímto směrem nelze jít.");
        }
        else if (!prikaz.equals("konec"))
        {
            System.out.println("Můj vstupní slovník neobsahuje tento příkaz.");
        }
    }

    /**
     * Vrátí aktuální lokaci
     * @return Aktuální lokace
     */
    public Lokace vratAktualniLokaci()
    {
        return aktualniLokace;
    }
    
}
