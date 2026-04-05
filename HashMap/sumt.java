import java.util.*;
public class sumt{
    public static void main (String[]args){
        // By the logic of two pointers
      //   int start=0;
      //   int sum=0;
      //   int end = nums.length-1;
      //   while(start<end){
      //        sum = nums[start]+nums[end];
      //         if(target==sum){
      //           System.out.print("Indices are : " + start +" " + end );
      //           return;
      //        }
      //        if(sum>target){
      //           end--;
      //        }else{
      //           start++;
      //        }
            
      //   }

      // Trying to solve it by HashMap
       int[] nums = {2,7,11,15};
       int target = 9;
       int sum =0;
      HashMap <Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
         map.put(nums[i],i);
      }
      for(int i=0;i<nums.length;i++){
           sum = nums[i];
           int needed = target-sum;
           if(map.containsKey(needed)){
            System.out.print("Indices are : " +i + " " +map.get(needed));
            break;
           }
      }
    }
}