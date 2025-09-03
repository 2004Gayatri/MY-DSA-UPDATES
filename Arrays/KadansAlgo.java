import java.util.*;
public class KadansAlgo{
    public static void Kadans(int arr1[]){
        int ms =Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr1.length;i++){
           cs +=arr1[i];
           if(cs<0){
            cs=0;
           }
           ms = Math.max(ms,cs);
        }
        System.out.print("Max sum is : " + ms);
    }
    public static void main(String[]args){
        int []arr1 = {-2,-3,4,-1,-1,1,5,-3};
        Kadans(arr1);

    }
}