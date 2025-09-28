import java.util.*;
public class Find_ith_bit{
    public static int Find_ith_bit_of(int n , int i){
        int BitMask = 1 << i;
        if((n & BitMask)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter bit that you want : " );
        int i = sc.nextInt();

       System.out.println("ith bit of the number" + n + " is : " + Find_ith_bit_of(n,i));
    }
}