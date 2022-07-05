package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.*;
import java.util.ArrayList;

import static fr.weelders.hp_project.DAO.GetIdDAO.*;

public class GetAllDAO
{
    //////////////////////////////////////////////////////////////////////////////////
    //GET DATA
    //////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Attitude> getAttitudeList() throws SQLException
    {
        String query = "SELECT * FROM attitude";
        ArrayList<Attitude> results = new ArrayList<Attitude>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Attitude(
                        rs.getInt("id_attitude"),
                        rs.getString("type_attitude")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Baguette> getBaguetteList() throws SQLException
    {
        String query = "SELECT * FROM baguette";
        ArrayList<Baguette> results = new ArrayList<Baguette>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Baguette(
                        rs.getInt("id_Baguette"),
                        getTailleBaguetteById(rs.getInt("id_taille_baguette")),
                        getEpaisseurById(rs.getInt("id_epaisseur_baguette")),
                        getFlexibiliteById(rs.getInt("id_flexibilite_baguette")),
                        getCoeurById(rs.getInt("id_coeur_baguette")),
                        getBoisById(rs.getInt("id_bois_baguette"))
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Bois> getBoisList() throws SQLException
    {
        String query = "SELECT * FROM bois";
        ArrayList<Bois> results = new ArrayList<Bois>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Bois(
                        rs.getInt("id_bois"),
                        rs.getString("nom_bois")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Bouche> getBoucheList() throws SQLException
    {
        String query = "SELECT * FROM bouche";
        ArrayList<Bouche> results = new ArrayList<Bouche>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Bouche(
                        rs.getInt("id_bouche"),
                        rs.getString("type_bouche")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Caracteristique> getCaracteristiqueList() throws SQLException
    {
        String query = "SELECT * FROM caracteristique";
        ArrayList<Caracteristique> results = new ArrayList<Caracteristique>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Caracteristique(
                        rs.getInt("id_caracteristique"),
                        rs.getString("nom_caracteristique")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Cheveux> getCheveuxList() throws SQLException
    {
        String query = "SELECT * FROM cheveux";
        ArrayList<Cheveux> results = new ArrayList<Cheveux>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Cheveux(
                        rs.getInt("id_cheveux"),
                        rs.getString("coupe_cheveux")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Classe> getClasseList() throws SQLException
    {
        String query = "SELECT * FROM classe";
        ArrayList<Classe> results = new ArrayList<Classe>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Classe(
                        rs.getInt("id_classe"),
                        rs.getString("nbr_classe")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Coeur> getCoeurList() throws SQLException
    {
        String query = "SELECT * FROM coeur";
        ArrayList<Coeur> results = new ArrayList<Coeur>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Coeur(
                        rs.getInt("id_coeur"),
                        rs.getString("nom_coeur"),
                        getRareteById(rs.getInt("id_rarete_coeur"))
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Competence> getCompetenceList() throws SQLException
    {
        String query = "SELECT * FROM competence";
        ArrayList<Competence> results = new ArrayList<Competence>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Competence(
                        rs.getInt("id_competence"),
                        rs.getString("nom_competence"),
                        rs.getBoolean("is_scolaire")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Corpulence> getCorpulenceList() throws SQLException
    {
        String query = "SELECT * FROM corpulence";
        ArrayList<Corpulence> results = new ArrayList<Corpulence>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Corpulence(
                        rs.getInt("id_corpulence"),
                        rs.getString("type_corpulence")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Couleur_cheveux> getCouleurCheveuxList() throws SQLException
    {
        String query = "SELECT * FROM couleur_cheveux";
        ArrayList<Couleur_cheveux> results = new ArrayList<Couleur_cheveux>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Couleur_cheveux(
                        rs.getInt("id_couleur_cheveux"),
                        rs.getString("nom_couleur_cheveux")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Couleur_yeux> getCouleurYeuxList() throws SQLException
    {
        String query = "SELECT * FROM couleur_yeux";
        ArrayList<Couleur_yeux> results = new ArrayList<Couleur_yeux>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Couleur_yeux(
                        rs.getInt("id_couleur_yeux"),
                        rs.getString("nom_couleur_yeux")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Epaisseur> getEpaisseurList() throws SQLException
    {
        String query = "SELECT * FROM epaisseur";
        ArrayList<Epaisseur> results = new ArrayList<Epaisseur>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Epaisseur(
                        rs.getInt("id_epaisseur"),
                        rs.getString("nom_epaisseur")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Flexibilite> getFlexibiliteList() throws SQLException
    {
        String query = "SELECT * FROM flexibilite";
        ArrayList<Flexibilite> results = new ArrayList<Flexibilite>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Flexibilite(
                        rs.getInt("id_flexibilite"),
                        rs.getString("type_flexibilite")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Maison> getMaisonList() throws SQLException
    {
        String query = "SELECT * FROM maison";
        ArrayList<Maison> results = new ArrayList<Maison>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Maison(
                        rs.getInt("id_maison"),
                        rs.getString("nom_maison")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Nationnalite> getNationnaliteList() throws SQLException
    {
        String query = "SELECT * FROM nationnalite";
        ArrayList<Nationnalite> results = new ArrayList<Nationnalite>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Nationnalite(
                        rs.getInt("id_nationnalite"),
                        rs.getString("nom_nationnalite")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Nez> getNezList() throws SQLException
    {
        String query = "SELECT * FROM nez";
        ArrayList<Nez> results = new ArrayList<Nez>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Nez(
                        rs.getInt("id_nez"),
                        rs.getString("type_nez")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Niveau_soc> getNiveauSocList() throws SQLException
    {
        String query = "SELECT * FROM niveau_soc";
        ArrayList<Niveau_soc> results = new ArrayList<Niveau_soc>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Niveau_soc(
                        rs.getInt("id_niveau_soc"),
                        rs.getString("nom_niveau_soc")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Parler> getParlerList() throws SQLException
    {
        String query = "SELECT * FROM parler";
        ArrayList<Parler> results = new ArrayList<Parler>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Parler(
                        rs.getInt("id_parler"),
                        rs.getString("facon_parler")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Personnage> getPersonnageList() throws SQLException
    {
        String query = "SELECT * FROM personnage";
        ArrayList<Personnage> results = new ArrayList<Personnage>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Personnage(
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
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Rarete> getRareteList() throws SQLException
    {
        String query = "SELECT * FROM rarete";
        ArrayList<Rarete> results = new ArrayList<Rarete>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Rarete(
                        rs.getInt("id_rarete"),
                        rs.getString("nom_rarete")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Regard> getRegardList() throws SQLException
    {
        String query = "SELECT * FROM regard";
        ArrayList<Regard> results = new ArrayList<Regard>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Regard(
                        rs.getInt("id_regard"),
                        rs.getString("type_regard")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Sang> getSangList() throws SQLException
    {
        String query = "SELECT * FROM sang";
        ArrayList<Sang> results = new ArrayList<Sang>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Sang(
                        rs.getInt("id_sang"),
                        rs.getString("nom_sang")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Sexe> getSexeList() throws SQLException
    {
        String query = "SELECT * FROM sexe";
        ArrayList<Sexe> results = new ArrayList<Sexe>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Sexe(
                        rs.getInt("id_sexe"),
                        rs.getString("type_sexe")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Taille> getTailleList() throws SQLException
    {
        String query = "SELECT * FROM taille";
        ArrayList<Taille> results = new ArrayList<Taille>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Taille(
                        rs.getInt("id_taille"),
                        rs.getInt("mesure_taille")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<TailleBaguette> getTailleBaguetteList() throws SQLException
    {
        String query = "SELECT * FROM taille_baguette";
        ArrayList<TailleBaguette> results = new ArrayList<TailleBaguette>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new TailleBaguette(
                        rs.getInt("id_taille_baguette"),
                        rs.getString("nom_taille_baguette")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Visage> getVisageList() throws SQLException
    {
        String query = "SELECT * FROM visage";
        ArrayList<Visage> results = new ArrayList<Visage>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Visage(
                        rs.getInt("id_visage"),
                        rs.getString("forme_visage")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Voix> getVoixList() throws SQLException
    {
        String query = "SELECT * FROM voix";
        ArrayList<Voix> results = new ArrayList<Voix>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Voix(
                        rs.getInt("id_voix"),
                        rs.getString("type_voix")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }

    public static ArrayList<Yeux> getYeuxList() throws SQLException
    {
        String query = "SELECT * FROM yeux";
        ArrayList<Yeux> results = new ArrayList<Yeux>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                results.add(new Yeux(
                        rs.getInt("id_yeux"),
                        rs.getString("forme_yeux")
                ));
            }
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return results;
    }
}
