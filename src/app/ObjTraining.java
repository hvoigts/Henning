package app;

import java.util.ArrayList;

/**
 * ObjTraining
 */
public class ObjTraining {

    public static void main(String[] args) {
        FahrtenBuch fb = new FahrtenBuch("d:\\\\Temp\\buch.txt");
        KFZ.setFahrtenBuch(fb);
        
        Fahrrad f1 = new Fahrrad();
        Fahrrad f2 = new Fahrrad();
        SkiBox d = new SkiBox();
        d.add(10);

        f1.setHersteller("Gudereit");
        f2.setHersteller("Kettler");
        f1.setPreis(600);
        f2.setPreis(250);
        f1.setGewicht(12);
        f2.setGewicht(15);
        
        KFZ kfz1 = new KFZ();
        //d.set1(f1);
        //d.set2(f2);
        kfz1.apply(d);
        KFZ kfz2 = new KFZ();
        KFZ kfz3 = new KFZ();
        kfz1.setHersteller("Opel");
        kfz2.setHersteller("Ford");
        kfz3.setHersteller("Tesla");
        kfz1.setPreis(15000);
        kfz3.setPreis(35000);
        kfz2.setPreis(6900);
        kfz1.setGewicht(960);
        kfz2.setGewicht(1020);
        kfz3.setGewicht(1220);

        Mofa m = new Mofa();
        m.setHersteller("KTM");
        m.setPreis(400);

        //Servicepartner au = new Vertragswerkstatt();
        //kfz1.setServicepartner(au);
        //kfz1.setWartungsIntervall(10000);

        ArrayList<Fahrzeugmarke> fuhrpark = new ArrayList<Fahrzeugmarke>();
      
        fuhrpark.add(f1);
        fuhrpark.add(kfz1);
        fuhrpark.add(kfz2);
        fuhrpark.add(f2);
        fuhrpark.add(kfz3);
        
        // 8.5 Gesamtgwicht berechnen
        int gesGewicht=0;
        for (int i=0;i<fuhrpark.size();i++) {
            gesGewicht=gesGewicht+fuhrpark.get(i).getGewicht();
        }
        System.out.println("Das Gesamtgewicht beträgt:"+gesGewicht);
        
        kfz1.drive(12000);
        kfz2.drive(22000);
        kfz3.drive(43000);
        kfz1.drive(333);
        f1.drive(500);
        f2.drive(1500);
        
        // 8.7 Gesamtpreis berechnen
        int gesPreis=0;
        for (Fahrzeugmarke f:fuhrpark) {
            gesPreis=gesPreis+(int)f.getPreis();
        }
        System.out.println("Ges. Preis ist: "+gesPreis);
        
    }

    private static int averageWeight(Fahrzeug a,Fahrzeug b) {
        return (a.getGewicht()+b.getGewicht())/2;
    }
}