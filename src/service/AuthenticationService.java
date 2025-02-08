package service; 

import constant.SessionManager;
import dao.DatabaseConnection;  

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class AuthenticationService {

    public boolean authenticateUser(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean isAuthenticated = false;

        try {
            // 1. Get database connection
            DatabaseConnection dbConnector = new DatabaseConnection();
            connection = dbConnector.connect();
            if (connection == null) {
                System.out.println("Failed to connect to database.");
                return false;  
            }

            // 2. Construct the SQL query to retrieve the salt and hashed password
            String sql = "SELECT id, password, salt FROM users WHERE username = ?"; // Get password and salt
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // User found, retrieve stored hash and salt
                int userId = resultSet.getInt("id");
                String storedHash = resultSet.getString("password");
                String salt = resultSet.getString("salt");

                // Hash the entered password with the retrieved salt
                String hashedPassword = hashPassword(password, salt);

                // Compare the entered password's hash with the stored hash
                if (storedHash.equals(hashedPassword)) {
                    isAuthenticated = true;
                    
                    SessionManager.setUserId(userId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error during authentication: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isAuthenticated;
    }

    //MD5 hashing
    public static String hashPassword(String password, String salt) {
        try {
            // Using MD5 algorithm
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Add salt to password
            String saltedPassword = salt + password;

            // Get the hash's bytes
            byte[] bytes = md.digest(saltedPassword.getBytes(StandardCharsets.UTF_8));

            // Convert byte array into signum representation
            BigInteger number = new BigInteger(1, bytes);

            // Convert message digest into hex value
            StringBuilder hexString = new StringBuilder(number.toString(16));

            // Pad with leading zeros
            while (hexString.length() < 32)
            {
                hexString.insert(0, '0');
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
            return null;
        }
    }
}
