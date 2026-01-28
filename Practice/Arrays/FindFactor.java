import java.util.*;
public class FindFactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Factorial : ");
        int num = sc.nextInt();
        if(num==0){
            System.out.print("No Factorial ");
        }
        num = Math.abs(num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print("[ " + i + " ] ,");
            }
        }
    }
}