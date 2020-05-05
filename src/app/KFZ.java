package app;

/**
 * KFZ
 */
public class KFZ extends Fahrzeugmarke {

    private Dachgepaecktraeger dg;

    public String toString() {
        return "Ich bin ein KFZ:"+super.toString();
    }

    public void apply(Dachgepaecktraeger d) {
        dg=d;
    }

   @Override
   public int getGewicht() {
       int gewicht = super.getGewicht();
       if (dg!=null) {
        gewicht=gewicht+(int)dg.getGewicht();
       }
       return gewicht;
   }

   @Override
   public int getTopSpeed() {
       return 200;
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