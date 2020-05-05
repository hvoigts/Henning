package app;

public class Mofa extends Fahrzeugmarke{
    public String toString() {
        return "Ich bin ein Mofa:"+super.toString();
    }

    @Override
    public int getTopSpeed() {
        return 30;
    }
}