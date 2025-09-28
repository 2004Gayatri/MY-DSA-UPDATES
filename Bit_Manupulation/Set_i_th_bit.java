import java.util.*;
public class Set_i_th_bit{
    public static int Set_bit (int n , int i){
        int BitMask = 1 << i;
        int new_n = (n | BitMask);
        return new_n;
    }
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int n = sc.nextInt();
       System.out.println("Enter a ith bit to set 1 " );
       int i = sc.nextInt();
       System.out.println("Number is : " + n + " we have to set the ith bit " + i + " to 1  So new number after setting ith bit is : " + Set_bit(n,i));
    }
}