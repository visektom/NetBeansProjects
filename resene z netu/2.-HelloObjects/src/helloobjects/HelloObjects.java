	/*
	 *	       __          __                __            
	 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
	 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
	 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
	 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
	 *                                                   
	 *                                                           
	 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
	 * 
	 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
	 *	sociální síti DEVBOOK.CZ	
	 *	
	 *	Kód můžete upravovat pod licencí MIT, 
	 *	tedy jak chcete, jen zmiňte odkaz na www.devbook.cz :-) 
	 */


package helloobjects;

public class HelloObjects {

    public static void main(String[] args) {
        Zdravic zdravic = new Zdravic();
        zdravic.text = "Ahoj uživateli";
        System.out.println(zdravic.pozdrav("Karel"));
        System.out.println(zdravic.pozdrav("Petr"));
        zdravic.text = "Vítám tě tu programátore";
        System.out.println(zdravic.pozdrav("Richard"));
    }
}
