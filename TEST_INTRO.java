/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_intro;
import java.sql.*;
/**
 *
 * @author glori
 */

public class TEST_INTRO {

    /**
     */
    
    public static void main (String[] args)  { 
        
        try 
        {
          
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" + "user=root & password=");
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("Select * from alumnos");
            ResultSet rs=(ResultSet) pst.executeQuery();
            if (rs.next())
                System.out.println("SI SE LOGRO LA CONEXÓN");
            else 
                System.out.println("NO SE LOGRO LA CONEXÓN");
        }
        catch (Exception e)
        {
                e.printStackTrace();
        }
}  

 // TODO code application logic here 
}
   
    


       
    
    
