package app;


public class Delphin extends Tier{

    public Delphin(String n) {
        super(n);
    }

    public boolean kannTauchen() {
        return true;
    }

    @Override
    public String gibLaut() {
        return "FiepFiepFiep";
    }

}