package org.core_java.basic_data_structure;

import java.util.Scanner;

public class StudentResult {
    // All Subject marks greater than 60 is passed
    // Any two subject marks greater than 60 is promoted
    // Any two subject marks less than 60 is failed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 Mark :");
        int sub1=sc.nextInt();
        System.out.println("Enter Subject 2 Mark :");
        int sub2=sc.nextInt();
        System.out.println("Enter Subject 3 Mark :");
        int sub3=sc.nextInt();
        int subPass=0;
        if( sub1 >= 60){
            subPass++;
        }
        if(sub2 >= 60) {
            subPass++;
        }
        if(sub3 >= 60){
            subPass++;
        }
        if(subPass==3){
            System.out.println("Result : PASS");
        }
        else if(subPass==2){
            System.out.println("Result : PROMOTED");
        }
        else{
            System.out.println("Result : FAILED");
        }
    }
}
