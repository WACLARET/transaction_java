
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DatabaseConnection {
    //creating connection with mysql database
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/switchlink", "root", "");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
        }
    }
    

