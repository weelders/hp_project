package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Baguette;
import fr.weelders.hp_project.Bean.Maison;
import fr.weelders.hp_project.Bean.Personnage;
import fr.weelders.hp_project.Bean.Taille;
import fr.weelders.hp_project.DAO.GetAllDAO;
import fr.weelders.hp_project.DAO.GenerateDAO;
import fr.weelders.hp_project.DAO.GetIdDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

import static fr.weelders.hp_project.DAO.GetAllDAO.getPersonnageList;
import static fr.weelders.hp_project.DAO.GetAllDAO.getTailleList;

@SpringBootApplication
@RestController
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
        return GetAllDAO.getMaisonList();
    }

    @GetMapping("/getAllBaguette")
    public ArrayList<Baguette> getAllBaguette() throws SQLException
    {
        return GetAllDAO.getBaguetteList();
    }

    @GetMapping("/getPersonnageById")
    public Personnage getPersonnageById(@RequestParam(required = true) int idPerso) throws SQLException
    {
        return GetIdDAO.getPersonnageById(idPerso);
    }

    @GetMapping("/getAllPersonnage")
    public ArrayList<Personnage> getAllPersonnage() throws SQLException
    {
        return GetAllDAO.getPersonnageList();
    }

    @GetMapping("/generateBaguette")
    public String generateAllBaguette() throws SQLException
    {
        GenerateDAO.generateBaguette();
        return "ENDS";
    }

    @GetMapping("/generateTaille")
    public ArrayList<Taille> generateAllTaille(@RequestParam(required = true) int min, int max) throws SQLException
    {
        GenerateDAO.generateTaille(min,max);
        return getTailleList();
    }

    @GetMapping("/addRandomPerso")
    public Personnage addRandomPerso(@RequestParam(required = true) Boolean is_pj, String nom_perso, String prenom_perso, String img_perso, byte age_perso, Boolean etat_perso, String desc_perso) throws SQLException
    {
        GenerateDAO.generatePerso(is_pj,nom_perso,prenom_perso,img_perso,age_perso,etat_perso,desc_perso);
        return getPersonnageById(getPersonnageList().size());
    }
}
