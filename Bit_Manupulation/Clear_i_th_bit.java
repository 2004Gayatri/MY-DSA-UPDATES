import java.util.*;
public class Clear_i_th_bit{
    public static int Clear_bit (int n , int i){
        int BitMask = ~(1<<i);
        int new_num = n & BitMask;
        return new_num;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =10;
        int i =1;
        System.out.println(Clear_bit(10,1));
    }
}