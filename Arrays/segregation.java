import java.util.*;
public class segregation{
     public static void SegregateArr(int [] arr){
        int [] result_arr = new int[arr.length];
        int start=0;
        int end = arr.length-1;
       
       for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            result_arr[start]=arr[i];
            start++;
           }else{
            result_arr[end]=arr[i];
             end--;
           }
       }
        for(int i=0;i<result_arr.length;i++){
            System.out.print(result_arr[i]+ " ");
        }
    }
    public static void main(String[]args){
        int [] arr = {4,-3,2,1};
        SegregateArr(arr);

    }
}