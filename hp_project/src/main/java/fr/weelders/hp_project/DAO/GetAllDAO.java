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
}
