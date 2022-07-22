package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.DAO.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(
            path = "/update",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String update(Model model, @RequestParam MultiValueMap<String, String> params) throws SQLException{
        Utils.consoleLog("/update",params.getFirst("nom_perso")+ " " +params.getFirst("prenom_perso"));
        Personnage updatedPerso = new Personnage(
                Boolean.parseBoolean(params.getFirst("is_pj")),
                params.getFirst("nom_perso"),
                params.getFirst("prenom_perso"),
                params.getFirst("img_perso"),
                Byte.parseByte(params.getFirst("age_perso")),
                Boolean.parseBoolean(params.getFirst("etat_perso")),
                params.getFirst("desc_perso"),
                GetIdDAO.getNiveauSocById(Integer.parseInt(params.getFirst("id_niveau_soc_perso"))),
                GetIdDAO.getNationnaliteById(Integer.parseInt(params.getFirst("id_nationnalite_perso"))),
                GetIdDAO.getCorpulenceById(Integer.parseInt(params.getFirst("id_corpulence_perso"))),
                //TODO BAGUETTE TEMPORARY AT 1
                GetIdDAO.getBaguetteById(1),
                GetIdDAO.getBoucheById(Integer.parseInt(params.getFirst("id_bouche_perso"))),
                GetIdDAO.getNezById(Integer.parseInt(params.getFirst("id_nez_perso"))),
                GetIdDAO.getVoixById(Integer.parseInt(params.getFirst("id_voix_perso"))),
                GetIdDAO.getParlerById(Integer.parseInt(params.getFirst("id_parler_perso"))),
                GetIdDAO.getAttitudeById(Integer.parseInt(params.getFirst("id_attitude_perso"))),
                GetIdDAO.getYeuxById(Integer.parseInt(params.getFirst("id_yeux_perso"))),
                GetIdDAO.getCheveuxById(Integer.parseInt(params.getFirst("id_cheveux_perso"))),
                GetIdDAO.getRegardById(Integer.parseInt(params.getFirst("id_regard_perso"))),
                GetIdDAO.getVisageById(Integer.parseInt(params.getFirst("id_visage_perso"))),
                GetIdDAO.getClasseById(Integer.parseInt(params.getFirst("id_classe_perso"))),
                GetIdDAO.getTailleById(Integer.parseInt(params.getFirst("id_taille_perso"))),
                GetIdDAO.getSexeById(Integer.parseInt(params.getFirst("id_sexe_perso"))),
                GetIdDAO.getMaisonById(Integer.parseInt(params.getFirst("id_maison_perso"))),
                GetIdDAO.getSangById(Integer.parseInt(params.getFirst("id_sang_perso"))),
                GetIdDAO.getCouleurCheveuxById(Integer.parseInt(params.getFirst("id_couleur_cheveux_perso"))),
                GetIdDAO.getCouleurYeuxById(Integer.parseInt(params.getFirst("id_couleur_yeux_perso")))
        );

        UpdateDAO.updatePersonnage(updatedPerso, Integer.parseInt(params.getFirst("id_perso")));
        model.addAttribute("personnage", GetIdDAO.getPersonnageById(Integer.parseInt(params.getFirst("id_perso"))));
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

    @GetMapping("/deletePerso")
    public String deletePerso(Model model, @RequestParam(required = true) int idPerso) throws SQLException
    {
        Utils.consoleLog("/deletePerso","idPerso= "+idPerso);
        MiscDAO.deletePersonnageById(idPerso);
        ArrayList<Personnage> personnages = GetAllDAO.getPersonnageList();
        model.addAttribute("personnages",personnages);
        return "allPersonnage";
    }

    @GetMapping("/getPersonnageByName")
    public String getPersonnageById(Model model, @RequestParam(required = true) String name) throws SQLException
    {
        Utils.consoleLog("/getPersonnageByName","name= "+ name);
        ArrayList<Personnage> personnages = MiscDAO.getPersonnageByName(name);
        if (personnages.size() != 0){
            model.addAttribute("personnages",personnages);
            return "allPersonnage";
        }
        else{
            model.addAttribute("personnages",GetAllDAO.getPersonnageList());
            return "allPersonnage";
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
        model.addAttribute("personnages",GetAllDAO.getPersonnageList());
        return "allPersonnage";
    }

    @GetMapping("/createPersonnage")
    public String createPersonnage(Model model) throws SQLException
    {
        Utils.consoleLog("/createPersonnage");
        return "createPersonnage";
    }
}
