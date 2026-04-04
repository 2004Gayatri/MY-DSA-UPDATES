import java.util.*;
public class equalsum{
    public static void main(String[]args){
        int [] nums = {1, 7, 3, 6, 5, 6};
        // ----------------Brute force approach----------------------
        //  int left_sum=0;
        // int right_sum=0;
        // int current=0;
        // while(current<nums.length){
        //     left_sum=0;
        //     right_sum=0;
        //     for(int i=0;i<current;i++){
        //         left_sum+=nums[i];
        //     }
        //     for(int i=current+1;i<nums.length;i++){
        //         right_sum+=nums[i];
        //     }
        //     if(left_sum==right_sum){
        //         System.out.print("Element is : " + nums[current]);
        //     }
        //     current++;
        // }
        int total_sum =0;
        int curr_sum =0;
        int right_sum=0;
        for(int i=0;i<nums.length;i++){
           total_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right_sum=total_sum-nums[i]-curr_sum;
            if(right_sum==curr_sum){
                System.out.print(i);
                return;
            }
            curr_sum+=nums[i];

        }
    }
}