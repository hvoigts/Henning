package app;

/**
 * ObjTraining
 */
public class ObjTraining {

    public static void main(String[] args) {
        // 2.1 Erzeugen Sie zwei Instanzen der Klasse Fahrzeug mit dem Namen fa1 und fa2 in der Klasse ObjTraining!
        Fahrzeug fa1 = new Fahrzeug();
        Fahrzeug fa2 = new Fahrzeug();
        // 2.2 Weisen Sie fa1 ein Gewicht von 15 zu und fa2 ein Gewicht von 20 zu.
        fa1.setGewicht(15);
        fa2.setGewicht(20);
        System.out.println(fa1.toString());
        System.out.println(fa2.toString());
        int d = averageWeight(fa1, fa2);
        System.out.println("Das Durchschnittsgewicht beträgt "+d);
        fa1.drive(300);
        fa2.drive(30, 2);
        fa1.drive(55, 1);
        System.out.println(fa1.toString());
        System.out.println(fa2.toString());

    }

    private static int averageWeight(Fahrzeug a,Fahrzeug b) {
        return (a.getGewicht()+b.getGewicht())/2;
    }
}