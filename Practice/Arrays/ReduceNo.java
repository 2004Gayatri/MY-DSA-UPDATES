import java.util.*;
public class ReduceNo{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Compress : ");
        String num = sc.nextLine();
        int sum =0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            int digit = Character.getNumericValue(ch);
            sum += digit;
        }
        System.out.println(sum);

        
    }
}