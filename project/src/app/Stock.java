package app;
import java.sql.*;
/**
 * Stock
 */
public class Stock {

    public void showStock(){
        try
	    {
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
	      String query = "SELECT * FROM bloodbank.stock";
	      Statement st = conn.createStatement();
	      ResultSet rs = st.executeQuery(query);
	      System.out.println("stockId  date    packets  bloodGrp  rbc  wbc  platelets    quantity  from");
	      while (rs.next())
	      {
	        int stockId = rs.getInt("stockId");
	        Date date = rs.getDate("date");
	        int packets = rs.getInt("packets");
	        String bloodGrp = rs.getString("bloodGrp");
	        int rbc = rs.getInt("rbc");
	        int wbc = rs.getInt("wbc");
	        int platelets = rs.getInt("platelets");
	        
	        int quantity = rs.getInt("quantity");
	        String from = rs.getString("from");
	        
	        System.out.format("  %s   %s   %s   %s   %s  %s  %s  %s  %s  \n",stockId,date,packets,bloodGrp,rbc,wbc,platelets,quantity,from);
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