package app;

/**
 * KFZ
 */
public class KFZ extends Fahrzeugmarke {

    private Applyable dg;
    private Servicepartner sp=null;
    private int wartungsIntervall=5000;
    private int letzteWartung=0;


    public void apply(Applyable d) {
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

    public void drive(double km) {
        super.drive(km);
        setPreis(getPreis()-km*0.3);
        if (getLaufleistung()>letzteWartung+wartungsIntervall && sp!=null) {
            letzteWartung=letzteWartung+wartungsIntervall;
            System.out.println("Das Fahrzeug musste gewartet werden und das kostete:"+sp.wartung(this));            
        }
    }
    
    public void drive(double l,double t) throws ToFastException{
        super.drive(l, t);
        setPreis(getPreis()-l*t*0.3);
        if (getLaufleistung()>letzteWartung+wartungsIntervall && sp!=null) {
            letzteWartung=letzteWartung+wartungsIntervall;
            System.out.println("Das Fahrzeug musste gewartet werden und das kostete:"+sp.wartung(this));            
        }
    }

    public void setWartungsIntervall(int wartungsIntervall) {
        this.wartungsIntervall = wartungsIntervall;
    }

    public int getWartungsIntervall() {
        return wartungsIntervall;
    }

    public void setServicepartner(Servicepartner s) {
        sp=s;
    }

    public String toString() {
        return "Ich bin ein KFZ:"+super.toString();
    }

  

   @Override
   public int getTopSpeed() {
       return 200;
   }

  
}