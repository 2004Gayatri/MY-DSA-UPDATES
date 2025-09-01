import java.util.*;
public class BasicQuestions{
    public static void main(String[]args){
        int[] arr1= {1,2,3,4,5};
        //Find the sum of all elements in the array 
        int total_sum =0;
        for(int i=0;i<=arr1.length;i++){
            total_sum+=i;
        }
        System.out.print("Total sum is : " + total_sum);
        
        //Code to fine number of even and odd number in array
        int count_even = 0;
        int count_odd=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                count_even+=1;
            }else{
                count_odd+=1;
            }
        }
        System.out.println("Number of even number in array are : " +count_even);
        System.out.println("Number of odd numbers in array are : " + count_odd);
        //Reverse the array 
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            int temp = arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            start++;
            end--;
        } 
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        
    }
}