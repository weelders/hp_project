package fr.weelders.hp_project.Bean;

public class Couleur_cheveux
{
    private final int id_couleur_cheveux;
    private final String nom_couleur_cheveux;

    public Couleur_cheveux(int id_couleur_cheveux, String nom_couleur_cheveux)
    {
        this.id_couleur_cheveux = id_couleur_cheveux;
        this.nom_couleur_cheveux = nom_couleur_cheveux;
    }

    public int getId_couleur_cheveux()
    {
        return id_couleur_cheveux;
    }

    public String getNom_couleur_cheveux()
    {
        return nom_couleur_cheveux;
    }
}
