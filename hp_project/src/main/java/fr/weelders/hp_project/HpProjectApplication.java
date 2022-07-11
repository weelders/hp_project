package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.DAO.GetAllDAO;
import fr.weelders.hp_project.DAO.GenerateDAO;
import fr.weelders.hp_project.DAO.GetIdDAO;
import fr.weelders.hp_project.DAO.MiscDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

import static fr.weelders.hp_project.DAO.GetAllDAO.getPersonnageList;

@SpringBootApplication
@Controller
public class HpProjectApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(HpProjectApplication.class, args);
    }


    @GetMapping("/getPersonnageById")
    public String getPersonnageById(Model model, @RequestParam(required = true) int idPerso) throws SQLException
    {
        Utils.consoleLog("/getPersonnageById","idPerso= "+idPerso);
        Personnage perso = Objects.requireNonNull(GetIdDAO.getPersonnageById(idPerso));
        model.addAttribute("personnage",perso);
        return "personnage";
    }

    @GetMapping("/updatePersonnageById")
    public String updatePersonnageById(Model model, @RequestParam(required = true) int idPerso) throws SQLException
    {
        Utils.consoleLog("/updatePersonnageById","idPerso= "+idPerso);
        Personnage perso = Objects.requireNonNull(GetIdDAO.getPersonnageById(idPerso));
        model.addAttribute("personnage",perso);
        model.addAttribute("maison",GetAllDAO.getMaisonList());
        model.addAttribute("classe", GetAllDAO.getClasseList());
        model.addAttribute("niveau", GetAllDAO.getNiveauSocList());
        model.addAttribute("sang", GetAllDAO.getSangList());
        model.addAttribute("nationnalite",GetAllDAO.getNationnaliteList());
        model.addAttribute("taille", GetAllDAO.getTailleList());
        model.addAttribute("corpulence", GetAllDAO.getCorpulenceList());
        model.addAttribute("bouche", GetAllDAO.getBoucheList());
        model.addAttribute("nez", GetAllDAO.getNezList());
        model.addAttribute("yeux", GetAllDAO.getYeuxList());
        model.addAttribute("couleur_yeux", GetAllDAO.getCouleurYeuxList());
        model.addAttribute("attitude", GetAllDAO.getAttitudeList());
        model.addAttribute("sexe", GetAllDAO.getSexeList());
        model.addAttribute("visage", GetAllDAO.getVisageList());
        model.addAttribute("cheveux", GetAllDAO.getCheveuxList());
        model.addAttribute("couleur_cheveux", GetAllDAO.getCouleurCheveuxList());
        model.addAttribute("voix", GetAllDAO.getVoixList());
        model.addAttribute("parler", GetAllDAO.getParlerList());
        model.addAttribute("regard", GetAllDAO.getRegardList());
        return "updatePersonnage";
    }

    @GetMapping("/getPersonnageByName")
    public String getPersonnageById(Model model, @RequestParam(required = true) String name) throws SQLException
    {
        Utils.consoleLog("/getPersonnageByName","name= "+ name);
        ArrayList<Personnage> personnages = MiscDAO.getPersonnageByName(name);
        model.addAttribute("personnages",personnages);
        if (personnages.size() != 0){
            return "allPersonnage";
        }
        else{
            return "index";
        }
    }

    @GetMapping("/getAllPersonnage")
    public String getAllPersonnage(Model model) throws SQLException
    {
        Utils.consoleLog("/getAllPersonnage");
        ArrayList<Personnage> personnages = GetAllDAO.getPersonnageList();
        model.addAttribute("personnages",personnages);
        return "allPersonnage";
    }

    @GetMapping("/addRandomPerso")
    public String addRandomPerso(Model model, @RequestParam(required = true) Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso) throws SQLException
    {
        Utils.consoleLog("/addRandomPerso","is_pj= "+is_pj+" nom_perso= "+nom_perso+" prenom_perso= "+prenom_perso+" img_perso= "+img_perso+" age_perso= "+age_perso+" etat_perso= "+etat_perso+" desc_perso= "+desc_perso);
        GenerateDAO.generatePerso(is_pj,nom_perso,prenom_perso,img_perso.isBlank() ? null: img_perso,age_perso,etat_perso,desc_perso);
        model.addAttribute(Objects.requireNonNull(GetIdDAO.getPersonnageById(getPersonnageList().size())));
        return "personnage";
    }

    @GetMapping("/createPersonnage")
    public String createPersonnage(Model model) throws SQLException
    {
        Utils.consoleLog("/createPersonnage");
        return "createPersonnage";
    }
}
