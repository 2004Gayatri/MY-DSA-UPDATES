import java.util.*;
public class Que5{
    public static int OrLogic(int A , int B){
        return A | B;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = sc.nextInt();
        System.out.println("Enter B : ");
        int B = sc.nextInt();
        System.out.println(OrLogic(A,B));
    }
}