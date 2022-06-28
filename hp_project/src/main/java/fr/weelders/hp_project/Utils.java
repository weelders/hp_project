package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.*;

import java.sql.SQLException;
import java.util.ArrayList;

import static fr.weelders.hp_project.DbUtils.*;

public class Utils
{
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
}
