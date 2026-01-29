<<<<<<< HEAD
import java.util.*;
public class pr{
    public static void main(String[]args){
       int [] arr1 = {10,30,20,60,50,100};
      int largest_num = Integer.MIN_VALUE;
      int second_largest = Integer.MIN_VALUE;
      for(int i=0;i<arr1.length;i++){
          if(arr1[i]>largest_num){
            second_largest = largest_num;
             largest_num=arr1[i];
          }else if (second_largest<arr1[i] && arr1[i]!= largest_num){
            second_largest=arr1[i];
          }
        }
        System.out.println("Largest Number is : " + largest_num);
        System.out.println("second_largest is : " + second_largest);
      }
      
    
    }
=======
// import java.util.*;
// public class pr{
//     public static void main(String[]args){
//       int arr1 [] = {1,2,4,3,5};
//       int n = arr1.length+1;
//       int sum_of_n =( n*(n+1))/2;
//       int sum =0;
//       for(int i=0;i<arr1.length;i++){
//          sum += arr1[i];
//       }
//       int missing_element = sum_of_n - sum;
//       System.out.print("missing_element is : " + missing_element);
//     }
// }
// import java.util.*;
// public class pr{
//     public static void main(String[]args){
//         int arr1 [] = {1,2,4,33,50};
//         int largest_element = Integer.MIN_VALUE;
//         int second_element = Integer.MIN_VALUE;
//         for(int i =0;i<arr1.length;i++){
//             if(largest_element<arr1[i]){
//               second_element = largest_element;
//               largest_element = arr1[i];
//             }
//             else if(arr1[i]>second_element && largest_element>arr1[i]){
//                 second_element = arr1[i];
//             }
//         }
//         System.out.println("Largest is " + largest_element + " Second largest is " + second_element);
//     }
// }
// import java.util.*;
// public class pr{
//     public static void main(String[]args){
//         int [] arr1 = {1, 2, 3, 4, 5};
//         boolean result = true;
//         for(int i=0;i<arr1.length-1;i++){
//             if(arr1[i]>arr1[i+1]){
//                   result = false;
//             }
//         }
//         System.out.println(result);
//     }
// }
// Find duplicate element
import java.util.*;
public class pr{
    public static void main(String[]args){
        int [] arr1 = {1, 3, 4, 2, 2};
        
    }
}
>>>>>>> 3dc3bd6 (new updates)
