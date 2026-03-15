import java.util.*;
public class ReverseArray{
    public static void main(String[]args){
        int [] nums = {5,4,3,2,1};
        // Optimal approach where time complexity = O(n) and space is O(1)
        // int start =0;
        // int end = nums.length-1;
        // while(start<end){
        //     int temp = nums[start];
        //     nums[start]=nums[end];
        //     nums[end]=temp;
        //     start++;
        //     end--;
        // }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }
        // this is brute force where time complexity is O(n) and space is O(n)
        int [] newarr = new int[nums.length];
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
         newarr[index]= nums[i];
          index++;
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+ " ");
        }
    }
}