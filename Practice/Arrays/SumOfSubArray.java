import java.util.*;
public class SumOfAubArray{
    public static void main(String[]args){
        int [] arr1 = {2,4,6,8,10};
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            int start = arr1[i];
            for(int j=i ; j<arr1.length;j++){
                int end = arr1[j];
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum+=sum+arr1[k];
                }
                System.out.print("Sum from " + i + "to" + j + "=" + sum);
            }
            System.out.println();
        }
    }
}