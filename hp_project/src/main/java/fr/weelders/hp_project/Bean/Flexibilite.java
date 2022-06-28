package fr.weelders.hp_project.Bean;

public class Flexibilite
{
    private final int id_flexibilite;
    private final String type_flexibilite;

    public Flexibilite(int id_flexibilite, String type_flexibilite)
    {
        this.id_flexibilite = id_flexibilite;
        this.type_flexibilite = type_flexibilite;
    }

    public int getId_flexibilite()
    {
        return id_flexibilite;
    }

    public String getType_flexibilite()
    {
        return type_flexibilite;
    }
}
