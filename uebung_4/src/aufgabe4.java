public class aufgabe4 {
    //billigste Tastatur finden
    public int findeBilligsteTastatur(int[] preise) {
        if (preise.length == 0) {
            return -1; //falls liste lehr
        }
        // nehmen an, das erste Element ist das billigste
        int billigsterPreis = preise[0];

        // Gehe durch den Rest der Liste
        for (int i = 1; i < preise.length; i++) {
            if (preise[i] < billigsterPreis) {
                //billigeres element gefunden
                billigsterPreis = preise[i];
            }
        }
        return billigsterPreis;
    }




    public static  void main(String[] args) {
        aufgabe4 aufgabe = new aufgabe4();

        //1. Billigste Tastatur finden
        int[] tastaturPreise1 = {40, 35, 70, 15, 45};
        System.out.println("1. Billigste Tastatur: " + aufgabe.findeBilligsteTastatur(tastaturPreise1));

        //

    }
}
