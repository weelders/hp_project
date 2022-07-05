package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.SQLException;
import java.util.ArrayList;

import static fr.weelders.hp_project.DAO.AddDAO.addNewBaguette;
import static fr.weelders.hp_project.DAO.AddDAO.addNewTaille;
import static fr.weelders.hp_project.DAO.GetAllDAO.*;

public class GenerateDAO
{
    /*GENERATE ALL BAGUETTE AND SAVE THEM IN DB*/
    public static void generateBaguette() throws SQLException
    {
        ArrayList<TailleBaguette> listTaille = getTailleBaguetteList();
        ArrayList<Epaisseur> listEpaisseur = getEpaisseurList();
        ArrayList<Flexibilite> listFlexibilite = getFlexibiliteList();
        ArrayList<Coeur> listCoeur = getCoeurList();
        ArrayList<Bois> listBois = getBoisList();

        for(int iBois = 0; iBois < listBois.size(); iBois++){
            for(int iCoeur = 0; iCoeur < listCoeur.size(); iCoeur++){
                for(int iEpaisseur = 0; iEpaisseur < listEpaisseur.size(); iEpaisseur++){
                    for(int iFlexibilite = 0; iFlexibilite < listFlexibilite.size(); iFlexibilite++){
                        for(int iTaille = 0; iTaille < listTaille.size(); iTaille++){
                            addNewBaguette(new Baguette(0,listTaille.get(iTaille),listEpaisseur.get(iEpaisseur),listFlexibilite.get(iFlexibilite),listCoeur.get(iCoeur),listBois.get(iBois)));
                        }
                    }
                }
            }
        }
    }

    /*GENERATE TAILLE BETWEEN 2 GAP*/
    public static void generateTaille(int min, int max) throws SQLException
    {
        if(min < max && min != 0 && max != 0){
            for(int i = min; i <= max;i++){
                addNewTaille(new Taille(0,i));
            }
        }
    }

    public static void generatePerso(Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso)
    {

    }
}
