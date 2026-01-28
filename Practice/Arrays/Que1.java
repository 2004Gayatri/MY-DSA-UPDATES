import java.util.*;
public class Que1{
    public static void main(String[]args){
        int[] arr1 = {10,10,3,7,6};
        int Total_sum = 0;
        int count = 0;
        for(int i=0;i<arr1.length;i++){
           Total_sum+=arr1[i];
        }
        int prefix_sum =0;
        for(int i=0;i<arr1.length-1;i++){
             prefix_sum += arr1[i];
            int right_sum = Total_sum-prefix_sum;
            if((right_sum-prefix_sum)%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}






