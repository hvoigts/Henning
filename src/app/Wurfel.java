package app;

/**
 * Wurfel
 */
public class Wurfel {

    private int augen;

    public Wurfel() {
        wuerfeln();
    }

    public void wuerfeln() {
        this.augen = (int)Math.random()*6+1;
    }

    public int getAugen() {
        return augen;
    }
}