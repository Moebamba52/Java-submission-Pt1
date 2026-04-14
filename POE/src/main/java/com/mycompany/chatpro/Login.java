package com.mycompany.chatpro;

// declare your methods and the conditions which will be used to check if the conditions were met

public class Login {
    public static boolean checkUsername(String username){
        return username != null &&
                username.length() >=5 &&
                username.contains("_");
    }
     public static boolean checkPassword(String password){
        return password != null &&
                password.length()> 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[^a-zA-Z0-9].*");      
    }
    public static boolean checkCellPhone(String cellNum){
        return cellNum != null &&
                cellNum.matches("\\+27[6-8][0-9]{8}$")&& cellNum.length() == 10;
    }
    public static boolean checkResgisterUser(String username){
        return username != null &&
                username.length() >=5 &&
                username.contains("_");
        
    }
    public static boolean loginUser(String inputUsername, String inputPassword,
                                     String storedUsername, String storedPassword){
        
        return inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);
       
    }
}

