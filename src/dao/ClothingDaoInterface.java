package dao;

import java.sql.SQLException;
import java.util.List;
import model.Clothing;

public interface ClothingDaoInterface { 
    
    Clothing getClothingById(int id) throws SQLException;
    
    List<Clothing> getAllClothes();
    
    void insertClothing(Clothing clothing) throws SQLException;
    
    void updateClothing(Clothing clothing) throws SQLException;
    
    void deleteClothing(int id) throws SQLException;

    public boolean updateStock(int clothingId, int quantity);
}
