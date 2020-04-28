package app;

/**
 * Tier
 */
public class Tier {

    private String name;
    public static int anzahl;

    public Tier(String n) {
        name=n;
        anzahl++;
    }

    public String getName() {
        return name;
    }
}