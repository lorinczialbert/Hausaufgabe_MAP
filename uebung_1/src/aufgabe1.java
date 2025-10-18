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
}

    // punkt 2, Berechnet den Durchschnittwert der Noten



public static void main(String[] args) {

}
