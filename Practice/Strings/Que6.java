import java.util.*;
public class Que6{
    public static void main(String[]args){
       Scanner sc = new Scanner (System.in);
       int [] arr1 = {1,2,5,3};
       Arrays.sort(arr1);
       int n = arr1.length+1;
       int sum =0;
       for(int i=0;i<arr1.length;i++){
          sum+=arr1[i];
       }
       int total_sum = (n*(n+1))/2;
       int ele = total_sum - sum;
       System.out.print(ele);

    }
}