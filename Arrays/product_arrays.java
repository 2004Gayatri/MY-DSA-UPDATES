// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

public class product_arrays{
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int [] result = new int[n];
      int i=0;
      while(i<nums.length){
        int left_product = 1;
        int right_product = 1;
        for(int j=0;j<i;j++){
            left_product=left_product*nums[j];
        }
        for(int j=nums.length-1;j>i;j--){
            right_product=right_product*nums[j];
        }
        int final_product = left_product * right_product;
        result[i]=final_product;
        i++;
      } 
      return result;
    }
}