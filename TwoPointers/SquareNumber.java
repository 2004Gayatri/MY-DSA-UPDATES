import java.util.*;
public class SquareNumber{
    public static void main(String[]args){
        int [] nums = {-7, -3, -1, 4, 8, 12};

        //Brute force approach , Time complexity = O(n log n) and space complexity Space complexity = O (1)
        // int current =0;
        // for(int i=0;i<nums.length;i++){
        //     nums[current]=nums[i]*nums[i];
        //     current++;
        // }
        // int current =0;
        // for(int next =0;next<nums.length;next++){
            
        // }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+ " ");
        // }

        int current =0;
        for(int i=0;i<nums.length;i++){
            nums[current]=nums[i]*nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}