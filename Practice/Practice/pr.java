import java.util.*;
public class pr{
    public static void main(String[]args){
        int arr1[]={90,54,78,200};
        int key = 78;
        while(arr1.length>=0){
            int start = 0 ;
            int end = arr1.length-1;
            for(int i=0;i<arr1.length;i++){
                int mid = (start + end)/2;
                if(arr1[i]==arr1[mid]){
                    System.out.println("Index is : " + i + "for this number "+arr1[mid]); 
                }
            }
            
        }
    }
}