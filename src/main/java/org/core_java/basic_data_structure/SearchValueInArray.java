package org.core_java.basic_data_structure;

import java.util.Scanner;

public class SearchValueInArray {
    public static void main(String[] args) {
        int [] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to search : ");
        int search= sc.nextInt();
        boolean found=false;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==search){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(search+" is Present in Array");
        }
        else{
            System.out.println(search+" is Not Present in Array");
        }
    }
}
