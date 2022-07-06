package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDAO
{
    //////////////////////////////////////////////////////////////////////////////////
    //ADD DATA
    //////////////////////////////////////////////////////////////////////////////////
    public static void addNewAttitude(Attitude attitude) throws SQLException
    {
        String query = "INSERT INTO attitude (type_attitude) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,attitude.getType_attitude());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

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

    public static void addNewBois(Bois bois) throws SQLException
    {
        String query = "INSERT INTO bois (nom_bois) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,bois.getNom_bois());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewBouche(Bouche bouche) throws SQLException
    {
        String query = "INSERT INTO bouche (type_bouche) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,bouche.getType_bouche());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCaracteristique(Caracteristique caracteristique) throws SQLException
    {
        String query = "INSERT INTO caracteristique (nom_caracteristique) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,caracteristique.getNom_caracteristique());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCheveux(Cheveux cheveux) throws SQLException
    {
        String query = "INSERT INTO cheveux (coupe_cheveux) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,cheveux.getCoupe_cheveux());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewClasse(Classe classe) throws SQLException
    {
        String query = "INSERT INTO classe (nbr_classe) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, classe.getNbr_classe());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCoeur(Coeur coeur) throws SQLException
    {
        String query = "INSERT INTO coeur (nom_coeur, id_rarete_coeur) VALUES(?,?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, coeur.getNom_coeur());
            ps.setInt(2,coeur.getRarete().getId_rarete());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCompetence(Competence competence) throws SQLException
    {
        String query = "INSERT INTO competence (nom_competence, is_scolaire) VALUES(?,?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, competence.getNom_competence());
            ps.setBoolean(2, competence.getIs_scolaire());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCorpulence(Corpulence corpulence) throws SQLException
    {
        String query = "INSERT INTO corpulence (type_corpulence) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, corpulence.getType_corpulence());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCouleurCheveux(Couleur_cheveux couleurCheveux) throws SQLException
    {
        String query = "INSERT INTO couleur_cheveux (nom_couleur_cheveux) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, couleurCheveux.getNom_couleur_cheveux());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewCouleurYeux(Couleur_yeux couleurYeux) throws SQLException
    {
        String query = "INSERT INTO couleur_yeux (nom_couleur_yeux) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, couleurYeux.getNom_couleur_yeux());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewEpaisseur(Epaisseur epaisseur) throws SQLException
    {
        String query = "INSERT INTO epaisseur (nom_epaisseur) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, epaisseur.getNom_epaisseur());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewFlexibilite(Flexibilite flexibilite) throws SQLException
    {
        String query = "INSERT INTO flexibilite (type_flexibilite) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, flexibilite.getType_flexibilite());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewMaison(Maison maison) throws SQLException
    {
        String query = "INSERT INTO maison (nom_maison) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maison.getNom_maison());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewNationnalite(Nationnalite nationnalite) throws SQLException
    {
        String query = "INSERT INTO nationnalite (nom_nationnalite) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nationnalite.getNom_nationnalite());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewNez(Nez nez) throws SQLException
    {
        String query = "INSERT INTO nez (type_nez) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nez.getType_nez());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewNiveauSoc(Niveau_soc niveauSoc) throws SQLException
    {
        String query = "INSERT INTO niveau_soc (nom_niveau_soc) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, niveauSoc.getNom_niveau_soc());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewParler(Parler parler) throws SQLException
    {
        String query = "INSERT INTO parler (facon_parler) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, parler.getFacon_parler());
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

    public static void addNewRarete(Rarete rarete) throws SQLException
    {
        String query = "INSERT INTO rarete (nom_rarete) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,rarete.getNom_rarete());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewRegard(Regard regard) throws SQLException
    {
        String query = "INSERT INTO regard (type_regard) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,regard.getType_regard());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewSang(Sang sang) throws SQLException
    {
        String query = "INSERT INTO sang (nom_sang) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,sang.getNom_sang());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewSexe(Sexe sexe) throws SQLException
    {
        String query = "INSERT INTO sexe (type_sexe) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,sexe.getType_sexe());
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

    public static void addNewTailleBaguette(TailleBaguette tailleBaguette) throws SQLException
    {
        String query = "INSERT INTO taille_baguette (nom_taille_baguette) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,tailleBaguette.getNom_taille_baguette());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewVisage(Visage visage) throws SQLException
    {
        String query = "INSERT INTO visage (forme_visage) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,visage.getForme_visage());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewVoix(Voix voix) throws SQLException
    {
        String query = "INSERT INTO voix (type_voix) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, voix.getType_voix());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addNewYeux(Yeux yeux) throws SQLException
    {
        String query = "INSERT INTO yeux (forme_yeux) VALUES(?);";

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, yeux.getForme_yeux());
            ps.execute();
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
