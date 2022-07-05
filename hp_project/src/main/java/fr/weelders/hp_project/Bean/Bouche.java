package fr.weelders.hp_project.Bean;

public class Bouche
{
    private final int id_bouche;
    private final String type_bouche;

    public Bouche(int id_bouche, String type_bouche)
    {
        this.id_bouche = id_bouche;
        this.type_bouche = type_bouche;
    }

    public int getId_bouche()
    {
        return id_bouche;
    }

    public String getType_bouche()
    {
        return type_bouche;
    }
}
