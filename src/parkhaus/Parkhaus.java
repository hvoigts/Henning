package parkhaus;

public class Parkhaus implements SchrankeListener{
    private String name;
    private int kapazitaet;
    private int freeSlots;
    private Schranke schranke;

    public Parkhaus(String n, int k) {
        name=n;
        kapazitaet=k;
        freeSlots=k;
        schranke = new Schranke();
        schranke.setListener(this);
    }

    public int getFreeSlots() {
        return freeSlots;
    }

    public Schranke getSchranke() {
        return schranke;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public Parkticket getTicket() {
        if (freeSlots<=0) {
            return null;
        }
        freeSlots--;
        return new Parkticket();
    }

    @Override
    public void isLeaving() {
            System.out.println("Fahrzeug is leaving.....");
            freeSlots++;
    }
    
}