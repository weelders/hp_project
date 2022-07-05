package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.Baguette;
import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.Bean.Taille;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDAO
{
    //////////////////////////////////////////////////////////////////////////////////
    //ADD DATA
    //////////////////////////////////////////////////////////////////////////////////
    public static void addNewBaguette(Baguette baguette) throws SQLException
    {
        String query = "INSERT INTO baguette (id_flexibilite_baguette,id_coeur_baguette,id_bois_baguette,id_epaisseur_baguette,id_taille_baguette) VALUES(?,?,?,?,?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,baguette.getFlexibilite().getId_flexibilite());
            ps.setInt(2,baguette.getCoeur().getId_coeur());
            ps.setInt(3,baguette.getBois().getId_bois());
            ps.setInt(4,baguette.getEpaisseur().getId_epaisseur());
            ps.setInt(5,baguette.getTaille_baguette().getId_taille_baguette());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewTaille(Taille taille) throws SQLException
    {
        String query = "INSERT INTO taille (mesure_taille) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,taille.getMesure_taille());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewPersonnage(Personnage personnage) throws SQLException
    {
        String query = "INSERT INTO personnage (is_pj, nom_perso, prenom_perso, img_perso, age_perso, etat_perso, desc_perso, id_niveau_soc_perso, id_nationnalite_perso, id_corpulence_perso, id_baguette_perso, id_bouche_perso, id_nez_perso, id_voix_perso, id_parler_perso, id_attitude_perso, id_yeux_perso, id_cheveux_perso, id_regard_perso, id_visage_perso, id_classe_perso, id_taille_perso, id_sexe_perso, id_maison_perso, id_sang_perso, id_couleur_cheveux_perso, id_couleur_yeux_perso) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setBoolean(1,personnage.getIs_pj());
            ps.setString(2,personnage.getNom_perso());
            ps.setString(3,personnage.getPrenom_perso());
            ps.setString(4,personnage.getImg_perso());
            ps.setByte(5,personnage.getAge_perso());
            ps.setBoolean(6,personnage.getEtat_perso());
            ps.setString(7,personnage.getDesc_perso());
            ps.setInt(8,personnage.getNiveau_soc_perso().getId_niveau_soc());
            ps.setInt(9,personnage.getNationnalite_perso().getId_nationnalite());
            ps.setInt(10,personnage.getCorpulence_perso().getId_corpulence());
            ps.setInt(11,personnage.getBaguette_perso().getId_baguette());
            ps.setInt(12,personnage.getBouche_perso().getId_bouche());
            ps.setInt(13,personnage.getNez_perso().getId_nez());
            ps.setInt(14,personnage.getVoix_perso().getId_voix());
            ps.setInt(15,personnage.getParler_perso().getId_parler());
            ps.setInt(16,personnage.getAttitude_perso().getId_attitude());
            ps.setInt(17,personnage.getYeux_perso().getId_yeux());
            ps.setInt(18,personnage.getCheveux_perso().getId_cheveux());
            ps.setInt(19,personnage.getRegard_perso().getId_regard());
            ps.setInt(20,personnage.getVisage_perso().getId_visage());
            ps.setInt(21,personnage.getClasse_perso().getId_classe());
            ps.setInt(22,personnage.getTaille_perso().getId_taille());
            ps.setInt(23,personnage.getSexe_perso().getId_sexe());
            ps.setInt(24,personnage.getMaison_perso().getId_maison());
            ps.setInt(25,personnage.getSang_perso().getId_sang());
            ps.setInt(26,personnage.getCouleur_cheveux_perso().getId_couleur_cheveux());
            ps.setInt(27,personnage.getCouleur_yeux_perso().getId_couleur_yeux());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
