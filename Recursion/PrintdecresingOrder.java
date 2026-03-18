import java.util.*;
public class PrintdecresingOrder{
    public static void decOfn(int n){
        System.out.print(n + " ");
        int basecase =1;
        if(n>1){
            decOfn(n-1);
        }
        
    }
    public static void main(String[]args){
        int n = 10;
        decOfn(10);
    }
}