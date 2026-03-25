// find a minimum length of sub array whose sum = target
 import java.util.*;
 public class minsum{
    public static void main(String[]args){
        int nums[]={2,3,1,2,4,3};
        int target=7;
        int sum =0;
        int start=0;
        int min_lenght = Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                    if(min_lenght>(end-start+1)){
                        min_lenght=end-start+1;
                    }
            
                sum-=nums[start];
                start++;
            }
           
        }
       if(min_lenght==Integer.MAX_VALUE){
         System.out.print(0);
       }else{
         System.out.print(min_lenght);
       }
    }
 }