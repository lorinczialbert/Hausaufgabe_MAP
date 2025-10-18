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





}

public void main() {
    aufgabe2 aufgabe = new aufgabe2();
    int[] zahlen = {3, 5, 7, 2, 8, 1};

    // Testen der Methode findeMaximaleZahl
    int maxZahl = aufgabe.findeMaximaleZahl(zahlen);
    System.out.println("Die maximale Zahl im Array ist: " + maxZahl);

}