package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.Personnage;
import java.sql.*;
import java.util.*;

import static fr.weelders.hp_project.DAO.GetIdDAO.*;

public class MiscDAO
{
    public static ArrayList<Personnage> getPersonnageByName(String name) throws SQLException
    {
        String query = "SELECT * FROM personnage WHERE nom_perso like ? OR prenom_perso like ?;";
        ArrayList<Personnage> results = new ArrayList<Personnage>();

        try (Connection conn = ConnectionUtils.getConnection())
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%"+name+"%");
            ps.setString(2,"%"+name+"%");
            ResultSet rs = ps.executeQuery();
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
}
