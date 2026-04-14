package com.mycompany.chatpro;
// import your scanner 
import java.util.Scanner;

public class ChatPro {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       // declare your variables 
       String username;
       String password;
       String cellNum;
       
       String storedUsername = "";
       String storedPassword = "";
       String storedCellNum = "";
       
        // declare user input based on your variable
        System.out.println("Create a username: (must contain a space & longer then 5 characters)");
        username = sc.nextLine();
        
        if(!Conditions.isValidUsername(username)){
            System.out.println("Username crierta has not been met");
        }else {
            System.out.println(username + "has been captured");
        }
        
        System.out.println("Create a password: (must contain an uppercase letter , lower case letter "
                + ", a number , a special character & longer then 8 characters)");
        password = sc.nextLine();
        
        if(!Conditions.isValidPassword(password)){
            System.out.println("Password crierta has not been met");
        }else{
            System.out.println(password + "has been captured");
        }
        
        System.out.println("Enter your RSA cell number: (Num must start with +27 ) ");
        cellNum = sc.nextLine();
        
        if(!Conditions.isValidCellNum(cellNum)){
            System.out.println("Cell Number crierta has not been met");
        }else{
            System.out.println(cellNum + "has been captured");
        }
        
        System.out.println("\n --- Login ---");
        
        String loginUsername;
        String loginPassword;
        
        System.out.println("Enter username: ");
        loginUsername = sc.nextLine();
        
        System.out.println("Enter password: ");
        loginPassword = sc.nextLine();
        
        if(loginUsername.equals(storedUsername)&& loginPassword.equals(storedPassword)){
            System.out.println("Welcom " + storedUsername + ", you have successfully logged in");
        }else{
            System.out.println("Login failed due to Password or Password");
        }
  
    }
}

