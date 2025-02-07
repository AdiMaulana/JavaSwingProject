package dao;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private Connection connection;
    private String url;
    private String user;
    private String password;

    public DatabaseConnection() {
        try {
            // Load properties file
            Properties props = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("resources/db.properties");
            if (input != null) {
                props.load(input);
            } else {
                System.out.println("Sorry, unable to find db.properties");
                return; // Early exit if db.properties is missing
            }

            System.out.println("Start connection to the PostgreSQL server ");

            // Get properties
            this.url = props.getProperty("db.url");
            this.user = props.getProperty("db.username");
            this.password = props.getProperty("db.password");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection connect() {
        try {
            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
