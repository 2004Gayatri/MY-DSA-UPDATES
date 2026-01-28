import java.util.*;
public class Selection{
    public static void main(String[] args){
        int[] arr1 = {8,4,7,6,5,3,2,1};
        for(int i=0;i<arr1.length-1;i++){
            int minpos =i;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[minpos]>arr1[j]){
                    minpos=j;
                }
            }
            int temp = arr1[minpos];
            arr1[minpos]=arr1[i];
            arr1[i]= temp;
        }
        for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i] + " ");
        }
    }
}