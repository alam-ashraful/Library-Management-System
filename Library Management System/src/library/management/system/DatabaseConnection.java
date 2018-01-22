package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection
{
    Connection con = null;
    public static Connection dbConnector()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
            return con;
        }
        
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Cannot connect to database...");
            System.out.println("Try again");
            
            return null;
        }
    }
}