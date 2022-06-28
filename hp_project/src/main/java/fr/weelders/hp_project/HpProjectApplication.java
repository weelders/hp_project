package fr.weelders.hp_project;

import fr.weelders.hp_project.Bean.Baguette;
import fr.weelders.hp_project.Bean.Maison;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        return DbUtils.getMaisonList();
    }

    @GetMapping("/getAllBaguette")
    public ArrayList<Baguette> getAllBaguette() throws SQLException
    {
        return DbUtils.getBaguetteList();
    }

    @GetMapping("/generateBaguette")
    public String generateAllBaguette() throws SQLException
    {
        Utils.generateBaguette();
        return "ENDS";
    }
}
