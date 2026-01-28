import java.util.*;

// Subarray with Given Sum – Check if a subarray exists with the given sum.

public class Que8{
    int sum=0;
    public static void main (String[]args){
      int [] arr = {1,6,4,7,2,3,0};
      int targer_sum = 10;
      int sum =0;
      for(int i=0;i<arr.length;i++){
        int start = i ;
        sum =0;
        for(int j=i;j<arr.length;j++){
         int end = j;
         sum += arr[j];
         if(sum == targer_sum){
            System.out.print("Subarray is : ");
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]);
            }
            System.out.println();
         }     
        }
      }
    }
}