package atu.ie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws SQLException {

        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/exampledatabase", "Mikaela Diaz", "someSadPassword...883");
    }
}
