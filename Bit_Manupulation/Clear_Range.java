import java.util.*;

public class Clear_Range{
    public static void Range_Clear(long n , int i , int j){
        long BitMask1 = (((1) << i)-1);
        long BitMask2 = ((-1) << (j+1));
        long BitMask = BitMask1 | BitMask2 ;
        long new_num = (long) n & BitMask;
        System.out.println(new_num);

    }
   public static void main(String[]args){
     long n = 10;
     int i =2;
     int j = 4;
     Range_Clear(n,i,j);
   }

}