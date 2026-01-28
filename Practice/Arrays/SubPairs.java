import java.util.*;
public class SubPairs{
    public static void main(String[]args){
        int[] arr1={2,4,6,8,10};
        for(int i=0;i<arr1.length;i++){
            int curr =i;
            for(int j=i+1;j<arr1.length;j++){
                System.out.print("(" + arr1[curr] + "," + arr1[j] + ")");
            }
            System.out.println();
        }

    }
}