package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Baguette;
import fr.weelders.hp_project.Bean.Maison;
import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.Bean.Taille;
import fr.weelders.hp_project.DAO.GetAllDAO;
import fr.weelders.hp_project.DAO.GenerateDAO;
import fr.weelders.hp_project.DAO.GetIdDAO;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
import static fr.weelders.hp_project.DAO.GetAllDAO.getTailleList;

@SpringBootApplication
@Controller
public class HpProjectApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(HpProjectApplication.class, args);
    }

    @GetMapping("/Test")
    public String test(){
        return "Hello world";
    }

    @GetMapping("/getAllMaison")
    public ArrayList<Maison> getAllMaison() throws SQLException
    {
        Utils.consoleLog("/getAllMaison");
        return GetAllDAO.getMaisonList();
    }

    @GetMapping("/getAllBaguette")
    public ArrayList<Baguette> getAllBaguette() throws SQLException
    {
        Utils.consoleLog("/getAllBaguette");
        return GetAllDAO.getBaguetteList();
    }

    @GetMapping("/getPersonnageById")
    public String getPersonnageById(Model model, @RequestParam(required = true) int idPerso) throws SQLException
    {
        Utils.consoleLog("/getPersonnageById","idPerso= "+idPerso);
        Personnage perso = Objects.requireNonNull(GetIdDAO.getPersonnageById(idPerso));
        model.addAttribute(perso);
        return "personnage";
    }

    @GetMapping("/getAllPersonnage")
    public ArrayList<Personnage> getAllPersonnage() throws SQLException
    {
        Utils.consoleLog("/getAllPersonnage");
        return GetAllDAO.getPersonnageList();
    }

    @GetMapping("/generateBaguette")
    public String generateAllBaguette() throws SQLException
    {
        Utils.consoleLog("/generateBaguette");
        GenerateDAO.generateBaguette();
        return "ENDS";
    }

    @GetMapping("/generateTaille")
    public ArrayList<Taille> generateAllTaille(@RequestParam(required = true) int min, int max) throws SQLException
    {
        Utils.consoleLog("/generateTaille","min= "+min+" max= "+max);
        GenerateDAO.generateTaille(min,max);
        return getTailleList();
    }

    @GetMapping("/addRandomPerso")
    public String addRandomPerso(Model model, @RequestParam(required = true) Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso) throws SQLException
    {
        Utils.consoleLog("/addRandomPerso","is_pj= "+is_pj+" nom_perso= "+nom_perso+" prenom_perso= "+prenom_perso+" img_perso= "+img_perso+" age_perso= "+age_perso+" etat_perso= "+etat_perso+" desc_perso= "+desc_perso);
        GenerateDAO.generatePerso(is_pj,nom_perso,prenom_perso,img_perso,age_perso,etat_perso,desc_perso);
        model.addAttribute(Objects.requireNonNull(GetIdDAO.getPersonnageById(getPersonnageList().size())));
        return "personnage";
    }
}
