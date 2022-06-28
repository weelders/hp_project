package fr.weelders.hp_project.Bean;

public class Bois
{
    private final int id_bois;
    private final String nom_bois;

    public Bois(int id_bois, String nom_bois)
    {
        this.id_bois = id_bois;
        this.nom_bois = nom_bois;
    }

    public int getId_bois()
    {
        return id_bois;
    }

    public String getNom_bois()
    {
        return nom_bois;
    }
}
