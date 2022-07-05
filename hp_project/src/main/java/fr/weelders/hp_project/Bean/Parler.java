package fr.weelders.hp_project.Bean;

public class Parler
{
    private final int id_parler;
    private final String facon_parler;

    public Parler(int id_parler, String facon_parler)
    {
        this.id_parler = id_parler;
        this.facon_parler = facon_parler;
    }

    public int getId_parler()
    {
        return id_parler;
    }

    public String getFacon_parler()
    {
        return facon_parler;
    }
}
