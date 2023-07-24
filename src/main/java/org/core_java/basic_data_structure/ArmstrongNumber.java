package org.core_java.basic_data_structure;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int digit=0;
        int last=0;
        int sum=0;

        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=num;
        while(temp>0){
            last=temp%10;
            temp=temp/10;
           sum+= (Math.pow(last,digit));
        }
        if(num==sum){
            System.out.println(num +" is an Armstrong Number");
        }
        else{
            System.out.println(num +" is Not an Armstrong Number");
        }
    }
}
