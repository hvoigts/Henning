package app;

public class SkiBox implements Applyable{
    private int gewicht;

    @Override
    public double getGewicht() {
      return 10+gewicht;      
    }

    public void add(int kg) {
        gewicht=gewicht+kg;
    }
    public void remove(int kg) {
        gewicht=gewicht-kg;
        if (gewicht<0) {
            gewicht=0;
        }
    }
    
}