package org.core_java.basic_data_structure;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int l= arr.length;
        int temp = 0;

        for(int i=0;i<l;i++){
            for(int j=1;j<(l-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i < l; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
