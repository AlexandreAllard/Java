package allard.alexandre.classe2.part1;

public class LocationList {
    public static int NOMBRE_TOTAL_EMPLACEMENTS = 12;
    public static int NOMBRE_EMPLACEMENTS_60 = 3;
    public static int NOMBRE_EMPLACEMENTS_100 = 4;
    public static int NOMBRE_EMPLACEMENTS_150 = 3;
    public static int NOMBRE_EMPLACEMENTS_200 = 2;
    public Location emplacements[] = new Location[NOMBRE_TOTAL_EMPLACEMENTS];

    /*
    3 60m2 10€
    4 100m2 20€
    3 150m2 30€
    2 200m2 40€
     */

    public void initLocations() {
        //Initialisation des emplacements de 60m2
        for (int i = 0; i < NOMBRE_EMPLACEMENTS_60; ++i) {
            emplacements[i] = new Location(i, 60, 10, 0, 0);
        }

        //Initialisation des emplacements de 100m2
        for (int i = 3; i < 7; ++i) {
            emplacements[i] = new Location(i, 100, 20, 0, 0);
        }
        //Initialisation des emplacements de 150m2
        for (int i = NOMBRE_EMPLACEMENTS_60 + NOMBRE_EMPLACEMENTS_100; i < (NOMBRE_EMPLACEMENTS_60 + NOMBRE_EMPLACEMENTS_100 + NOMBRE_EMPLACEMENTS_150); ++i) {
            emplacements[i] = new Location(i, 150, 30, 0, 0);
        }
        //Initialisation des emplacements de 200m2
        for (int i = NOMBRE_EMPLACEMENTS_60 + NOMBRE_EMPLACEMENTS_100 + NOMBRE_EMPLACEMENTS_150; i < NOMBRE_TOTAL_EMPLACEMENTS; ++i) {
            emplacements[i] = new Location(i, 200, 30, 0, 0);
        }

    }

    //Affichage des emplacements
    public void displayLocations() {
        for (int i = 0; i < NOMBRE_TOTAL_EMPLACEMENTS; ++i) {
            emplacements[i].display();
        }
    }

    public Location getFreeLocation(int size, int day) {
        for (int i = 0; i < NOMBRE_TOTAL_EMPLACEMENTS; ++i) {
            if (emplacements[i].taille == size && emplacements[i].jour_debut_location == 0 && emplacements[i].jour_fin_location == 0) {
                System.out.println("L'emplacement " + emplacements[i].id + " semble correspondre à vos besoins!");
                return emplacements[i];
            }

            /*
            //Traitement des propositions de tailles plus grandes
            if (size == 200){
                return null;
            }
            if (size == 60){
                size += 40;
            } else {
                size +=50;
            }*/

        }

        return null;
    }

}
