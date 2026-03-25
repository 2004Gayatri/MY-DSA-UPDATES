import java.util.*;
public class maxsum{
    public static void main(String[]args){
       int [] nums = {2,1,5,1,3,2};
       int target_max_length =3;
       int max_sum = Integer.MIN_VALUE;
       int start = 0;
       int sum=0;
       for(int end=0;end<nums.length;end++){
           sum+=nums[end];
           while((end-start+1)==target_max_length){
              if(max_sum<sum){
                max_sum=sum;
              }
              sum-=nums[start];
              start++;
           }
       }
       System.out.print(max_sum);
    }
}