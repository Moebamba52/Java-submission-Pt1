
package com.mycompany.chatpro;

// declare your methods and the conditions
public class Conditions {
    public static boolean isValidUsername(String username){
        
        return username != null &&
                username.length() >=5 &&
                username.contains("_");
    }
    public static boolean isValidPassword(String password){
        return password != null &&
                password.length()> 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[^a-zA-Z0-9].*");      
    }
    public static boolean isValidCellNum(String cellNum){
        return cellNum != null &&
                cellNum.matches("\\+27[6-8][0-9]{8}$")&& cellNum.length() == 10;
    }
}

