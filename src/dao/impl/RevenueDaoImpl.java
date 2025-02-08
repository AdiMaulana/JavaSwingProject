package dao.impl;

import dao.DatabaseConnection;
import dao.RevenueDaoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Revenue;

public class RevenueDaoImpl implements RevenueDaoInterface{
  
    private DatabaseConnection dbConnector;

    public RevenueDaoImpl() {
        this.dbConnector = new DatabaseConnection();
    }
    
    public RevenueDaoImpl(DatabaseConnection dbConnector) {
        this.dbConnector = dbConnector;
    }

    @Override
    public boolean insertRevenue(Revenue revenue) throws SQLException {
        String sql = "INSERT INTO revenue (clothing_id, sale_date, quantity, price_per_item, total_amount, "
                + "customer_id, discount_amount, payment_method) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
       
        boolean isSuccess = false;
        Connection connection = dbConnector.connect();
        PreparedStatement pstmt = null;
        
        try {
            connection = dbConnector.connect();
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setInt(1, revenue.getClothingId());
            pstmt.setDate(2, new java.sql.Date(revenue.getSaleDate().getTime())); // Convert Date to java.sql.Date
            pstmt.setInt(3, revenue.getQuantity());
            pstmt.setDouble(4, revenue.getPricePerItem());
            pstmt.setDouble(5, revenue.getTotalAmount());
            pstmt.setObject(6, revenue.getCustomerId()); // Use setObject for nullable Integer
            pstmt.setDouble(7, revenue.getDiscountAmount());
            pstmt.setString(8, revenue.getPaymentMethod());
            pstmt.executeUpdate();
            
            int rowsAffected = pstmt.executeUpdate();
            isSuccess = (rowsAffected > 0);  // Set success to true if rows were affected
        }catch (SQLException e) {
            System.err.println("Error during revenue insertion: " + e.getMessage());
            e.printStackTrace();
            isSuccess = false;
        } finally {
            try {
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
        
        return isSuccess;
    }  

    @Override
    public List<Revenue> getAllRevenues() throws SQLException {
      
        List<Revenue> revenues = new ArrayList<>();
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            connection = dbConnector.connect();
            stmt = connection.createStatement();

            // Join revenue with clothing and users table
            String sql = "SELECT "
                    + "    r.clothing_id, "
                    + "    r.sale_date, "
                    + "    u.username AS customer_name, "
                    + "    r.quantity, "
                    + "    r.price_per_item, "
                    + "    r.total_amount, "
                    + "    c.name AS clothing_name " 
                    + "FROM "
                    + "    revenue r "
                    + "INNER JOIN "
                    + "    clothes c ON r.clothing_id = c.id "
                    + "LEFT JOIN "
                    + "    users u ON r.customer_id = u.id";

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Revenue revenue = new Revenue();
                revenue.setClothingId(rs.getInt("clothing_id"));
                revenue.setSaleDate(rs.getDate("sale_date"));
                revenue.setQuantity(rs.getInt("quantity"));
                revenue.setPricePerItem(rs.getDouble("price_per_item"));
                revenue.setTotalAmount(rs.getDouble("total_amount"));
                revenue.setCustomerName(rs.getString("customer_name")); // Set customer name
                revenue.setClothingName(rs.getString("clothing_name"));// Set clothing Name
                revenues.add(revenue);
            }

        } catch (SQLException e) {
            System.err.println("Error during getAllRevenues: " + e.getMessage());
            e.printStackTrace();
            throw e; // Re-throw the exception to be handled by the service layer
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return revenues;
    }
}
