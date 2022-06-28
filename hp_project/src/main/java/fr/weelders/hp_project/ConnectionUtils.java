package fr.weelders.hp_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils
{
    public static Connection getConnection()throws SQLException, ClassNotFoundException{
        return DriverManager.getConnection(Const.URL_DB,Const.LOGIN_DB,Const.PWD_DB);
    }
}
