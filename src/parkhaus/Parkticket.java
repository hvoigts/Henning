package parkhaus;

import java.util.Date;

public class Parkticket {
    private static int idmax;
    private Date zeitstempel;
    private int id;
    private boolean bezahlt;
    private boolean entwertet;

    public Parkticket() {
        idmax++;
        id=idmax;
        entwertet=false;
        zeitstempel = new Date(System.currentTimeMillis());
        bezahlt=false;
        System.out.println("Parkticket "+id+ " ausgegeben");
    }

    public void entwerten() {
        entwertet=true;
    }

    public  int getId() {
        return id;
    }

    public void bezahlen(double geld) {

        long diff = System.currentTimeMillis()-zeitstempel.getTime();
        int preis =(int)(diff/1000);
        if (preis<geld) {
            bezahlt=true;
            System.out.println("Parkticket "+id+ " bezahlt!");
        }
        else {
            System.out.println("Parkticket "+id+ " Geld reicht nicht aus!");            
        }
    }

    public boolean isPayed() {
        return bezahlt;
    }

	public boolean isEntwertet() {
		return entwertet;
	}
}