package app;

public class Katze extends Tier {

    public Katze(String n) {
        super(n);
    }

    @Override
    public String gibLaut() {
       return "Miau";
    }
   
}