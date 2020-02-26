package app;

/**
 * Rechteck
 */
public class Rechteck {

    private int a;
    private int b;
    private String farbe;

    public Rechteck(int a,int b,String f) {
        this.a=a;
        this.b=b;
        farbe=f;
    }

    public int getArea() {
        return a*b;
    }
}

