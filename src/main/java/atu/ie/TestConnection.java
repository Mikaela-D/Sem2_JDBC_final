package atu.ie;

public class TestConnection {
    public static void main(String[] args) {
        // MySQL database connection details
        String url = "jdbc:mysql://localhost:3306/orange";
        String username = "root";
        String password = "someSadPassword...883";

        // SQL statement
        String selectSQL = "SELECT u.username, u.password, e.email " +
                "FROM users u " +
                "JOIN emails e ON u.id = e.user_id";

    }
}