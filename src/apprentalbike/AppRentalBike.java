/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apprentalbike;

import model.User;
import model.UserRegistry;
import constant.Constant;

/**
 *
 * @author  Adi Maulana
 */
public class AppRentalBike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // add default user login
        User newUser = new User();
        newUser.setFullName(Constant.DEFAULT_FULLNAME);
        newUser.setEmail(Constant.DEFAULT_EMAIL);
        newUser.setUsername(Constant.DEFAULT_USERNAME);
        newUser.setPassword(Constant.DEFAULT_PASSWORD);
        
        // Add the user to the global list
        UserRegistry.userList.add(newUser);

        // TODO code application logic here
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
    }
}
