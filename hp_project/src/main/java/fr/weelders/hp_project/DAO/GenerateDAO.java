package fr.weelders.hp_project.DAO;

import fr.weelders.hp_project.Bean.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import static fr.weelders.hp_project.DAO.AddDAO.*;
import static fr.weelders.hp_project.DAO.GetAllDAO.*;
import static fr.weelders.hp_project.DAO.GetIdDAO.*;

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

    public static void generatePerso(Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso) throws SQLException
    {
        ArrayList<Niveau_soc> listNiveau_soc = getNiveauSocList();
        ArrayList<Nationnalite> listNationnalite = getNationnaliteList();
        ArrayList<Corpulence> listCorpulence = getCorpulenceList();
        ArrayList<Baguette> listBaguette = getBaguetteList();
        ArrayList<Bouche> listBouche = getBoucheList();
        ArrayList<Nez> listNez = getNezList();
        ArrayList<Voix> listVoix = getVoixList();
        ArrayList<Parler> listParler = getParlerList();
        ArrayList<Attitude> listAttitude = getAttitudeList();
        ArrayList<Yeux> listYeux = getYeuxList();
        ArrayList<Cheveux> listCheveux = getCheveuxList();
        ArrayList<Regard> listRegard = getRegardList();
        ArrayList<Visage> listVisage = getVisageList();
        ArrayList<Classe> listClasse = getClasseList();
        ArrayList<Taille> listTaille = getTailleList();
        ArrayList<Sexe> listSexe = getSexeList();
        ArrayList<Maison> listMaison = getMaisonList();
        ArrayList<Sang> listSang = getSangList();
        ArrayList<Couleur_cheveux> listCouleurCheveux = getCouleurCheveuxList();
        ArrayList<Couleur_yeux> listCouleurYeux = getCouleurYeuxList();

        Personnage newPersonnage = new Personnage(0,is_pj,nom_perso,prenom_perso,img_perso,age_perso,etat_perso,desc_perso,
                listNiveau_soc.get(new Random().nextInt(listNiveau_soc.size())),
                listNationnalite.get(new Random().nextInt(listNationnalite.size())),
                listCorpulence.get(new Random().nextInt(listCorpulence.size())),
                listBaguette.get(new Random().nextInt(listBaguette.size())),
                listBouche.get(new Random().nextInt(listBouche.size())),
                listNez.get(new Random().nextInt(listNez.size())),
                listVoix.get(new Random().nextInt(listVoix.size())),
                listParler.get(new Random().nextInt(listParler.size())),
                listAttitude.get(new Random().nextInt(listAttitude.size())),
                listYeux.get(new Random().nextInt(listYeux.size())),
                listCheveux.get(new Random().nextInt(listCheveux.size())),
                listRegard.get(new Random().nextInt(listRegard.size())),
                listVisage.get(new Random().nextInt(listVisage.size())),
                listClasse.get(new Random().nextInt(listClasse.size())),
                listTaille.get(new Random().nextInt(listTaille.size())),
                listSexe.get(new Random().nextInt(listSexe.size())),
                listMaison.get(new Random().nextInt(listMaison.size())),
                listSang.get(new Random().nextInt(listSang.size())),
                listCouleurCheveux.get(new Random().nextInt(listCouleurCheveux.size())),
                listCouleurYeux.get(new Random().nextInt(listCouleurYeux.size()))
                );

        addNewPersonnage(newPersonnage);
    }
}
