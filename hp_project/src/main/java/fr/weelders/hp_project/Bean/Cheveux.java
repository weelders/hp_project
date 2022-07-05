package fr.weelders.hp_project.Bean;

public class Cheveux
{
    private final int id_cheveux;
    private final String coupe_cheveux;

    public Cheveux(int id_cheveux, String coupe_cheveux)
    {
        this.id_cheveux = id_cheveux;
        this.coupe_cheveux = coupe_cheveux;
    }

    public int getId_cheveux()
    {
        return id_cheveux;
    }

    public String getCoupe_cheveux()
    {
        return coupe_cheveux;
    }
}
