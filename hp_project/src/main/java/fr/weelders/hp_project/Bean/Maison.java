package fr.weelders.hp_project.Bean;

public class Maison
{
    private final int id_maison;
    private final String nom_maison;

    public Maison(int id_maison, String nom_maison)
    {
        this.id_maison = id_maison;
        this.nom_maison = nom_maison;
    }




    public int getId_maison()
    {
        return id_maison;
    }

    public String getNom_maison()
    {
        return nom_maison;
    }
}
