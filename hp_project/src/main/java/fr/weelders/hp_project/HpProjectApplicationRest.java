package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Taille;
import fr.weelders.hp_project.DAO.GenerateDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

import static fr.weelders.hp_project.DAO.GetAllDAO.getTailleList;


@RestController
public class HpProjectApplicationRest
{
    @GetMapping("/Test")
    public String test(){
        return "Hello world";
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
}
