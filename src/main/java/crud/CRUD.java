package crud;

import Database.SimpleConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void readStudents() {
        String query = "SELECT * FROM student";
        try (Connection con = SimpleConnection.getConnection()) {
            if (con != null) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    Integer empId = rs.getInt(1);
                    String name = rs.getString(2);
                    String contact = rs.getString(3);
                    String address = rs.getString(4);  // Fixed: should be rs.getString(4)

                    System.out.println("Student ID: " + empId);
                    System.out.println("Name: " + name);
                    System.out.println("Contact: " + contact);
                    System.out.println("Address: " + address);
                }

                rs.close();
            } else {
                System.out.println("Connection Failed! Check output console");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void insertStudent(String name, String contact, String address) {
        String query = "INSERT INTO student (name, contact, address) VALUES (?, ?, ?)";
        try (Connection con = SimpleConnection.getConnection()) {
            if (con != null) {
                var pstmt = con.prepareStatement(query);
                pstmt.setString(1, name);
                pstmt.setString(2, contact);
                pstmt.setString(3, address);
                int rowsInserted = pstmt.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("A new student was inserted successfully!");
                }

                pstmt.close();
            } else {
                System.out.println("Connection Failed! Check output console");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
