package app;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.*;

/**
 * DbConnection
 */
public class DbConnection {
    public static Connection connection;
    public static Statement statement;
    public static String dbname = "bloodbank";

    public void setup() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=1234");
        statement = (Statement) connection.createStatement();
    }

    DbConnection() {
        try {
            setup();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void newCamp(String tablename, String location, String nameOfcamp, String headOfCamp,
            String date, long phoneno, int expColl) {
        String query = "insert into " + dbname + "." + tablename + " values('" + location + "','" + nameOfcamp + "','"
                + headOfCamp + "','" + date + "'," + phoneno + "," + expColl + ");";
       // System.out.println(query);
        try {
            statement.execute(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void newDonar(String tablename,String name,int age,Double weight,long contact,String disease,String b_g){
        String query = "insert into " + dbname + "." + tablename + " values('" + name + "'," + age + ","
                + weight + "," + contact + ",'" + disease + "','" + b_g + "');";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void newRecipient(String tablename,String bloodgroup,String location,int quantity,String name,Long contact, String today, String nextdate){
        String query = "insert into " + dbname + "." + tablename + "(bloodgroup,location,quantity,name,contact,recieveddate,nextdate) values('" + bloodgroup + "','" + location + "',"
                + quantity + ",'" + name + "'," + contact +",'"+today+"','"+nextdate+"');";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}