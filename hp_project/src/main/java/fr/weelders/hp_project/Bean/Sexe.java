package fr.weelders.hp_project.Bean;

public class Sexe
{
    private final int id_sexe;
    private final String type_sexe;

    public Sexe(int id_sexe, String type_sexe)
    {
        this.id_sexe = id_sexe;
        this.type_sexe = type_sexe;
    }


    public int getId_sexe()
    {
        return id_sexe;
    }

    public String getType_sexe()
    {
        return type_sexe;
    }
}
