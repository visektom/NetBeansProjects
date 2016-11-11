package auta;

public class Auta {

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
        Garaz garaz = new Garaz();
        Auto skoda = new Auto("123ABC", "modrá");
        skoda.zaparkuj(garaz);
        System.out.println(garaz);
    }
    
}
