import java.util.*;
public class Longestsub{
    
    public static void longestPalindrome(String s) {
       s = s.toLowerCase();
       for(int i=0;i<s.length()-1;i++){
        for(int j=i+1;j<s.length();j++){
            String sub = s.substring(i,j+1);
            System.out.print(sub + " ");
        }
        System.out.println();
       }
    }
    public static void main(String[]args){
        String s = "badadb";
        longestPalindrome(s);
    }
}
