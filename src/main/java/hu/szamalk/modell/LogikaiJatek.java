package hu.szamalk.modell;

import java.util.Arrays;
import java.util.Random;

public class LogikaiJatek {
    private Babu[][] tabla;
    private int sorrend;
    private int babuDb;

    public LogikaiJatek() {
    this.tabla = new Babu[4][5];
    this.sorrend = 10;
    this.babuDb = 3;
    }

    public LogikaiJatek(int babuDb) {
        Random rnd = new Random();
        this.babuDb = rnd.nextInt(2,15);

    }

    public boolean van8FelettEro(){
        boolean ero8felett = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(tabla.length < 8){
                    ero8felett =true;
                }
            }
        }
        return ero8felett;
    }

    public void kezd(){
        System.out.println("Kezdés");
    }

    public void ment(){
        System.out.println("Mentés");
    }

    public void vege(){
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + sorrend +
                ", babuDb=" + babuDb +
                '}';
    }
}
