package app;
/**
 * 
 */
public class ToFastException extends Exception{
    
    private Fahrzeug obj;
   
    /**
     * Konstruktor
     * @param f Fahrzeugmarke
     */
    public ToFastException(Fahrzeug f) {
        obj=f;
    }

   
    public Fahrzeug getFahrzeug() {
        return obj;
    }
}