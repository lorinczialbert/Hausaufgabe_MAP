public class aufgabe2 {
    // es gibt ein Array mit n positive Zahlen
    //punkt 1, finden Sie die maximale Zahl im Array

    public int findeMaximaleZahl(int[] zahlen) {
        int maxZahl = Integer.MIN_VALUE;
        for (int zahl : zahlen) {
            if (zahl > maxZahl) {
                maxZahl = zahl;
            }
        }
        return maxZahl;
    }

    //punkt 2, minimale Zahl im Array finden

    public int findeMinimaleZahl(int[] zahlen) {
        int minZahl = Integer.MAX_VALUE;
        for (int zahl : zahlen) {
            if (zahl < minZahl) {
                minZahl = zahl;
            }
        }
        return minZahl;
    }

    //punkt 3, die maximale Summe von n-1 Zahlen im Array finden

    public int findeMaximaleSummeVonNMinus1Zahlen(int[] zahlen) {
        int gesamtSumme = 0;
        int minZahl = Integer.MAX_VALUE;

        for (int zahl : zahlen) {
            gesamtSumme += zahl;
            if (zahl < minZahl) {
                minZahl = zahl;
            }
        }

        return gesamtSumme - minZahl;
    }

    //punkt 4, die minimale Summe von n-1 Zahlen im Array finden

    public int findeMinimaleSummeVonNMinus1Zahlen(int[] zahlen) {
        int gesamtSumme = 0;
        int maxZahl = Integer.MIN_VALUE;

        for (int zahl : zahlen) {
            gesamtSumme += zahl;
            if (zahl > maxZahl) {
                maxZahl = zahl;
            }
        }

        return gesamtSumme - maxZahl;
    }



}

public void main() {
    aufgabe2 aufgabe = new aufgabe2();
    int[] zahlen = {3, 5, 7, 2, 8, 1};

    // Testen der Methode findeMaximaleZahl
    int maxZahl = aufgabe.findeMaximaleZahl(zahlen);
    System.out.println("Die maximale Zahl im Array ist: " + maxZahl);

    // Testen der Methode findeMinimaleZahl
    int minZahl = aufgabe.findeMinimaleZahl(zahlen);
    System.out.println("Die minimale Zahl im Array ist: " + minZahl);

    // Testen der Methode findeMaximaleSummeVonNMinus1Zahlen
    int maxSumme = aufgabe.findeMaximaleSummeVonNMinus1Zahlen(zahlen);
    System.out.println("Die maximale Summe von n-1 Zahlen im Array ist: " + maxSumme);

    // Testen der Methode findeMinimaleSummeVonNMinus1Zahlen
    int minSumme = aufgabe.findeMinimaleSummeVonNMinus1Zahlen(zahlen);
    System.out.println("Die minimale Summe von n-1 Zahlen im Array ist: " + minSumme);

}