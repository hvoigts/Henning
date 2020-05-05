package app;

/**
 * Fahrzeug
 */
public abstract class Fahrzeug {

    private int gewicht;
    private double laufleistung;

 
    public Fahrzeug() {
        
    }

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
        return "Laufleistung="+laufleistung+" Gewicht="+getGewicht();
    }

    public void drive(double l) {
        laufleistung=laufleistung+l;
    }

    public void drive(double l,double t) throws ToFastException {
        laufleistung=laufleistung+l*t;
        if (l>getTopSpeed()) {
           throw new ToFastException(this);
        }
    }

    public abstract int getTopSpeed();
}

