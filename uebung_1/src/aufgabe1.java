import java.util.ArrayList;
import java.util.Arrays;

public static class Notenverarbeitung {
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

    public int[] rundeNotenAb(int[] noten) {
        int[] abgerundeteNoten = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            abgerundeteNoten[i] = (int) Math.floor(noten[i]);
        }
        return abgerundeteNoten;
    }


}



public static void main(String[] args) {
    Notenverarbeitung notenverarbeitung = new Notenverarbeitung();
    int[] noten = {29, 37, 38, 41, 84, 67};

    // Teste findeNichtAusreichendeNoten
    int[] nichtAusreichendeNoten = notenverarbeitung.findeNichtAusreichendeNoten(noten);
    System.out.println("Nicht ausreichende Noten: " + Arrays.toString(nichtAusreichendeNoten));

    // Teste berechneDurchschnitt
    double durchschnitt = notenverarbeitung.berechneDurchschnitt(noten);
    System.out.println("Durchschnittsnote: " + durchschnitt);

    // Teste rundeNotenAb
    int[] abgerundeteNoten = notenverarbeitung.rundeNotenAb(noten);
    System.out.println("Abgerundete Noten: " + Arrays.toString(abgerundeteNoten));

}
