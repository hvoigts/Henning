package app;

/**
 * Haus
 */
public class Haus {

    Stockwerk s[] = new Stockwerk[5];

    public Haus() {
        for (int i=0;i<=4;i++) {
            s[i]=new Stockwerk();
        }
    }
}