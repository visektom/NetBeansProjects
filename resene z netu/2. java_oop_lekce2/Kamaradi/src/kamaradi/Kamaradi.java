package kamaradi;

public class Kamaradi {

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
        // Vytvoření lidí
        Clovek karel = new Clovek();
        karel.jmeno = "Karel Novák";
        karel.vek = 33;
        Clovek josef = new Clovek();
        josef.jmeno = "Josef Nový";
        josef.vek = 27;
        // Spřátelení
        karel.kamarad = josef;
        josef.kamarad = karel;
        // Představení
        karel.predstavSe();
        josef.predstavSe();
    }
    
}
