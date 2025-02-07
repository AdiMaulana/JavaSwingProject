package dao.impl;

import dao.DatabaseConnection;
import dao.ClotheDaoInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Clothe;

public class ClotheDaoImpl implements ClotheDaoInterface {

    private DatabaseConnection dbConnector;

    public ClotheDaoImpl() {
        this.dbConnector = new DatabaseConnection();
    }
    
    public ClotheDaoImpl(DatabaseConnection dbConnector) {
        this.dbConnector = dbConnector;
    }

    @Override
    public List<Clothe> getAllClothes() {
        List<Clothe> clothesList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dbConnector.connect();
            if (connection == null) {
                System.out.println("Failed to connect to the database.");
                return clothesList; // Return empty list
            }

            String sql = "SELECT id, name, price, stock FROM clothes";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int stock = resultSet.getInt("stock");
                Clothe clothes = new Clothe(id, name, price, stock);
                clothesList.add(clothes);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching clothes data: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return clothesList;
    }
}
