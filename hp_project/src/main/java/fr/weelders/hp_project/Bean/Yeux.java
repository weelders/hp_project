package fr.weelders.hp_project.Bean;

public class Yeux
{
    private final int id_yeux;
    private final String forme_yeux;

    public Yeux(int id_yeux, String forme_yeux)
    {
        this.id_yeux = id_yeux;
        this.forme_yeux = forme_yeux;
    }

    public int getId_yeux()
    {
        return id_yeux;
    }

    public String getForme_yeux()
    {
        return forme_yeux;
    }
}
