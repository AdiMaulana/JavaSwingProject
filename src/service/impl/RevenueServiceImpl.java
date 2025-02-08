package service.impl;

import constant.PaymentMethod;
import dao.ClothingDaoInterface;
import dao.RevenueDaoInterface;
import dao.impl.ClothingDaoImpl;
import dao.impl.RevenueDaoImpl;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clothing;
import model.Revenue;
import service.RevenueServiceInterface;

public class RevenueServiceImpl implements RevenueServiceInterface {

    private ClothingDaoInterface clothingDao;
    private RevenueDaoInterface revenueDao;

    public RevenueServiceImpl() {
        this.clothingDao = new ClothingDaoImpl();
        this.revenueDao = new RevenueDaoImpl();
    }

    @Override
    public boolean addRevenue(int userId, int clothingId, int quantity, double pricePerItem, double totalAmount) throws SQLException {
        Revenue revenue = new Revenue();
        revenue.setClothingId(clothingId);
        revenue.setSaleDate(new Date());
        revenue.setQuantity(quantity);
        revenue.setPricePerItem(pricePerItem);
        revenue.setTotalAmount(totalAmount);
        if (userId != 0) {
            revenue.setCustomerId(userId);
        }
        revenue.setDiscountAmount(0);
        revenue.setPaymentMethod(PaymentMethod.getCashDescription());

        Clothing clothing = clothingDao.getClothingById(clothingId);
        if (clothing == null) {
            throw new SQLException("Clothing with ID " + clothingId + " not found");
        }

        if (clothing.getStock() < quantity) {
            throw new SQLException("Insufficient stock for clothing ID: " + clothingId + ". Available stock: " + clothing.getStock());
        }

        boolean revenueInserted = revenueDao.insertRevenue(revenue);

        if (revenueInserted) {

            int stok = clothing.getStock() - quantity;

            boolean stockUpdated = clothingDao.updateStock(clothingId, stok);
            if (!stockUpdated) {
                System.err.println("Failed to update stock for clothing ID: " + clothingId);
                // Consider rolling back the revenue insertion if stock update fails.
                return false;
            }
            return true;
        } else {
            System.err.println("Failed to insert revenue for clothing ID: " + clothingId);
            return false;
        }
    }

    @Override
    public List<Revenue> getAllRevenues() throws SQLException {
        return revenueDao.getAllRevenues();
    }
}
