import java.util.*;
public class pyq{
    public static int Count_of_sub(int [] arr){
        /*
Problem: Count Subarrays of Size 3 with Specific Condition

You are given an array of integers. Your task is to find and return 
the total number of subarrays of size 3 such that:

    (first element + third element) = second element

Example:
Input:  arr = [4, 9, 5, 6, 11, 2, 3, 1]
Output: 1
Explanation: Only the subarray [4, 9, 5] satisfies 4 + 5 = 9
*/

        int count =0;
        for(int i=0;i<=arr.length-3;i++){
            if (arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return count;
    }
   public static void print_fibbonacci(){
    int[] Fibo_arr = new int[10];
    Fibo_arr[0]=0;
    Fibo_arr[1]=1;
    for(int i=2;i<Fibo_arr.length;i++){
      Fibo_arr[i]= Fibo_arr[i-1]+Fibo_arr[i-2];
    }
    for(int i=0;i<Fibo_arr.length;i++){
        System.out.print(Fibo_arr[i] + " ");
    }
   }
    public static void main(String[]args){
         int [] arr = {4, 9, 5, 6, 11,2,3,1};
        // System.out.print("Count of subarrays with applied condition is : " +  Count_of_sub(arr));
        print_fibbonacci();

    }
}