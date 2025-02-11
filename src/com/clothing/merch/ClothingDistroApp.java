package com.clothing.merch;

import dao.DatabaseConnection;
import form.LoginFrame;
import java.sql.Connection;

public class ClothingDistroApp {
    public static void main(String[] args) {
        
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);

        // Get database connection
        DatabaseConnection dbConnector = new DatabaseConnection();
        Connection connection = dbConnector.connect();
        if (connection == null) {
            System.out.println("Failed to connect to database.");
        }
    }
}
