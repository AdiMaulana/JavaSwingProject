package service.impl;

import dao.ClotheDaoInterface;
import dao.impl.ClotheDaoImpl;
import java.util.List;
import model.Clothe;
import service.ClotheServiceInterface;

public class ClotheServiceImpl implements ClotheServiceInterface {

    private ClotheDaoInterface clotheDaoIface;

    public ClotheServiceImpl() {
        this.clotheDaoIface = new ClotheDaoImpl();
    }
    
    public ClotheServiceImpl(ClotheDaoInterface clotheDaoIface) {
        this.clotheDaoIface = clotheDaoIface;
    }

    @Override
    public List<Clothe> getAllClothes() {
        return clotheDaoIface.getAllClothes();
    }
}
