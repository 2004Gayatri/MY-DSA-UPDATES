import java.util.*;
public class PowerOf2{
    public static void main(String[]args){
        int n = 4 ;
        if((n & (n-1))==0){
            System.out.println("NUmber " + n + " is power of 2");
        }else{
            System.out.println("Number is not power of 2 ");
        }
    }
}