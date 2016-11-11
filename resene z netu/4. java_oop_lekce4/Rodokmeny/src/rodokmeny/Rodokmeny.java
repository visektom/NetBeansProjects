package rodokmeny;

public class Rodokmeny {

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
 
    public static void main(String[] args) {
        // Vytvoření a navázání osob
        Osoba abraham = new Osoba("Abraham Simpson", null, null);
        Osoba penelope = new Osoba("Penelope Olsen", null, null);
        Osoba pan = new Osoba("Pan Bouvier", null, null);
        Osoba jackie = new Osoba("Jackie Bouvier", null, null);
        Osoba herb = new Osoba("Herb Powers", abraham, penelope);
        Osoba homer = new Osoba("Homer Simpson", abraham, penelope);
        Osoba marge = new Osoba("Marge Simpson", pan, jackie);
        Osoba selma = new Osoba("Selma Bouvier", pan, jackie);
        Osoba bart = new Osoba("Bart Simpson", homer, marge);
        // Vytvoření a vypsání rodokmenů
        Rodokmen rodokmenBarta = new Rodokmen(bart);
        Rodokmen rodokmenHomera = new Rodokmen(homer);
        rodokmenBarta.vypis();
        System.out.println("");
        rodokmenHomera.vypis();
    }
    
}
