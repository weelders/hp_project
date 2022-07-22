package fr.weelders.hp_project.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

public class Personnage
{
    private int id_perso = 0;
    private final Boolean is_pj;
    private final String nom_perso;
    private final String prenom_perso;
    private String img_perso = "";
    private byte age_perso = 0;
    private Boolean etat_perso = true;
    private String desc_perso = "";
    private Niveau_soc niveau_soc_perso = null;
    private Nationnalite nationnalite_perso = null;
    private Corpulence corpulence_perso = null;
    private Baguette baguette_perso = null;
    private Bouche bouche_perso = null;
    private Nez nez_perso = null;
    private Voix voix_perso = null;
    private Parler parler_perso = null;
    private Attitude attitude_perso = null;
    private Yeux yeux_perso = null;
    private Cheveux cheveux_perso = null;
    private Regard regard_perso = null;
    private Visage visage_perso = null;
    private Classe classe_perso = null;
    private Taille taille_perso = null;
    private Sexe sexe_perso = null;
    private Maison maison_perso = null;
    private Sang sang_perso = null;
    private Couleur_cheveux couleur_cheveux_perso = null;
    private Couleur_yeux couleur_yeux_perso = null;

    public Personnage(int id_perso, Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso, Niveau_soc niveau_soc_perso, Nationnalite nationnalite_perso, Corpulence corpulence_perso, Baguette baguette_perso, Bouche bouche_perso, Nez nez_perso, Voix voix_perso, Parler parler_perso, Attitude attitude_perso, Yeux yeux_perso, Cheveux cheveux_perso, Regard regard_perso, Visage visage_perso, Classe classe_perso, Taille taille_perso, Sexe sexe_perso, Maison maison_perso, Sang sang_perso, Couleur_cheveux couleur_cheveux_perso, Couleur_yeux couleur_yeux_perso)
    {
        this.id_perso = id_perso;
        this.is_pj = is_pj;
        this.nom_perso = nom_perso;
        this.prenom_perso = prenom_perso;
        this.img_perso = img_perso;
        this.age_perso = age_perso;
        this.etat_perso = etat_perso;
        this.desc_perso = desc_perso;
        this.niveau_soc_perso = niveau_soc_perso;
        this.nationnalite_perso = nationnalite_perso;
        this.corpulence_perso = corpulence_perso;
        this.baguette_perso = baguette_perso;
        this.bouche_perso = bouche_perso;
        this.nez_perso = nez_perso;
        this.voix_perso = voix_perso;
        this.parler_perso = parler_perso;
        this.attitude_perso = attitude_perso;
        this.yeux_perso = yeux_perso;
        this.cheveux_perso = cheveux_perso;
        this.regard_perso = regard_perso;
        this.visage_perso = visage_perso;
        this.classe_perso = classe_perso;
        this.taille_perso = taille_perso;
        this.sexe_perso = sexe_perso;
        this.maison_perso = maison_perso;
        this.sang_perso = sang_perso;
        this.couleur_cheveux_perso = couleur_cheveux_perso;
        this.couleur_yeux_perso = couleur_yeux_perso;
    }

    public Personnage(Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso, Niveau_soc niveau_soc_perso, Nationnalite nationnalite_perso, Corpulence corpulence_perso, Baguette baguette_perso, Bouche bouche_perso, Nez nez_perso, Voix voix_perso, Parler parler_perso, Attitude attitude_perso, Yeux yeux_perso, Cheveux cheveux_perso, Regard regard_perso, Visage visage_perso, Classe classe_perso, Taille taille_perso, Sexe sexe_perso, Maison maison_perso, Sang sang_perso, Couleur_cheveux couleur_cheveux_perso, Couleur_yeux couleur_yeux_perso)
    {
        this.is_pj = is_pj;
        this.nom_perso = nom_perso;
        this.prenom_perso = prenom_perso;
        this.img_perso = img_perso;
        this.age_perso = age_perso;
        this.etat_perso = etat_perso;
        this.desc_perso = desc_perso;
        this.niveau_soc_perso = niveau_soc_perso;
        this.nationnalite_perso = nationnalite_perso;
        this.corpulence_perso = corpulence_perso;
        this.baguette_perso = baguette_perso;
        this.bouche_perso = bouche_perso;
        this.nez_perso = nez_perso;
        this.voix_perso = voix_perso;
        this.parler_perso = parler_perso;
        this.attitude_perso = attitude_perso;
        this.yeux_perso = yeux_perso;
        this.cheveux_perso = cheveux_perso;
        this.regard_perso = regard_perso;
        this.visage_perso = visage_perso;
        this.classe_perso = classe_perso;
        this.taille_perso = taille_perso;
        this.sexe_perso = sexe_perso;
        this.maison_perso = maison_perso;
        this.sang_perso = sang_perso;
        this.couleur_cheveux_perso = couleur_cheveux_perso;
        this.couleur_yeux_perso = couleur_yeux_perso;
    }

    public Personnage(Boolean is_pj, String nom_perso, String prenom_perso)
    {
        this.is_pj = is_pj;
        this.nom_perso = nom_perso;
        this.prenom_perso = prenom_perso;
    }

    public Personnage(Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso)
    {
        this.is_pj = is_pj;
        this.nom_perso = nom_perso;
        this.prenom_perso = prenom_perso;
        this.img_perso = img_perso;
        this.age_perso = age_perso;
        this.etat_perso = etat_perso;
        this.desc_perso = desc_perso;
    }

    public int getId_perso()
    {
        return id_perso;
    }

    public Boolean getIs_pj()
    {
        return is_pj;
    }

    public String getNom_perso()
    {
        return nom_perso;
    }

    public String getPrenom_perso()
    {
        return prenom_perso;
    }

    public String getImg_perso()
    {
        return img_perso;
    }

    public byte getAge_perso()
    {
        return age_perso;
    }

    public Boolean getEtat_perso()
    {
        return etat_perso;
    }

    public String getDesc_perso()
    {
        return desc_perso;
    }

    public Niveau_soc getNiveau_soc_perso()
    {
        return niveau_soc_perso;
    }

    public Nationnalite getNationnalite_perso()
    {
        return nationnalite_perso;
    }

    public Corpulence getCorpulence_perso()
    {
        return corpulence_perso;
    }

    public Baguette getBaguette_perso()
    {
        return baguette_perso;
    }

    public Bouche getBouche_perso()
    {
        return bouche_perso;
    }

    public Nez getNez_perso()
    {
        return nez_perso;
    }

    public Voix getVoix_perso()
    {
        return voix_perso;
    }

    public Parler getParler_perso()
    {
        return parler_perso;
    }

    public Attitude getAttitude_perso()
    {
        return attitude_perso;
    }

    public Yeux getYeux_perso()
    {
        return yeux_perso;
    }

    public Cheveux getCheveux_perso()
    {
        return cheveux_perso;
    }

    public Regard getRegard_perso()
    {
        return regard_perso;
    }

    public Visage getVisage_perso()
    {
        return visage_perso;
    }

    public Classe getClasse_perso()
    {
        return classe_perso;
    }

    public Taille getTaille_perso()
    {
        return taille_perso;
    }

    public Sexe getSexe_perso()
    {
        return sexe_perso;
    }

    public Maison getMaison_perso()
    {
        return maison_perso;
    }

    public Sang getSang_perso()
    {
        return sang_perso;
    }

    public Couleur_cheveux getCouleur_cheveux_perso()
    {
        return couleur_cheveux_perso;
    }

    public Couleur_yeux getCouleur_yeux_perso()
    {
        return couleur_yeux_perso;
    }
}
