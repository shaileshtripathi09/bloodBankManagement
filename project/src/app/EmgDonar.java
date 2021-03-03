package app;
import java.sql.*;
/**
 * EmgDonar
 */
public class EmgDonar {
    public void showemgdonar(){
        try
	    {
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
	      String query = "SELECT * FROM bloodbank.emgdonar";
	      Statement st = conn.createStatement();
	      ResultSet rs = st.executeQuery(query);
	      System.out.println("Did    Dname   Contact BloodGrp  Age   Weight    Location  Dtype");
	      while (rs.next())
	      {
	        int Did = rs.getInt("Did");
	        String Dname = rs.getString("Dname");
	        String Contact = rs.getString("Contact");
	        String BloodGrp = rs.getString("BloodGrp");
	        int Age = rs.getInt("Age");
	        int Weight = rs.getInt("Weight");
	        String Location = rs.getString("Location");
	        String Dtype = rs.getString("Dtype");
	      	        
	        System.out.format("%s  , %s  , %s  , %s  , %s  , %s  ,%s  ,%s\n",Did,Dname,Contact,BloodGrp,Age,Weight,Location,Dtype);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
    }
    
}