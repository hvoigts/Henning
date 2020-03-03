package app;

public class Spardose {
    // Ziel als ct
    private int ziel;
    // Betrag als ct
    private int betrag;

	public Spardose(double ziel) {
		this.ziel=(int)(100*ziel);
	}
	
	public Spardose(int ziel) {
		this.ziel=ziel;
	}
	
	public void einzahlen(double betrag) {
		this.betrag=this.betrag+(int)(100*betrag);
	}
	
	public void einzahlen(int betrag) {
		this.betrag=this.betrag+betrag;
	}
	
	public boolean sparzielErreicht() {
		if (betrag>=ziel) {
            return true;
        }
		return false;
	}
	
	public double getCent() {
		return this.betrag;
	}	
}
