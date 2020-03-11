package app;

/**
 * ObjTraining
 */
public class ObjTraining {

    public static void main(String[] args) {
        Fahrrad f1 = new Fahrrad();
        Fahrrad f2 = new Fahrrad();
        f1.setHersteller("Gudereit");
        f2.setHersteller("Kettler");
        f1.setPreis(600);
        f2.setPreis(250);
        System.out.println(f1);
        System.out.println(f2);
        
        KFZ kfz1 = new KFZ();
        KFZ kfz2 = new KFZ();
        kfz1.setHersteller("Opel");
        kfz2.setHersteller("Ford");
        kfz1.setPreis(15000);
        kfz2.setPreis(6900);
        System.out.println(kfz1);
        System.out.println(kfz2);
        
        f1.drive(122);
        f2.drive(22,30);
        kfz1.drive(10000);
        kfz2.drive(55000);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(kfz1);
        System.out.println(kfz2);
        
        
        
        
    }

    private static int averageWeight(Fahrzeug a,Fahrzeug b) {
        return (a.getGewicht()+b.getGewicht())/2;
    }
}