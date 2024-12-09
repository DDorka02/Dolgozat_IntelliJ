package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla t = new Tabla("C");
        t.feltolt();
        t.elhelyez();
        t.megjelenit();
        t.UresOSzlop(4);
        t.UresSor(5);
    }
}