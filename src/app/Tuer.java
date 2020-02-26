package app;

public class Tuer {

    private boolean offen;
    private String material;
    private String farbe;
    private int hoehe;

    public void oeffnen() {
        offen=true;
    }

    public void schliessen() {
        offen=false;
    }

    public boolean istOffen() {
        return offen;
    }
}
