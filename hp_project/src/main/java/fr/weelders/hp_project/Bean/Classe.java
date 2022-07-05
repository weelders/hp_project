package fr.weelders.hp_project.Bean;

public class Classe
{
    private final int id_classe;
    private final String nbr_classe;

    public Classe(int id_classe, String nbr_classe)
    {
        this.id_classe = id_classe;
        this.nbr_classe = nbr_classe;
    }

    public int getId_classe()
    {
        return id_classe;
    }

    public String getNbr_classe()
    {
        return nbr_classe;
    }
}
