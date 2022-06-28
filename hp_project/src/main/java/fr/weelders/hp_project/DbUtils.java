package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.*;

import java.sql.*;
import java.util.ArrayList;

public class DbUtils
{
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


    //GET BY ID

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


    //ADD

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
}
