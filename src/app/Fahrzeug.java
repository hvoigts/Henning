package app;

/**
 * Fahrzeug
 */
public class Fahrzeug {

    private int gewicht;
    private double laufleistung;

    public Fahrzeug(int kg) {
        this.gewicht=kg;
    }

    public Fahrzeug(int kg,double l) {
        this.gewicht=kg;
        this.laufleistung=l;
    }

    public int getGewicht() {
        return gewicht;
    }

    public double getLaufleistung() {
        return laufleistung;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String toString() {
        return "Laufleistung="+laufleistung+" Gewicht="+gewicht;
    }

    public void drive(double l) {
        laufleistung=laufleistung+l;
    }

    public void drive(double l,double t) {
        laufleistung=laufleistung+l*t;
    }
}

