package org.core_java.basic_data_structure;

public class ArmstrongBetweenRange {
    // Find out all the armstrong numbers falling in the range 100-999
    public static void main(String[] args) {

        for(int i=100;i<=999;i++){
            int temp=i;
            int sum=0;
            int last=0;
            while(temp>0){
                last=temp%10;
                temp=temp/10;
                sum+=(Math.pow(last,3));
            }
            if(i==sum){
                System.out.print(i+" ");
            }
        }
    }
}
