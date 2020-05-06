package app;
/**
 * 
 */
public class ToFastException extends Exception{
    
    private Fahrzeugmarke obj;
   
    /**
     * Konstruktor
     * @param f Fahrzeugmarke
     */
    public ToFastException(Fahrzeugmarke f) {
        obj=f;
    }

   
    public Fahrzeugmarke getFahrzeugmarke() {
        return obj;
    }
}