import java.util.ArrayList;

public class aufgabe3 {

    public int[] summe(int[] zahl1, int[] zahl2) {
        ArrayList<Integer> ergebnisListe = new ArrayList<>();
        int uebertrag = 0;

        // von rechts nach links durch die Arrays gehen
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int spaltenSumme = zahl1[i] + zahl2[i] + uebertrag;

            // Das letzte Ziffer der Summe ist Ergebnis fur diese Stelle
            ergebnisListe.add(0, spaltenSumme % 10);

            // Der Rest ist der ubertrag fur die nachste Stelle
            uebertrag = spaltenSumme / 10;
        }
    }
}
