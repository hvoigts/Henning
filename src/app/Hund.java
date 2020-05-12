package app;

/**
 * Hund
 */
public class Hund extends Tier implements Streichelbar{

    public Hund(String n) {
        super(n);
    }

    @Override
    public String streicheln() {
        return "brummm";
    }

  
   
}