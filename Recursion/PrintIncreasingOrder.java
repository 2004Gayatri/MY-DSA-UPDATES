import java.util.*;
public class PrintIncreasingOrder{
    public static void IncreasingOrder(int n){
        int start = 1;
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        IncreasingOrder(n-1);
        System.out.print(n + " ");
        
      
    }
    public static void main(String[]args){
        int n = 10;
        IncreasingOrder(10);

    }
}