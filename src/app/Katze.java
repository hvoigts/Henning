package app;

public class Katze extends Tier implements Streichelbar{

    public Katze(String n) {
        super(n);
    }

    @Override
    public String streicheln() {
        return "schnurr";
    }  
}