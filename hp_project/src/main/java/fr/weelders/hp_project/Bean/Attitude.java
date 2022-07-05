package fr.weelders.hp_project.Bean;

public class Attitude
{
    private final int id_attitude;
    private final String type_attitude;

    public Attitude(int id_attitude, String type_attitude)
    {
        this.id_attitude = id_attitude;
        this.type_attitude = type_attitude;
    }

    public int getId_attitude()
    {
        return id_attitude;
    }

    public String getType_attitude()
    {
        return type_attitude;
    }
}
