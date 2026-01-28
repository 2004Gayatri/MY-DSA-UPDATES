import java.util.*;
public class Palindrome{
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                return true;
            }
            
        }
        return false ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check is it palindrome or not : ");
        String str = sc.nextLine();
        if(checkPalindrome(str)){
            System.out.println("String is palindrome ");
        }else{
            System.out.print("String is not palindrome");
        }
    }
}