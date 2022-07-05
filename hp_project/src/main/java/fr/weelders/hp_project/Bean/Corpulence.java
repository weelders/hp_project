package fr.weelders.hp_project.Bean;

public class Corpulence
{
    private final int id_corpulence;
    private final String type_corpulence;

    public Corpulence(int id_corpulence, String type_corpulence)
    {
        this.id_corpulence = id_corpulence;
        this.type_corpulence = type_corpulence;
    }

    public int getId_corpulence()
    {
        return id_corpulence;
    }

    public String getType_corpulence()
    {
        return type_corpulence;
    }
}
