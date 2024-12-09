package hu.szamalk.modell;

import java.util.Random;

public class Tabla {
    private char[][] t;
    private String UresCella;

    public Tabla(String uresCella) {
        this.t= new char[8][8];
        UresCella = uresCella;
    }


    public void feltolt(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0 || (i + j == 4) || i < 5) {
                    t[i][j] = '-';
                } else {
                    t[i][j] = ' ';
                }
            }
        }
    }

    public void megjelenit(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(t[i][j]);
            }
            System.out.println();
        }
    }
    public void elhelyez(){
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (rnd.nextInt(0,9)==j) {
                    t[i][j] = 'K';
                }
            }
        }
    }

    public boolean UresOSzlop(int oszlop) {
        boolean vantelioszlop = false;
        if (oszlop >= 0 && oszlop < 7)
            for (int j = 0; j < 8; j++) {
                if (t[oszlop][j] != ' ') {
                    vantelioszlop = true;
                }
            }
        return vantelioszlop;
    }

    public boolean UresSor(int sor) {
        boolean vantelisor = false;
        if (sor >= 0 && sor < 7)
            for (int j = 0; j < 8; j++) {
                if (t[sor][j] != ' ') {
                    vantelisor = true;
                }
            }
        return vantelisor;
    }

    public int UresOszlopokSzama(){
        int oszlopszam = 0;
        for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (t[i][j] != j) {
                        oszlopszam++;
                    }
                }
        }
        return oszlopszam;
    }

    public int  UresSorokSzama(){
        int sorszam = 0;
        for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 5; j++) {
                    if (t[i][j] != j) {
                        sorszam++;
                    }
                }
        }
        return sorszam;
    }

}
