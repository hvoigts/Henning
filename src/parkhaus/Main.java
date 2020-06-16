package parkhaus;

public class Main {

    public static void main(String[] args) {
        Parkhaus p = new Parkhaus("Bahnhofsstraße", 500);
        Parkticket t1 = p.getTicket();
        Parkticket t2 = p.getTicket();
        System.out.println("Freie Plätze:" + p.getFreeSlots());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.bezahlen(20.0);
        p.getSchranke().oeffnen(t1);
        System.out.println("Freie Plätze:"+p.getFreeSlots());
    }
}