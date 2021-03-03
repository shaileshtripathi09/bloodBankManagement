package app;

/**
 * Livecamp
 */
import java.sql.*;
public class Livecamp {

   public void showcamps(){
    try
    {
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
      String query = "SELECT * FROM bloodbank.livecamp";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      System.out.println("orgId location    nameofcamp  heafofcamp   date     phoneno");
      while (rs.next())
      {
        int orgId = rs.getInt("orgId");
        String location = rs.getString("location");
        String nameOfCamp = rs.getString("nameOfCamp");
        String headOfCamp = rs.getString("headOfCamp");
        Date date = rs.getDate("date");
        String phoneno = rs.getString("phoneno");
        
        System.out.format("  %s   %s   %s   %s   %s  %s\n",orgId,location,nameOfCamp,headOfCamp,date,phoneno);
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