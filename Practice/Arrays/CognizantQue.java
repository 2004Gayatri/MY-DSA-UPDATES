import java.util.*;
//To check that is the arrays elements last digit creating one digit this digit is divisible by 10 or not .
public class CognizantQue{
    public static void main(String[]args){
        int [] arr1 = {12,13,14,50,40};
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<arr1.length;i++){
           int curr = arr1[i];
           sb.append(curr%10);
        }
        int num = Integer.parseInt(sb.toString());
        if(num %10 == 0){
            System.out.print("Yes it is divisible by 10 ");
        }
        sb.toString();
        System.out.print(sb);
    }
}