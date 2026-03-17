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
       // Optimal Solution that give TC = O(n) and SC = O(n)
        int left =0;
        int right = nums.length-1;
        int index = nums.length-1;
        int result [] = new int[nums.length];
        while(left<=right){
            if((nums[left]*nums[left])<nums[right]*nums[right]){
                result[index]=nums[right]*nums[right];
                index--;
                right--;
            }else{ 
                 result[index]=nums[left]*nums[left];
                 index--;
                 left++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            System.out.print(result[i]+ " ");
        }
    }
}