import java.util.*;
public class Missingele{
    public static int Missing_ele(int[]arr){
        int n = arr.length+1;
        long Total_sum =((long) n*(n+1))/2;
        long curr_sum =0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
        }
        return (int) (Total_sum-curr_sum);
    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4};
        System.out.print("Current Missing element  is : " + Missing_ele(arr));
    }
   
}