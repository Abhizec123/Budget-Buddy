
package db;

import java.util.*;
import java.sql.*;
import javax.swing.*;

public class DbConnect
{
    public static Connection con;
    public static Statement s;
    
    static  
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensedb","root","Tmsl@123"); 
            s=con.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
