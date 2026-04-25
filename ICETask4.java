package com.mycompany.icetask4;

import java.util.Scanner;

public class ICETask4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the height of the pyramid");
        int height = sc.nextInt();
        
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
                System.out.println(" ");
            }
        }
        
        for(int k = 1; k<= (2 * i - 1);k++){
            System.out.println("*");
        }
        
    }
}

