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
        int[]nums={1,2,3};
        int k=3;
        int count_of_subarray =0;
        int sum =0;
        int freq = 1;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,freq);
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             if(map.containsKey(sum-k)){
                count_of_subarray+=map.get(sum-k);
             }
                map.put(sum,map.getOrDefault(sum,0)+1);
             
        }
        System.out.print("Subarray count is : " +count_of_subarray);


    }
}