package fr.weelders.hp_project.Bean;

public class Couleur_yeux
{
    private final int id_couleur_yeux;
    private final String nom_couleur_yeux;

    public Couleur_yeux(int id_couleur_yeux, String nom_couleur_yeux)
    {
        this.id_couleur_yeux = id_couleur_yeux;
        this.nom_couleur_yeux = nom_couleur_yeux;
    }

    public int getId_couleur_yeux()
    {
        return id_couleur_yeux;
    }

    public String getNom_couleur_yeux()
    {
        return nom_couleur_yeux;
    }
}
