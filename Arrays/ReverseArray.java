import java.util.*;
public class ReverseArray{
    public static void main(String[]args){
        int [] arr1 = {5,4,3,2,1};
        int start=0;
        int end = arr1.length-1;
        while(start<=end){
            int temp = arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            end--;
            start++;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}