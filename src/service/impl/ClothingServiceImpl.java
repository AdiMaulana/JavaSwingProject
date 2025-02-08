package service.impl;

import dao.impl.ClothingDaoImpl;
import java.util.List;
import model.Clothing;
import dao.ClothingDaoInterface;
import java.sql.SQLException;
import service.ClothingServiceInterface;

public class ClothingServiceImpl implements ClothingServiceInterface {

    private ClothingDaoInterface clothingDao;

    public ClothingServiceImpl() {
        this.clothingDao = new ClothingDaoImpl();
    }
    
    @Override
    public List<Clothing> getAllClothes() throws SQLException {
        return clothingDao.getAllClothes();
    }

    @Override
    public void addClothing(String name, int price, int stock) throws SQLException {
        Clothing clothing = new Clothing();
        clothing.setName(name);
        clothing.setPrice((double)price);
        clothing.setStock(stock);
        clothingDao.insertClothing(clothing);
    }

    @Override
    public void updateClothing(int id, String name, int price, int stock) throws SQLException {
        Clothing clothing = new Clothing();
        clothing.setId(id);
        clothing.setName(name);
        clothing.setPrice((double)price);
        clothing.setStock(stock);
        clothingDao.updateClothing(clothing);
    }

    @Override
    public void deleteClothing(int id) throws SQLException {
        clothingDao.deleteClothing(id);
    }
}
