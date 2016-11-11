/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author duck
 */
public class Nastaveni {
    private static String jazyk = "CZ";
    private static String barevneSchema = "cervene";
    private static boolean spustitPoStartu = true;

        /**
     * @return the jazyk
     */
    public static String getJazyk() {
        return jazyk;
    }
    
    /**
     * @return the barevneSchema
     */
    public static String getBarevneSchema() {
        return barevneSchema;
    }

    /**
     * @return the spustitPoStartu
     */
    public static boolean isSpustitPoStartu() {
        return spustitPoStartu;
    }

    private Nastaveni() {
    }
    
    
}
