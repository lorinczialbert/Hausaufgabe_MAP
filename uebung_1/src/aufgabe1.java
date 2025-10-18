import java.util.ArrayList;
import java.util.Arrays;

public class Notenverarbeitung {
    // punkt 1, Findet alle Noten, die nicht ausreichend sind (weniger als 40)

    public int[] findeNichtAusreichendeNoten(int[] noten) {
        ArrayList<Integer> nichtAusreichendeNoten = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                nichtAusreichendeNoten.add(note);
            }
        }
        // Konvertiere ArrayList zurück zu int[]
        return nichtAusreichendeNoten.stream().mapToInt(i -> i).toArray();
    }

    // punkt 2, Berechnet den Durchschnittswert aller Noten

    public double berechneDurchschnitt(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return (double) summe / noten.length;
    }

    // punkt 3, Ein Array mit den abgerundeten Noten zurückgeben
}



public static void main(String[] args) {

}
