package fr.weelders.hp_project.Bean;

public class Sang
{
    private final int id_sang;
    private final String nom_sang;

    public Sang(int id_sang, String nom_sang)
    {
        this.id_sang = id_sang;
        this.nom_sang = nom_sang;
    }

    public int getId_sang()
    {
        return id_sang;
    }

    public String getNom_sang()
    {
        return nom_sang;
    }
}
