import java.util.*;
public class BinarySearch{
    public static int BinarySearch( int[]arr1, int key){
        int start =0;
        int end = arr1.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr1[mid]==key){
                return mid;
            }
            if (arr1[mid]<key){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main (String[]args){
        int[] arr1 = {6,4,1,3,2,5};
        Arrays.sort(arr1);
        int key = 7;
        if(BinarySearch(arr1,key)==-1){
            System.out.print("No key is not their ");
        }else{
            System.out.print("Key is found !! ");
        }

    }
}