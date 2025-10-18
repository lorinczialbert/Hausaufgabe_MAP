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
