import java.util.*;
public class Update_ith_bit{
    public static void main (String[]args){
        int n = 10;
        int i=1;
        int new_i = 1;
        int BitMask = 1<<i;
        if(new_i==0){
            BitMask= ~ (1<<i);
            int new_num = n & BitMask;
            System.out.println(new_num);
        }else{
           int new_num = n | BitMask;
           System.out.println(new_num);
        }
    }
}