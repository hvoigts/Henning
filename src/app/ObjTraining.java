package app;

/**
 * ObjTraining
 */
public class ObjTraining {

    public static void main(String[] args) {
        Fahrrad f1 = new Fahrrad();
        Fahrrad f2 = new Fahrrad();
        Dachgepaecktraeger d = new Dachgepaecktraeger();

        f1.setHersteller("Gudereit");
        f2.setHersteller("Kettler");
        f1.setPreis(600);
        f2.setPreis(250);
        f1.setGewicht(12);
        f2.setGewicht(15);
        
        KFZ kfz1 = new KFZ();
        d.set1(f1);
        d.set2(f2);
        kfz1.apply(d);
        KFZ kfz2 = new KFZ();
        kfz1.setHersteller("Opel");
        kfz2.setHersteller("Ford");
        kfz1.setPreis(15000);
        kfz2.setPreis(6900);
        kfz1.setGewicht(960);
        kfz2.setGewicht(1020);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(kfz1.toString());
        System.out.println(kfz2.toString());
        d.remove2();
        System.out.println(kfz1.toString());
        Fahrzeugmarke.printNumberOfProducts();
    }

    private static int averageWeight(Fahrzeug a,Fahrzeug b) {
        return (a.getGewicht()+b.getGewicht())/2;
    }
}