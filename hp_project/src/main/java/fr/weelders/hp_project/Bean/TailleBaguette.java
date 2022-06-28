package fr.weelders.hp_project.Bean;

public class TailleBaguette
{
    private final int id_taille_baguette;
    private final String nom_taille_baguette;

    public TailleBaguette(int id_taille_baguette, String nom_taille_baguette)
    {
        this.id_taille_baguette = id_taille_baguette;
        this.nom_taille_baguette = nom_taille_baguette;
    }

    public int getId_taille_baguette()
    {
        return id_taille_baguette;
    }

    public String getNom_taille_baguette()
    {
        return nom_taille_baguette;
    }
}
