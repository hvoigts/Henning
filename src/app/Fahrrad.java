package app;

/**
 * Fahrrad
 */
public class Fahrrad extends Fahrzeugmarke{

    public String toString() {
        return "Ich bin ein Fahrrad:"+super.toString();
    }

    @Override
    public int getTopSpeed() {
        return 20;
    }

  
}