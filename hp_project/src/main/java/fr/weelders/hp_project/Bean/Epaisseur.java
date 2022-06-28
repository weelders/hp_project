package fr.weelders.hp_project.Bean;

public class Epaisseur
{
    private final int id_epaisseur;
    private final String nom_epaisseur;

    public Epaisseur(int id_epaisseur, String nom_epaisseur)
    {
        this.id_epaisseur = id_epaisseur;
        this.nom_epaisseur = nom_epaisseur;
    }

    public int getId_epaisseur()
    {
        return id_epaisseur;
    }

    public String getNom_epaisseur()
    {
        return nom_epaisseur;
    }
}
