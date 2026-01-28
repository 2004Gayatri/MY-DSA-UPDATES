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
