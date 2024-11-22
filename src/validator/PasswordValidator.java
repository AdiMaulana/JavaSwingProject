/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import java.util.regex.Pattern;

/**
 *
 * @author Adi Maulana
 */
public class PasswordValidator {
    
    // Regex pattern for password validation
    private static final String PASSWORD_PATTERN = 
        "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{9,}$";

    public boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}