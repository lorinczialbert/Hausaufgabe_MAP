import java.util.ArrayList;
import java.util.Arrays;

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
        // Wenn nach der letzten Stelle noch ein Ubertrag ubrig ist, hinzufugen
        if (uebertrag > 0) {
            ergebnisListe.add(0, uebertrag);
        }
        return ergebnisListe.stream().mapToInt(i -> i).toArray();

    }

    public int[] differenz(int[] zahl1, int[] zahl2) {
        int[] ergebnis = new int[zahl1.length];
        int borgen = 0;

        for (int i = zahl1.length - 1; i >= 0; i--) {
            int spaltenDifferenz = zahl1[i] - zahl2[i] - borgen;

            if (spaltenDifferenz < 0) {
                // Wir müssen uns 10 von der nächsten Stelle "borgen"
                spaltenDifferenz += 10;
                borgen = 1;
            } else {
                borgen = 0;
            }

            ergebnis[i] = spaltenDifferenz;
        }
        return ergebnis;
    }

    public int[] multiplikation(int[] grosseZahl, int ziffer) {
        ArrayList<Integer> ergebnisListe = new ArrayList<>();
        int uebertrag = 0;

        for (int i = grosseZahl.length - 1; i >= 0; i--) {
            int produkt = grosseZahl[i] * ziffer + uebertrag;
            ergebnisListe.add(0, produkt % 10);
            uebertrag = produkt / 10;
        }

        if (uebertrag > 0) {
            ergebnisListe.add(0, uebertrag);
        }
        return ergebnisListe.stream().mapToInt(i -> i).toArray();
    }

    public int[] division(int[] grosseZahl, int divisor) {
        int[] ergebnis = new int[grosseZahl.length];
        int rest = 0;

        // Bei der Division gehen wir von links nach rechts!
        for (int i = 0; i < grosseZahl.length; i++) {
            // Die aktuelle Zahl zum Teilen ist der Rest * 10 + die aktuelle Ziffer
            int aktuelleZahl = rest * 10 + grosseZahl[i];

            ergebnis[i] = aktuelleZahl / divisor;
            rest = aktuelleZahl % divisor;
        }
        return ergebnis;
    }




    public static void main(String[] args) {
        aufgabe3 aufgabe = new aufgabe3();

        //1. Summe
        int[] s1= {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] s2= {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] summe = aufgabe.summe(s1, s2);
        System.out.println("Die Summe ist: " + Arrays.toString(summe));

        //2. Differenz
        int[] d1= {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] d2= {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] differenz = aufgabe.differenz(d1, d2);
        System.out.println("Die Differenz ist: " + Arrays.toString(differenz));

        //3. Multiplikation
        int[] m1= {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] multiplikation = aufgabe.multiplikation(m1, ziffer);
        System.out.println("Die Multiplikation ist: " + Arrays.toString(multiplikation));

        //4. Division
        int[] v1= {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int divisor = 2;
        int[] division = aufgabe.division(v1, divisor);
        System.out.println("Die Division ist: " + Arrays.toString(division));

    }
}
