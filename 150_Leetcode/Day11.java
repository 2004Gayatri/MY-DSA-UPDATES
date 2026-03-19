// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length
class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int start =0;
       int end = numbers.length-1;
       while(start<end){
        if((numbers[start]+numbers[end])==target){
            return new int []{start+1,end+1};
        }
        if((numbers[start]+numbers[end])>target){
            end--;
        }else{
            start++;
        }
       }
       return new int[]{};   
    }
}