// here we have to find how many sub arrays are their whose addidtion is K like [1,2,3] k=3 , so their are 2 subarrays whose addidtion is 3 (1,2),(3)
import java.util.*;
public class Subarray{
    public static void main(String[]args){
        // int[]nums={1,2,2,3,4,3,1};
        // int k=4;
        // int count_of_subarray =0;
        // int sum=0;

        //Brute force Solution 1 
        // for(int i=0;i<nums.length;i++){
        //     sum =0;
        //     for(int j=i;j<nums.length;j++){
        //           sum+=nums[j];
        //           if(sum==k){
        //                count_of_subarray ++;
        //           }
        //     }
        // }
        // System.out.print("Count of total subarray is : " + count_of_subarray);
        
        // Optimal Solution
        int[]nums={1,2,2,3,4,3,1};
        int k=4;
        int count_of_subarray =0;
        int sum=0;
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.contains(k)){
               count_of_subarray++;
            }else{
                map.add(sum);
            }
            sum=0;
        }
        System.out.print("So total subarrays are : " + count_of_subarray);


    }
}