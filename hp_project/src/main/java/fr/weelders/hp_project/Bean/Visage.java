package fr.weelders.hp_project.Bean;

public class Visage
{
    private final int id_visage;
    private final String forme_visage;

    public Visage(int id_visage, String forme_visage)
    {
        this.id_visage = id_visage;
        this.forme_visage = forme_visage;
    }

    public int getId_visage()
    {
        return id_visage;
    }

    public String getForme_visage()
    {
        return forme_visage;
    }
}
