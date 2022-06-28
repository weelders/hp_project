package fr.weelders.hp_project.Bean;

public class Rarete
{
    private final int id_rarete;
    private final String nom_rarete;

    public Rarete(int id_rarete, String nom_rarete)
    {
        this.id_rarete = id_rarete;
        this.nom_rarete = nom_rarete;
    }

    public int getId_rarete()
    {
        return id_rarete;
    }

    public String getNom_rarete()
    {
        return nom_rarete;
    }
}
