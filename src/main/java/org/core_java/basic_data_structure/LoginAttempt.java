package org.core_java.basic_data_structure;

import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        String username= "AtulJaware";
        String password= "Pass@123";
        int attempt=0;

        while(attempt < 3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Username :");
            String uName =sc.nextLine();
            System.out.println("Enter Password :");
            String pass= sc.nextLine();

            if(uName.equals(username) && pass.equals(password)){
                System.out.println("Welcome, "+username);
                break;
            }
            else {
                attempt++;
                if (attempt < 3) {
                    System.out.println("Invalid Credentials....!");
                } else {
                    System.out.println("Contact Admin");
                }
            }
        }
    }
}
