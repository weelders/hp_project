package fr.weelders.hp_project.Bean;

public class Competence
{
    private final int id_competence;
    private final String nom_competence;
    private final Boolean is_scolaire;

    public Competence(int id_competence, String nom_competence, Boolean is_scolaire)
    {
        this.id_competence = id_competence;
        this.nom_competence = nom_competence;
        this.is_scolaire = is_scolaire;
    }

    public int getId_competence()
    {
        return id_competence;
    }

    public String getNom_competence()
    {
        return nom_competence;
    }

    public Boolean getIs_scolaire()
    {
        return is_scolaire;
    }
}
