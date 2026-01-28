import java.util.*;
public class clearLast_i_bits{
    public static void Clear_last_bits(int n , int i){
         int BitMask = (-1 << i );
        int new_num = (n & BitMask);
        System.out.println(new_num);
    }
    public static void main(String[]args){
        int n = 15;
        int i=2;
        Clear_last_bits(n,i);
    }
}