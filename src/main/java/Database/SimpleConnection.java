package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleConnection {
    private static String databaseURL = "jdbc:mysql://localhost:3306/college";
    private  static String databaseUser = "root";
    private  static String databasePassword = "";

    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(databaseURL,databaseUser,databasePassword);
            if (con != null) {
                System.out.println("Successfully connected to database!");
            } else {
                System.out.println("Connection Failed! Check output console");
            }
        }catch(Exception e){
            System.out.println(e.getMessage())  ;
        }
    }
}
