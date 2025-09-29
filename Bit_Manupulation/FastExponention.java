import java.util.*;
public class FastExponention{
    public static int Exponentioncal(int a , int n ){
        int ans = 1;
        while(n>0){
            if((n&1)==1){
                ans = ans * a;
            }
            a = a * a;
           n= n >> 1;
        }
        return ans;
    }
    public static void main(String[]args){
    System.out.println( Exponentioncal(3,3));
    }
}