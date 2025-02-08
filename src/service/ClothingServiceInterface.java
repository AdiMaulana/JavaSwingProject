package service;

import java.sql.SQLException;
import java.util.List;
import model.Clothing;

public interface ClothingServiceInterface {

    List<Clothing> getAllClothes() throws SQLException;

    public void addClothing(String name, int price, int stock) throws SQLException;

    public void updateClothing(int id, String name, int price, int stock) throws SQLException;

    public void deleteClothing(int id) throws SQLException;
}
