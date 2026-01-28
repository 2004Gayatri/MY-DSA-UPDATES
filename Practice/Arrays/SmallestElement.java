import java.util.*;
public class SmallestElement{
    public static void main (String[]args){
        int [] arr1 = {87,43,68,80,21,46};
        int min_num = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<min_num){
                min_num = arr1[i];
            }
        }
        System.out.print("Smallest element in array is : " +min_num);
    }

}