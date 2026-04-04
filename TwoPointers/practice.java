import java.util.*;
public class practice{
    public static boolean isSubsequence(String s , String t){
        if(s.length()==0){
            return true;
        }
        int i =0;
        int j=0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }else{
                j++;
            }
            
        }
        return true;
    }
    public static void main(String[]args){
        String s = "abc";
        String t = "ahjbdc";
        System.out.print(isSubsequence(s,t));
    }
}