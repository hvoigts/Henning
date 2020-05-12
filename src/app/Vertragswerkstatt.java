package app;

public class Vertragswerkstatt implements Servicepartner{

    @Override
    public double wartung(Fahrzeug f) {
        return 800;
    }
    
}