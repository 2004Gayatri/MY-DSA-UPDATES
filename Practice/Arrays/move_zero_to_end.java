import java.util.*;
public class move_zero_to_end{
    public static void zeroend(int[] arr){
        int start=0;
        int end= arr.length-1;
        int[] newarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newarr[start]=arr[i];
                start++;
            }else{
                newarr[end]=arr[i];
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(newarr[i] + " ");
        }
    }
    public static void main(String[]args){
        int [] arr = {1,0,2,0,3,0,4,0,5,0,6,0};
        zeroend(arr);
    }
}