package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetIdDAO
{
    //////////////////////////////////////////////////////////////////////////////////
    //GET DATA BY ID
    //////////////////////////////////////////////////////////////////////////////////
    public static Attitude getAttitudeById(int idAttitude) throws SQLException
    {
        String query = "SELECT * FROM attitude WHERE id_attitude = " + idAttitude;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Attitude(rs.getInt("id_attitude"), rs.getString("type_attitude"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Baguette getBaguetteById(int idBaguette) throws SQLException
    {
        String query = "SELECT * FROM baguette WHERE id_baguette = " + idBaguette;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Baguette(
                        rs.getInt("id_Baguette"),
                        getTailleBaguetteById(rs.getInt("id_taille_baguette")),
                        getEpaisseurById(rs.getInt("id_epaisseur_baguette")),
                        getFlexibiliteById(rs.getInt("id_flexibilite_baguette")),
                        getCoeurById(rs.getInt("id_coeur_baguette")),
                        getBoisById(rs.getInt("id_bois_baguette"))
                );
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Bois getBoisById(int idBois) throws SQLException
    {
        String query = "SELECT * FROM bois WHERE id_bois = " + idBois;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Bois(rs.getInt("id_bois"), rs.getString("nom_bois"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Bouche getBoucheById(int idBouche) throws SQLException
    {
        String query = "SELECT * FROM bouche WHERE id_bouche = " + idBouche;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Bouche(rs.getInt("id_bouche"), rs.getString("type_bouche"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Caracteristique getCaracteristiqueById(int idCaracteristique) throws SQLException
    {
        String query = "SELECT * FROM caracteristique WHERE id_caracteristique = " + idCaracteristique;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Caracteristique(rs.getInt("id_caracteristique"), rs.getString("nom_caracteristique"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Cheveux getCheveuxById(int idCheveux) throws SQLException
    {
        String query = "SELECT * FROM cheveux WHERE id_cheveux = " + idCheveux;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Cheveux(rs.getInt("id_cheveux"), rs.getString("coupe_cheveux"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Classe getClasseById(int idClasse) throws SQLException
    {
        String query = "SELECT * FROM classe WHERE id_classe = " + idClasse;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Classe(rs.getInt("id_classe"), rs.getString("nbr_classe"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Coeur getCoeurById(int idCoeur) throws SQLException
    {
        String query = "SELECT * FROM coeur WHERE id_coeur = " + idCoeur;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Coeur(rs.getInt("id_coeur"), rs.getString("nom_coeur"), getRareteById(rs.getInt("id_rarete_coeur")));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Competence getCompetenceById(int idCompetence) throws SQLException
    {
        String query = "SELECT * FROM competence WHERE id_competence = " + idCompetence;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Competence(rs.getInt("id_competence"), rs.getString("nom_competence"), rs.getBoolean("is_scolaire"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Corpulence getCorpulenceById(int idCorpulence) throws SQLException
    {
        String query = "SELECT * FROM corpulence WHERE id_corpulence = " + idCorpulence;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Corpulence(rs.getInt("id_corpulence"), rs.getString("type_corpulence"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Couleur_cheveux getCouleurCheveuxById(int idCouleurCheveux) throws SQLException
    {
        String query = "SELECT * FROM couleur_cheveux WHERE id_couleur_cheveux = " + idCouleurCheveux;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Couleur_cheveux(rs.getInt("id_couleur_cheveux"), rs.getString("nom_couleur_cheveux"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Couleur_yeux getCouleurYeuxById(int idCouleurYeux) throws SQLException
    {
        String query = "SELECT * FROM couleur_yeux WHERE id_couleur_yeux = " + idCouleurYeux;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Couleur_yeux(rs.getInt("id_couleur_yeux"), rs.getString("nom_couleur_yeux"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Epaisseur getEpaisseurById(int idEpaisseur) throws SQLException
    {
        String query = "SELECT * FROM epaisseur WHERE id_epaisseur = " + idEpaisseur;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            if(rs.next())
            {
                return new Epaisseur(rs.getInt("id_epaisseur"), rs.getString("nom_epaisseur"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Flexibilite getFlexibiliteById(int idFlexibilite) throws SQLException
    {
        String query = "SELECT * FROM flexibilite WHERE id_flexibilite = " + idFlexibilite;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Flexibilite(rs.getInt("id_flexibilite"), rs.getString("type_flexibilite"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Maison getMaisonById(int idMaison) throws SQLException
    {
        String query = "SELECT * FROM maison WHERE id_maison = " + idMaison;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Maison(rs.getInt("id_maison"), rs.getString("nom_maison"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Nationnalite getNationnaliteById(int idNationnalite) throws SQLException
    {
        String query = "SELECT * FROM nationnalite WHERE id_nationnalite = " + idNationnalite;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Nationnalite(rs.getInt("id_nationnalite"), rs.getString("nom_nationnalite"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Nez getNezById(int idNez) throws SQLException
    {
        String query = "SELECT * FROM nez WHERE id_nez = " + idNez;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Nez(rs.getInt("id_nez"), rs.getString("type_nez"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Niveau_soc getNiveauSocById(int idNiveauSoc) throws SQLException
    {
        String query = "SELECT * FROM niveau_soc WHERE id_niveau_soc = " + idNiveauSoc;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Niveau_soc(rs.getInt("id_niveau_soc"), rs.getString("nom_niveau_soc"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Parler getParlerById(int idParler) throws SQLException
    {
        String query = "SELECT * FROM parler WHERE id_parler = " + idParler;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Parler(rs.getInt("id_parler"), rs.getString("facon_parler"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Personnage getPersonnageById(int idPersonnage) throws SQLException
    {
        String query = "SELECT * FROM personnage WHERE id_perso = " + idPersonnage;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Personnage(
                        rs.getInt("id_perso"),
                        rs.getBoolean("is_pj"),
                        rs.getString("nom_perso"),
                        rs.getString("prenom_perso"),
                        rs.getString("img_perso"),
                        rs.getByte("age_perso"),
                        rs.getBoolean("etat_perso"),
                        rs.getString("desc_perso"),
                        getNiveauSocById(rs.getInt("id_niveau_soc_perso")),
                        getNationnaliteById(rs.getInt("id_nationnalite_perso")),
                        getCorpulenceById(rs.getInt("id_corpulence_perso")),
                        getBaguetteById(rs.getInt("id_baguette_perso")),
                        getBoucheById(rs.getInt("id_bouche_perso")),
                        getNezById(rs.getInt("id_nez_perso")),
                        getVoixById(rs.getInt("id_voix_perso")),
                        getParlerById(rs.getInt("id_parler_perso")),
                        getAttitudeById(rs.getInt("id_attitude_perso")),
                        getYeuxById(rs.getInt("id_yeux_perso")),
                        getCheveuxById(rs.getInt("id_cheveux_perso")),
                        getRegardById(rs.getInt("id_regard_perso")),
                        getVisageById(rs.getInt("id_visage_perso")),
                        getClasseById(rs.getInt("id_classe_perso")),
                        getTailleById(rs.getInt("id_taille_perso")),
                        getSexeById(rs.getInt("id_sexe_perso")),
                        getMaisonById(rs.getInt("id_maison_perso")),
                        getSangById(rs.getInt("id_sang_perso")),
                        getCouleurCheveuxById(rs.getInt("id_couleur_cheveux_perso")),
                        getCouleurYeuxById(rs.getInt("id_couleur_yeux_perso"))
                );
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Rarete getRareteById(int idRarete) throws SQLException
    {
        String query = "SELECT * FROM rarete WHERE id_rarete = " + idRarete;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Rarete(rs.getInt("id_rarete"), rs.getString("nom_rarete"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Regard getRegardById(int idRegard) throws SQLException
    {
        String query = "SELECT * FROM regard WHERE id_regard = " + idRegard;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Regard(rs.getInt("id_regard"), rs.getString("type_regard"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Sang getSangById(int idSang) throws SQLException
    {
        String query = "SELECT * FROM sang WHERE id_sang = " + idSang;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Sang(rs.getInt("id_sang"), rs.getString("nom_sang"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Sexe getSexeById(int idSexe) throws SQLException
    {
        String query = "SELECT * FROM sexe WHERE id_sexe = " + idSexe;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Sexe(rs.getInt("id_sexe"), rs.getString("type_sexe"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Taille getTailleById(int idTaille) throws SQLException
    {
        String query = "SELECT * FROM taille WHERE id_taille = " + idTaille;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Taille(rs.getInt("id_taille"), rs.getInt("mesure_taille"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static TailleBaguette getTailleBaguetteById(int idTailleBaguette) throws SQLException
    {
        String query = "SELECT * FROM taille_baguette WHERE id_taille_baguette = " + idTailleBaguette;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new TailleBaguette(rs.getInt("id_taille_baguette"), rs.getString("nom_taille_baguette"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Visage getVisageById(int idVisage) throws SQLException
    {
        String query = "SELECT * FROM visage WHERE id_visage = " + idVisage;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Visage(rs.getInt("id_visage"), rs.getString("forme_visage"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Voix getVoixById(int idVoix) throws SQLException
    {
        String query = "SELECT * FROM voix WHERE id_voix = " + idVoix;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Voix(rs.getInt("id_voix"), rs.getString("type_voix"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Yeux getYeuxById(int idYeux) throws SQLException
    {
        String query = "SELECT * FROM yeux WHERE id_yeux = " + idYeux;

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next())
            {
                return new Yeux(rs.getInt("id_yeux"), rs.getString("forme_yeux"));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    //TODO UPDATE PREPARE STATEMENT
}
