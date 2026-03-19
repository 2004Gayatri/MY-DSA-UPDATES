//Brute force approach
// import java.util.*;
// public class sumcheck{
//     public static void main(String[]args){
//         int nums[]={1, 2, 0, 3};
        
//         int sum1 =0;
//         int sum2 =0;
//         for(int i=0;i<nums.length;i++){
//             int ans = i;
//            for(int j=0;j<ans;j++){
//             sum1+=nums[j];
//            }
//            for(int j=ans+1;j<nums.length;j++){
//             sum2+=nums[j];
//            }
//            if(sum1==sum2){
//             System.out.println("index is : " + ans);
//            }
//            sum1=0;
//            sum2=0;
           
//         }
//     }
// }
//Optimal approach
import java.util.*;
public class sumcheck{
    public static void main(String[]args){
       int nums[]={1, 2, 0, 3};
     int total_sum =0;
     for(int i=0;i<nums.length;i++){
        total_sum+=nums[i];
     }
     int left_sum =0;
     for(int i=0;i<nums.length;i++){
         int right_sum = total_sum - left_sum - nums[i];
          if(left_sum==right_sum){
            System.out.print("Index is : " + i);
          }
          left_sum+=nums[i];
          right_sum=0;
     }
    }
}
