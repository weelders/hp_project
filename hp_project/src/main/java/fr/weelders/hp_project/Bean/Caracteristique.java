package fr.weelders.hp_project.Bean;

public class Caracteristique
{
    private final int id_caracteristique;
    private final String nom_caracteristique;

    public Caracteristique(int id_caracteristique, String nom_caracteristique)
    {
        this.id_caracteristique = id_caracteristique;
        this.nom_caracteristique = nom_caracteristique;
    }

    public int getId_caracteristique()
    {
        return id_caracteristique;
    }

    public String getNom_caracteristique()
    {
        return nom_caracteristique;
    }
}
