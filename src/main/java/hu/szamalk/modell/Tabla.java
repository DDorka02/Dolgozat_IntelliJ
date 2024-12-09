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


    public void fajlbair(){

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





}
