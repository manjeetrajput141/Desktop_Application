
package bank.management.system;
import java.sql.*;


public class conn 
{
    Connection c;
    Statement s;
    public conn()
    {
        try
        {
           
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Manjeet@123#");
            s=c.createStatement();
            
            
            
        } catch (Exception e){
            System.out.print(e);
        }
    }
    
    
    
}
