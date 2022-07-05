package fr.weelders.hp_project.Bean;

public class Nez
{
    private final int id_nez;
    private final String type_nez;

    public Nez(int id_nez, String type_nez)
    {
        this.id_nez = id_nez;
        this.type_nez = type_nez;
    }

    public int getId_nez()
    {
        return id_nez;
    }

    public String getType_nez()
    {
        return type_nez;
    }
}
