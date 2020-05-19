package app;

public class Dachgepaecktraeger implements Applyable{
    private Fahrrad platz1;
    private Fahrrad platz2;

    public void set1(Fahrrad f) {
        platz1=f;
    }
    public void set2(Fahrrad f) {
        platz2=f;
    }

    public void remove1() {
        platz1=null;
    }
    public void remove2() {
        platz2=null;
    }

    public double getGewicht() {
        double d=15.0;
        if (platz1!=null) {
            d=d+platz1.getGewicht();
        }
        if (platz2!=null) {
            d=d+platz2.getGewicht();
        }
        return d;
    }
}