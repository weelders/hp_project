package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.Baguette;
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
}
