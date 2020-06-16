package parkhaus;

public class Schranke {

    private SchrankeListener sl;

    public void setListener(SchrankeListener sl) {
        this.sl = sl;
    }

    public boolean oeffnen(Parkticket pt) {
        System.out.println("Parkticket " + pt.getId() + " in Schanke eingefühgt!");
        if (pt.isPayed()) {
            if (!pt.isEntwertet()) {
                if (sl != null) {
                    sl.isLeaving();
                }
                pt.entwerten();
                return true;
            }
            return false;
        }
        return false;
    }
}