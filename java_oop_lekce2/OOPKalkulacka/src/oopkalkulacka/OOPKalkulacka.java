package oopkalkulacka;

import java.util.Scanner;

public class OOPKalkulacka {

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
        // Vytvoření instance
        Kalkulacka kalkulacka = new Kalkulacka();
        // Načtení atributů
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej 1. číslo: ");
        kalkulacka.cislo1 = Double.parseDouble(sc.nextLine());
        System.out.println("Zadej 2. číslo: ");
        kalkulacka.cislo2 = Double.parseDouble(sc.nextLine());
        System.out.println("Součet: " + kalkulacka.soucet());
        System.out.println("Rozdíl: " + kalkulacka.rozdil());
        System.out.println("Součin: " + kalkulacka.soucin());
        System.out.println("Podíl: " + kalkulacka.podil());        
    }
    
}
