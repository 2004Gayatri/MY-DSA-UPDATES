import java.util.*;
public class LargestSubarraysumzero{
    public static void main(String[]args){
        int [] nums = {15,-2,2,-8,1,7,10,23};

        //Method 1 (Optimal Approach)
        // HashMap <Integer , Integer> map = new HashMap<>();
        // int sum =0;
        // int max_length = 0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(sum==0){
        //         max_length=i+1;
        //     }
        //     if(map.containsKey(sum)){
        //         max_length = Math.max(max_length, i - map.get(sum));
        //     }else{
        //         map.put(sum , i);
        //     }
        // }
        // System.out.print("maximum length is : " + max_length);

        //Brute force Approach
        int sum =0;
        int max_length=0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==0){
                    max_length = Math.max(j-i+1 , max_length);
                }
            }
        }
        System.out.print("Max length : " + max_length);
        
    }
}