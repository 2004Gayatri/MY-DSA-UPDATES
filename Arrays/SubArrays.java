import java.util.*;
public class SubArrays{
    public static void main (String[]args){
        int[] arr1 = {1,2,3,4};
        for(int i=0;i<arr1.length;i++){
            int start = arr1[i];
            for(int j=i;j<arr1.length;j++){
                int end = arr1[j];
                for(int k=i;k<j;k++){
                    System.out.print(arr1[k]);
                }
                 System.out.println();
            }
        }

    }
}