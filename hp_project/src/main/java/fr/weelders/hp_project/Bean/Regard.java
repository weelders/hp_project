package fr.weelders.hp_project.Bean;

public class Regard
{
    private final int id_regard;
    private final String type_regard;

    public Regard(int id_regard, String type_regard)
    {
        this.id_regard = id_regard;
        this.type_regard = type_regard;
    }

    public int getId_regard()
    {
        return id_regard;
    }

    public String getType_regard()
    {
        return type_regard;
    }
}
