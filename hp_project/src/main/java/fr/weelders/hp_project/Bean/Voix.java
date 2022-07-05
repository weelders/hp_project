package fr.weelders.hp_project.Bean;

public class Voix
{
    private final int id_voix;
    private final String type_voix;

    public Voix(int id_voix, String type_voix)
    {
        this.id_voix = id_voix;
        this.type_voix = type_voix;
    }

    public int getId_voix()
    {
        return id_voix;
    }

    public String getType_voix()
    {
        return type_voix;
    }
}
