package app;

/**
 * Fahrzeugmarke
 */
public class Fahrzeugmarke extends Fahrzeug {

    private String hersteller;
    private double preis;

    public Fahrzeugmarke() {

    }

    public Fahrzeugmarke(int kg) {
        super(kg);
    }

    public Fahrzeugmarke(int kg, double l) {
        super(kg,l);
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        if (preis<0) {
            this.preis=0;
        }
        else {
            this.preis = preis;
        }
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String toString() {
        return "Hersteller="+this.hersteller+" Preis="+this.preis+ super.toString();
    }


}