package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla t = new Tabla("#");
        System.out.println("4. feladat: az üres tábla:");
        t.feltolt();
        t.megjelenit();
        System.out.println("6.feladat: A feltültütt tábla:");
        t.elhelyez();
        t.megjelenit();

        t.UresOSzlop(4);
        t.UresSor(5);

    }
}