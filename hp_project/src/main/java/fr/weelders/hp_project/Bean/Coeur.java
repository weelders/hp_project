package fr.weelders.hp_project.Bean;

public class Coeur
{
    private final int id_coeur;
    private final String nom_coeur;
    private final Rarete rarete;

    public Coeur(int id_coeur, String nom_coeur, Rarete rarete)
    {
        this.id_coeur = id_coeur;
        this.nom_coeur = nom_coeur;
        this.rarete = rarete;
    }

    public int getId_coeur()
    {
        return id_coeur;
    }

    public String getNom_coeur()
    {
        return nom_coeur;
    }

    public Rarete getRarete()
    {
        return rarete;
    }
}
