package fr.weelders.hp_project.Bean;

public class Niveau_soc
{
    private final int id_niveau_soc;
    private final String nom_niveau_soc;

    public Niveau_soc(int id_niveau_soc, String nom_niveau_soc)
    {
        this.id_niveau_soc = id_niveau_soc;
        this.nom_niveau_soc = nom_niveau_soc;
    }

    public int getId_niveau_soc()
    {
        return id_niveau_soc;
    }

    public String getNom_niveau_soc()
    {
        return nom_niveau_soc;
    }
}
