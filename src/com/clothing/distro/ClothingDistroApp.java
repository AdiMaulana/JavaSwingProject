package com.clothing.distro;

import form.LoginFrame;
import java.sql.Connection;

/**
 *
 * @author Anonym
 */
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
