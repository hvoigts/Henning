package app;

/**
 * Hund
 */
public class Hund extends Tier{

    public Hund(String n) {
        super(n);
    }

    @Override
    public String gibLaut() {
       return "Wuff";
    }

   
}