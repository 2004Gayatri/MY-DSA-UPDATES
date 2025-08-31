import java.util.*;
public class LargestElement{
    public static void main (String[]args){
        int [] arr1 = {87,43,68,80,21,46};
        int max_num = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]>max_num){
                max_num = arr1[i];
            }
        }
        System.out.print("Largest element in array is : " +max_num);
    }

}