package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
    private final static String databaseURL = "jdbc:mysql://localhost:3306/college";
    private final static String databaseUser = "root";
    private final static String databasePassword = "";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
            if (con != null) {
                System.out.println("Successfully connected to database!");
            } else {
                System.out.println("Connection Failed! Check output console");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
