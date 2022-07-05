package fr.weelders.hp_project.Bean;

public class Taille
{
    private final int id_taille;
    private final int mesure_taille;

    public Taille(int id_taille, int mesure_taille)
    {
        this.id_taille = id_taille;
        this.mesure_taille = mesure_taille;
    }

    public int getId_taille()
    {
        return id_taille;
    }

    public int getMesure_taille()
    {
        return mesure_taille;
    }
}
