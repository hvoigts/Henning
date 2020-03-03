package app;

/**
 * ObjTraining
 */
public class ObjTraining {

    public static void main(String[] args) {

        Hund t = new Hund("Bello");
        Delphin d = new Delphin("Flipper");
        System.out.println("t="+t.getName()+" "+t.gibLaut());
        System.out.println("d="+d.getName()+" "+d.kannTauchen());
        
        /*
        // 2.1 Erzeugen Sie zwei Instanzen der Klasse Fahrzeug mit dem Namen fa1 und fa2 in der Klasse ObjTraining!
        Fahrzeug fa1 = new Fahrzeug(55);
        Fahrzeug fa2 = new Fahrzeug(75,10000);
        // 2.2 Weisen Sie fa1 ein Gewicht von 15 zu und fa2 ein Gewicht von 20 zu.
        
        System.out.println(fa1.toString());
        System.out.println(fa2.toString());
        int d = averageWeight(fa1, fa2);
        System.out.println("Das Durchschnittsgewicht beträgt "+d);
        fa1.drive(300);
        fa2.drive(30, 2);
        fa1.drive(55, 1);
        System.out.println(fa1.toString());
        System.out.println(fa2.toString());
        */
    }

    private static int averageWeight(Fahrzeug a,Fahrzeug b) {
        return (a.getGewicht()+b.getGewicht())/2;
    }
}