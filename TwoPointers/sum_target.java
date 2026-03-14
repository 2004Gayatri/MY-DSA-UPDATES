import java.util.*;
public class sum_target{
    
    public static void main(String[]args){
        int [] nums = {1,2,3,4,5,6};
       
        //----------------Optimal Solution-----------------------------
        // int end = nums.length-1;
         int target = 6; // main target sum
        // while(start<end){
        //     int sum = nums[start]+nums[end];
        //     if(sum == target && start!=end){
        //         System.out.println("[" + nums[start] + " , " + nums[end] + "]");
        //         start++;
        //         end--;
        //     }
        //     if(sum>target){
        //         end--; // giving priority to smaller numbers and reducing larger numbers 
        //     }
        //     if(sum<target){
        //         start++; // giving priority to larger numbers and reducing smaller numbers 
        //     }
        // }

        //---------------Brute Force solution-------------------
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i+1;j<nums.length;j++){
                if((nums[j]+nums[start] )== target && j!=start){
                   System.out.println("[" + nums[start] + " , " + nums[j] + "]");
                }
            }
        }

    }
}