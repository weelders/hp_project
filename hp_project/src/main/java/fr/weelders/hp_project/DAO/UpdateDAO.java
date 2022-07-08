package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDAO
{
    //////////////////////////////////////////////////////////////////////////////////
    //ADD DATA
    //////////////////////////////////////////////////////////////////////////////////
    public static void updateAttitude(Attitude attitude, int id) throws SQLException
    {
        String query = "UPDATE attitude SET type_attitude = ? WHERE id_attitude = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,attitude.getType_attitude());
            ps.setInt(2,id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateBaguette(Baguette baguette, int id) throws SQLException
    {
        String query = "UPDATE baguette SET id_flexibilite_baguette = ?,id_coeur_baguette = ?,id_bois_baguette = ?,id_epaisseur_baguette = ?,id_taille_baguette = ? WHERE id_baguette = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,baguette.getFlexibilite().getId_flexibilite());
            ps.setInt(2,baguette.getCoeur().getId_coeur());
            ps.setInt(3,baguette.getBois().getId_bois());
            ps.setInt(4,baguette.getEpaisseur().getId_epaisseur());
            ps.setInt(5,baguette.getTaille_baguette().getId_taille_baguette());
            ps.setInt(6,id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateBois(Bois bois, int id) throws SQLException
    {
        String query = "UPDATE bois SET nom_bois = ? WHERE id_bois = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,bois.getNom_bois());
            ps.setInt(2,id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateBouche(Bouche bouche, int id) throws SQLException
    {
        String query = "UPDATE bouche SET type_bouche = ? WHERE id_bouche = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,bouche.getType_bouche());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCaracteristique(Caracteristique caracteristique, int id) throws SQLException
    {
        String query = "UPDATE caracteristique SET nom_caracteristique = ? WHERE id_caracteristique = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,caracteristique.getNom_caracteristique());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCheveux(Cheveux cheveux, int id) throws SQLException
    {
        String query = "UPDATE cheveux SET coupe_cheveux = ? WHERE id_cheveux = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,cheveux.getCoupe_cheveux());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void udateClasse(Classe classe, int id) throws SQLException
    {
        String query = "UPDATE classe SET nbr_classe = ? WHERE id_classe = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, classe.getNbr_classe());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCoeur(Coeur coeur, int id) throws SQLException
    {
        String query = "UPDATE coeur SET nom_coeur = ?, id_rarete_coeur = ? WHERE id_coeur = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, coeur.getNom_coeur());
            ps.setInt(2,coeur.getRarete().getId_rarete());
            ps.setInt(3, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCompetence(Competence competence, int id) throws SQLException
    {
        String query = "UPDATE competence SET nom_competence= ?, is_scolaire = ? WHERE id_competence = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, competence.getNom_competence());
            ps.setBoolean(2, competence.getIs_scolaire());
            ps.setInt(3, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCorpulence(Corpulence corpulence, int id) throws SQLException
    {
        String query = "UPDATE corpulence SET type_corpulence = ? WHERE id_corpulence = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, corpulence.getType_corpulence());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCouleurCheveux(Couleur_cheveux couleurCheveux, int id) throws SQLException
    {
        String query = "UPDATE couleur_cheveux SET nom_couleur_cheveux = ? WHERE id_couleur_cheveux = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, couleurCheveux.getNom_couleur_cheveux());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateCouleurYeux(Couleur_yeux couleurYeux, int id) throws SQLException
    {
        String query = "UPDATE couleur_yeux SET nom_couleur_yeux = ? WHERE id_couleur_yeux = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, couleurYeux.getNom_couleur_yeux());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateEpaisseur(Epaisseur epaisseur, int id) throws SQLException
    {
        String query = "UPDATE epaisseur SET nom_epaisseur = ? WHERE id_epaisseur = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, epaisseur.getNom_epaisseur());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateFlexibilite(Flexibilite flexibilite, int id) throws SQLException
    {
        String query = "UPDATE flexibilite SET type_flexibilite = ? WHERE id_flexibilite = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, flexibilite.getType_flexibilite());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateMaison(Maison maison, int id) throws SQLException
    {
        String query = "UPDATE maison SET nom_maison = ? WHERE id_maison = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maison.getNom_maison());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateNationnalite(Nationnalite nationnalite, int id) throws SQLException
    {
        String query = "UPDATE nationnalite SET nom_nationnalite = ? WHERE id_nationnalite = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nationnalite.getNom_nationnalite());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateNez(Nez nez, int id) throws SQLException
    {
        String query = "UPDATE nez SET type_nez = ? WHERE id_nez = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nez.getType_nez());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateNiveauSoc(Niveau_soc niveauSoc, int id) throws SQLException
    {
        String query = "UPDATE niveau_soc SET nom_niveau_soc = ? WHERE id_niveau_soc = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, niveauSoc.getNom_niveau_soc());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateParler(Parler parler, int id) throws SQLException
    {
        String query = "UPDATE parler SET facon_parler = ? WHERE id_parler = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, parler.getFacon_parler());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updatePersonnage(Personnage personnage, int id) throws SQLException
    {
        String query = "UPDATE personnage SET is_pj = ?, nom_perso = ?, prenom_perso = ?, img_perso = ?, age_perso = ?, etat_perso = ?, desc_perso = ?, id_niveau_soc_perso = ?, id_nationnalite_perso = ?, id_corpulence_perso = ?, id_baguette_perso = ?, id_bouche_perso = ?, id_nez_perso = ?, id_voix_perso = ?, id_parler_perso = ?, id_attitude_perso = ?, id_yeux_perso = ?, id_cheveux_perso = ?, id_regard_perso = ?, id_visage_perso = ?, id_classe_perso = ?, id_taille_perso = ?, id_sexe_perso = ?, id_maison_perso = ?, id_sang_perso = ?, id_couleur_cheveux_perso = ?, id_couleur_yeux_perso = ? WHERE id_perso = ?;";

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
            ps.setInt(28,id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateRarete(Rarete rarete, int id) throws SQLException
    {
        String query = "UPDATE rarete SET nom_rarete = ? WHERE id_rarete = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,rarete.getNom_rarete());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateRegard(Regard regard, int id) throws SQLException
    {
        String query = "UPDATE regard SET type_regard = ? WHERE id_regard = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,regard.getType_regard());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateSang(Sang sang, int id) throws SQLException
    {
        String query = "UPDATE sang SET nom_sang = ? WHERE id_sang = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,sang.getNom_sang());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateSexe(Sexe sexe, int id) throws SQLException
    {
        String query = "UPDATE sexe SET type_sexe = ? WHERE id_sexe = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,sexe.getType_sexe());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateTaille(Taille taille, int id) throws SQLException
    {
        String query = "UPDATE taille SET mesure_taille = ? WHERE id_taille = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,taille.getMesure_taille());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateTailleBaguette(TailleBaguette tailleBaguette, int id) throws SQLException
    {
        String query = "UPDATE taille_baguette SET nom_taille_baguette = ? WHERE id_taille_baguette = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,tailleBaguette.getNom_taille_baguette());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateVisage(Visage visage, int id) throws SQLException
    {
        String query = "UPDATE visage SET forme_visage = ? WHERE id_visage = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,visage.getForme_visage());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateVoix(Voix voix, int id) throws SQLException
    {
        String query = "UPDATE voix SET type_voix = ? WHERE id_voix = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, voix.getType_voix());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateYeux(Yeux yeux, int id) throws SQLException
    {
        String query = "UPDATE yeux SET forme_yeux = ? WHERE id_yeux = ?;";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, yeux.getForme_yeux());
            ps.setInt(2, id);
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
