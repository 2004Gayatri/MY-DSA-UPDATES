import java.util.*;
public class Swap_num{
    public static void main (String [] args){
        int x = 10;
        int y =11;
        System.out.println("Number before swap x : " + x + " , y : " + y);
        x = x ^ y;
        y= y ^ x;
        x = x ^ y;
         System.out.println("Number after swap x : " + x + " , y : " + y);
    }
}