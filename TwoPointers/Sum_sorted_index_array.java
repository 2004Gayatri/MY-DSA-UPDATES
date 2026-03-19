// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

// Optimal solution by 2 pointers
// import java.util.*;
// public class Sum_sorted_index_array{
//     public static int[] arrfun(int[]arr,int target){
//        int start =0;
//        int end = arr.length-1;
//        while(start<end){
//         int sum = arr[start]+arr[end];
//         if(sum==target){
//             return new int[]{start+1,end+1};
//         }
//         if(sum>target){
//             end--;
//         }else{
//             start++;
//         }
//        }
//        return new int[]{};
//     }
//     public static void main(String[]args){
//         int arr[] = {1,2,3,7};
//         int target = 5;
//         System.out.print(Arrays.toString(arrfun(arr,target)));
//     }
// }

// Brute force approach

import java.util.*;
public class Sum_sorted_index_array{
    public static void main(String[]args){
        int arr[] = {1,2,3,7};
        int target = 5;
     for(int i=0;i<arr.length;i++){
        int start = i;
        for(int j=i+1;j<arr.length;j++){
             int end = j;
             int sum = arr[start]+arr[end];
             if(target==sum){
                System.out.print("[" + (start+1) + " , " + (end+1) + "]");
             }
        }
     }
    }
}









