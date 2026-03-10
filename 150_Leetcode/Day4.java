//Moves zeros to last position
// import java.util.*;
// public class Day4{
//     public static void main(String[]args){
//          int nums[]={5,4,0,0,3,2,0,1};
//          int target_pos = 0;
//          for(int current =0;current<nums.length;current++){
//             if(nums[current]!=0){
//                 nums[target_pos]=nums[current];
//                 target_pos++;
//             }
//          }
//          while(target_pos<nums.length){
//             nums[target_pos]=0;
//             target_pos++;
//          }
//          for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+ " ");
//          }
//     }
// }


//Print second largest 
// import java.util.*;
// public class Day4{
//     public static void main(String[]args){
//         int nums[]={100,400,50,200};
//         int max_element = Integer.MIN_VALUE;
//         int second_large=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max_element){
//                 second_large=max_element;
//                 max_element =nums[i];  
//             }
//             else if(second_large<nums[i] && max_element != nums[i]){
//                 second_large=nums[i];
//             }
//         }
//         System.out.print("second_large : " + second_large + "  largest : " + max_element); 
//     }
// }

//check if array is soretd or not 
// import java.util.*;
// public class Day4{
//     public static boolean isSorted(int [] nums){
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 break;
//             }else if (nums[i]>nums[i+1]) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[]args){

//         int nums[] = {1,2,4,5,0};
        
//        System.out.print(isSorted(nums));
        
//     }
// }

// Remove duplicates from sorted array 
// import java.util.*;
// public class Day4{
//     public static int RemoveDuplicate(int [] nums){
//         int target = 0;
//         Arrays.sort(nums);
//         for(int current = 1; current <nums.length;current++ ){
//             if(nums[current]!=nums[target]){
 
//                 target++;
//                 nums[target]=nums[current];
                
//             }
//         }
//         return target + 1 ; 
//     }
//     public static void main (String[]args){
//         int [] nums = {1,1,2,3,4,5,6,2,3};

//         System.out.print("Size of array is : " + RemoveDuplicate(nums));

//     }
// }
// Find Missing Number
import java.util.*;
public class Day4{
    public static void main(String[]args){
        int [] nums = {1,2,3,5};
        int sum =0;
        int n = nums.length + 1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int expected_sum = (n*(n+1))/2;
        int missing_num = expected_sum - sum;
        System.out.print("Number is : " + missing_num);
    }
}