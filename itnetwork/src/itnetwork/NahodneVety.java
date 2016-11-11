/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itnetwork;
import java.util.Random;
/**
 *
 * @author duck
 */
public class NahodneVety {
    private String[] adj = {"hezky", "tlusta", "hnusna", "osukana", "blazniva", "zmagorena", "kaceri", "strasidelna", "nadrzena", "vysukana", "chlupata"};
    private String[] noun = {"herecka", "kocka", "zpevacka", "bouda", "deka", "ponozka", "jitrnice", "cubka","buchta", "coca-cola", "domina"};
    private String[] adv = {"rychle", "pomalu", "strnule", "tvrde", "nezne", "jemne", "klasicky", "uchylne", "zpevne", "melodicky", "vrazedne"};
    private String[] verb = {"sukala", "vesi", "vrtal", "soulozila", "odpocivala", "nesla", "zapomnela", "vyvencila", "se mazlila", "znasilnila", "odesla"};
    private String[] prep = {"k", "v", "na", "za", "u", "pri", "pod", "nad", "pred", "s", "bez"};
    private String[] obj = {"les", "panelak", "mesto", "hrad", "obchod", "TV", "radio", "letiste", "kreslo", "karavan", "jachta"};
    private Random random = new Random(); 
    
    public int random() {
        return random.nextInt(10)+1;
    }
    
    public void createSentence() {
        System.out.println(
                adj[random()]+" "
                +noun[random()]+" "
                +adv[random()]+" "
                +verb[random()]+" "
                +prep[random()]+" "
                +obj[random()]);
    }
    
}
