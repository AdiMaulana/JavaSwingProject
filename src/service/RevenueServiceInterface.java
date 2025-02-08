package service;

import java.sql.SQLException;
import java.util.List;
import model.Revenue;

public interface RevenueServiceInterface {
    
    public boolean addRevenue(int userId, int clothingId, int quantity, double pricePerItem, double totalAmount) throws SQLException;
    
    public List<Revenue> getAllRevenues() throws SQLException;
}   
