package allard.alexandre.classe2.part1;

public class Location {
    public int id;
    public int taille;
    public int prix;
    public int jour_debut_location;
    public int jour_fin_location;

    public Location(int id, int taille, int prix, int jour_debut_location, int jour_fin_location) {
        // On initialise toutes les composantes d'un emplacement
        this.id = id;
        this.taille = taille;
        this.prix = prix;
        this.jour_debut_location = jour_debut_location;
        this.jour_fin_location = jour_fin_location;
    }

    public void display(){
        if (jour_fin_location == 0 && jour_debut_location == 0) { //Emplacement libre car jour début et fin sont à zéro
            System.out.println("Emplacement " + id + " : " + taille + "m2 = libre");
        } else { //Emplacement loué
            System.out.println("Emplacement " + id + " : " + taille + "m2 = actuellement loué du jour " + jour_debut_location + " au jour " + jour_fin_location);

        }
    }
}
