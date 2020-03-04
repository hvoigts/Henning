package app;

/**
 * Farbwuerfel
 */
public class Farbwuerfel extends Wurfel {

    private String[] farben = {"rot","gelb","grün","blau","lila","organge"};
    public String getFarbe() {
        return farben[getAugen()-1];
    }
    
}