package dao.impl;

import dao.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Clothing;
import dao.ClothingDaoInterface;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClothingDaoImpl implements ClothingDaoInterface {

    private DatabaseConnection dbConnector;

    public ClothingDaoImpl() {
        this.dbConnector = new DatabaseConnection();
    }

    public ClothingDaoImpl(DatabaseConnection dbConnector) {
        this.dbConnector = dbConnector;
    }

    @Override
    public Clothing getClothingById(int id) throws SQLException {
        String sql = "SELECT id, name, price, stock FROM clothes WHERE id = ?";
        Clothing clothing = null;
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = dbConnector.connect();
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                clothing = new Clothing();
                clothing.setId(rs.getInt("id"));
                clothing.setName(rs.getString("name"));
                clothing.setPrice(rs.getDouble("price"));
                clothing.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving clothing by ID: " + e.getMessage());
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return clothing;
    }

    @Override
    public List<Clothing> getAllClothes() {
        List<Clothing> clothesList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dbConnector.connect();
            if (connection == null) {
                System.out.println("Failed to connect to the database.");
                return clothesList; // Return empty list
            }

            String sql = "SELECT id, name, price, stock FROM clothes ORDER BY id;";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int stock = resultSet.getInt("stock");
                Clothing clothes = new Clothing(id, name, price, stock);
                clothesList.add(clothes);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching clothes data: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return clothesList;
    }

    @Override
    public void insertClothing(Clothing clothing) throws SQLException {
        String sql = "INSERT INTO clothes (name, price, stock) VALUES (?, ?, ?)";

        Connection connection = dbConnector.connect();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, clothing.getName());
            pstmt.setDouble(2, clothing.getPrice());
            pstmt.setInt(3, clothing.getStock());
            pstmt.executeUpdate();
        }
    }

    @Override
    public void updateClothing(Clothing clothing) throws SQLException {
        String sql = "UPDATE clothes SET name = ?, price = ?, stock = ? WHERE id = ?";

        Connection connection = dbConnector.connect();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, clothing.getName());
            pstmt.setDouble(2, clothing.getPrice());
            pstmt.setInt(3, clothing.getStock());
            pstmt.setInt(4, clothing.getId());
            pstmt.executeUpdate();
        }
    }

    @Override
    public void deleteClothing(int id) throws SQLException {
        String sql = "DELETE FROM clothes WHERE id = ?";

        Connection connection = dbConnector.connect();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    @Override
    public boolean updateStock(int clothingId, int quantity) {
        String sql = "UPDATE clothes SET stock = ? WHERE id = ?";

        boolean isSuccess = false;

        Connection connection = dbConnector.connect();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, quantity);
            pstmt.setInt(2, clothingId);
            int rowsAffected = pstmt.executeUpdate();
            isSuccess = (rowsAffected > 0);

        } catch (SQLException ex) {
            isSuccess = false;
            Logger.getLogger(ClothingDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isSuccess;
    }
}
