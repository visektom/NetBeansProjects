package prochazeni;

import java.util.Scanner;

public class Prochazeni {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Tato aplikace vznikla jako cvičení k použití referencí.\n"
                + " Můžeš procházet světem pomocí textových příkazů, jako jdi na sever a podobně.\n"
                + " Aplikaci ukončíš příkazem konec. \n");
        Hra hra = new Hra();
        String prikaz = "";

        // Hlavní smyčka hry
        while (!prikaz.equalsIgnoreCase("konec"))
        {
            System.out.println(hra.vratAktualniLokaci());
            System.out.println("Zadej příkaz: ");
            prikaz = sc.nextLine();
            hra.zpracujPrikaz(prikaz);
        }
    }
    
}
