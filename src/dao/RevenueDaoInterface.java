package dao;

import java.sql.SQLException;
import java.util.List;
import model.Revenue;

public interface RevenueDaoInterface {
    
    boolean insertRevenue(Revenue revenue) throws SQLException;
    
    List<Revenue> getAllRevenues() throws SQLException;
}
