package hu.szamalk.modell;

import java.util.Arrays;

public class LogikaiJatek {
    private char Babu[][];
    private int sorrend[];
    private int babuDb;

    public LogikaiJatek() {
        this(0);
    }

    public LogikaiJatek(int babuDb) {
        this.babuDb = babuDb;
    }

    public boolean van8FelettEro(){
        return false;
    }

    public void kezd(){

    }

    public void ment(){

    }

    public void vege(){

    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "Babu=" + Arrays.toString(Babu) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
