package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.DAO.GetAllDAO;
import fr.weelders.hp_project.DAO.GenerateDAO;
import fr.weelders.hp_project.DAO.GetIdDAO;
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
