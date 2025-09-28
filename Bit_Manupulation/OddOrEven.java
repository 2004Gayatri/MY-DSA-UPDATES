import java.util.*;
public class OddOrEven{
    public static void EvenOrOdd(int n){
        int BitMask = 1;
        if((n & BitMask) ==0){
            System.out.println("Number is even ");
        }else{
            System.out.println("Number is odd ");
        }
    }
    public static void main (String[]args){
        int n = 1110;
        EvenOrOdd(n);
    }
}