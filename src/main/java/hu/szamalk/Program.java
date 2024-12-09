package hu.szamalk;

import hu.szamalk.modell.LogikaiJatek;

public class Program {
    public static void main(String[] args) {
        LogikaiJatek j1 = new LogikaiJatek(3);
        LogikaiJatek j2 = new LogikaiJatek(10);
        j1.kezd();
        j1.ment();
        j1.vege();
    }
}
