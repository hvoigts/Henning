package app;

/**
 * Tier
 */
public abstract class Tier {

    private String name;
    
    public Tier(String n) {
        name=n;
    }

    public String getName() {
        return name;
    }

    public abstract String gibLaut();
}