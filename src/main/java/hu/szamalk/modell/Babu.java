package hu.szamalk.modell;

import java.util.Random;

public class Babu{
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(1,szin);
    }

    public Babu(int ero, String szin) {
        Random rnd = new Random();
        this.ero = rnd.nextInt(1,9);;
        this.szin = szin;
    }
}
