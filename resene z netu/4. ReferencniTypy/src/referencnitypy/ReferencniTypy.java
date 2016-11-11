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

package referencnitypy;

public class ReferencniTypy {


    public static void main(String[] args) {
        // založení proměnných
int a = 56;
int b = 28;
Uzivatel u = new Uzivatel("Jan Novák", 28);
Uzivatel v = new Uzivatel("Josef Nový", 32);
System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n", a, b, u, v);
// přiřazování
a = b;
u = v;
System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n", a, b, u, v);

// změna
v.jmeno = "John Doe";
System.out.printf("u: %s\nv: %s\n", u, v);
    }
}
