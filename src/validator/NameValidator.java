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
public class NameValidator {
    
    private static final String NAMA_PATTERN = "^[A-Za-z\\s]+$"; // Hanya huruf dan spasi
    private final Pattern pattern;

    public NameValidator() {
        pattern = Pattern.compile(NAMA_PATTERN);
    }

    public boolean validate(String nama) {
        return pattern.matcher(nama).matches();
    }
}
