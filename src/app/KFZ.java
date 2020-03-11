package app;

/**
 * KFZ
 */
public class KFZ extends Fahrzeugmarke {

    public String toString() {
        return "Ich bin ein KFZ:"+super.toString();
    }

    public void drive(double km) {
        super.drive(km);
        setPreis(getPreis()-km*0.3);
    }
    
    public void drive(double l,double t) {
        super.drive(l, t);
        setPreis(getPreis()-l*t*0.3);
    }
}