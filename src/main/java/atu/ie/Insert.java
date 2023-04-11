package atu.ie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws SQLException {

        // Connect to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orange", "MD", "someSadPassword...883");

        try {
            // Insert a new record into the "users" table
            PreparedStatement stmt = con.prepareStatement("INSERT INTO person (id, name, age, email) VALUES (?, ?, ?, ?)");
            stmt.setString(1, "11");
            stmt.setString(2, "Myz");
            stmt.setString(3, "48");
            stmt.setString(4, "myz@example.com");
            stmt.executeUpdate();

            System.out.println("Insert completed successfully.");
        } catch (SQLException ex) {

            System.out.println("Record insert failed.");
            ex.printStackTrace();
        }
        // Close the connection
        con.close();
    }
}
