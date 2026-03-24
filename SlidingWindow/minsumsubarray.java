//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 import java.util.*;
 public class minsumsubarray{
    //Brute force approach
    //  public int minSubArrayLen(int target, int[] nums) {
    //    int length = Integer.MAX_VALUE;
    //    for(int i=0;i<nums.length;i++){
    //      int sum =0;
    //     for(int j=i;j<nums.length;j++){
    //         sum+=nums[j];
    //         if(sum>=target){
    //             if(length>(j-i+1)){
    //                 length=j-i+1;
    //             }  
    //             break;
    //         }
    //     }
    //    }   
    //    if(length==Integer.MAX_VALUE){
    //     return 0;
    //    }
    //    return length;
    // }
    public static void main(String[]args){
      int nums[] = {2,3,1,2,4,3};
      int target =7;
      int sum =0;
      int start = 0;
      int length= Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>=target){
            if(length>(i-start+1)){
                length=i-start+1;
            }
            sum-=nums[start];
            start++;
        }
      }
      if(length==Integer.MAX_VALUE){
        System.out.print(0);
      }else{
        System.out.print(length);
      }

    }
 }