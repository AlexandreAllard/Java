package allard.alexandre.classe2;
import allard.alexandre.classe2.part1.Location;
import allard.alexandre.classe2.part1.LocationList;
import allard.alexandre.classe2.part1.MobilHome;

public class Launcher {
    public static void main(String[] args) {
        LocationList locations = new LocationList();
        locations.initLocations();
        locations.displayLocations();
        locations.getFreeLocation(100, 10);


        /* Commenté pour la compilation
        Réservation non aboutie
            locations.getFreeLocation(100,4).jour_debut_location = 4;

        Implémentation des MobilHome non achevée
            MobilHome mobilHome = new MobilHome(0, 1, 20, 50, 55);
        */



    }
}