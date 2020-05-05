package app;

public class ToFastException extends Exception{
    
    private Fahrzeugmarke obj;
    
    public ToFastException(Fahrzeugmarke f) {
        obj=f;
    }

   
    public Fahrzeugmarke getFahrzeugmarke() {
        return obj;
    }
}