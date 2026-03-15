import java.util.*;
public class RemoveDuplicateFromSorted{
    public static int RemoveDuplicate(int[]nums){
        int previous =0;
        for(int current = 1; current<nums.length;current++){
            if(nums[current]!=nums[previous]){
                nums[previous+1]=nums[current];
                previous++;
            }
        }
        return previous+1;
    }
    public static void main(String[]args){
        int [] nums = {1,1,2,2,3,4,4,7};
        System.out.print("Length of array without duplicate is : " + RemoveDuplicate(nums));
    }
}