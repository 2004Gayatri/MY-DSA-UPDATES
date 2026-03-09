
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

//Return k after placing the final result in the first k slots of nums.
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If length is less than or equal to 2, no change needed
        
        int insertPos = 2; // Start inserting from index 2 (because we allow at most 2 duplicates)
        
        for (int i = 2; i < nums.length; i++) {
            // Only insert the current number if it's different from the number at insertPos - 2
            // This ensures that there are no more than 2 occurrences of each number
            if (nums[i] != nums[insertPos - 2]) {
                nums[insertPos] = nums[i];  // Insert the number at the appropriate position
                insertPos++;  
            }
        }
        
        return insertPos; // The length of the array with at most 2 duplicates
    }
}