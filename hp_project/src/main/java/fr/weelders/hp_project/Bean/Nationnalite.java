package fr.weelders.hp_project.Bean;

public class Nationnalite
{
    private final int id_nationnalite;
    private final String nom_nationnalite;

    public Nationnalite(int id_nationnalite, String nom_nationnalite)
    {
        this.id_nationnalite = id_nationnalite;
        this.nom_nationnalite = nom_nationnalite;
    }

    public int getId_nationnalite()
    {
        return id_nationnalite;
    }

    public String getNom_nationnalite()
    {
        return nom_nationnalite;
    }
}
