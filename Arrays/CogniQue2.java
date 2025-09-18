import java.util.*;
public class CogniQue2{
    // Reverse the String
    public static void main(String[]args){
        String str = "irtayag";
        char[] arr1 = str.toCharArray();

        int start =0;
        int end = arr1.length-1;
        while(start<=end){
            char temp = arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            start++;
            end--;
        }
       
        String str2 =new String(arr1);
        System.out.print(str2);
    }
}