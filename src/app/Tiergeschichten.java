package app;

public class Tiergeschichten {

    public static void main(String[] args) {
       Streichelbar k = new Katze("Mietze");
       Streichelbar h = new Hund("Bello");
       Kokodil kr = new Kokodil("Schnappi");

       System.out.println("Katze:"+k.streicheln());
       System.out.println("Hund:"+h.streicheln());
    }
}