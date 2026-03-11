import java.util.*;
public class moveszore{
    public static void main(String[]args){
        String s1 = "good";
        String s2 = "bad";
       StringBuilder sb = new StringBuilder();
       int max_length = Math.max(s1.length(),s2.length());
       for(int i=0;i<max_length;i++){
        if(i<s1.length()){
            sb.append(s1.charAt(i));
        }
        if(i<s2.length()){
            sb.append(s2.charAt(i));
        }
       }
        String ans = sb.toString();
        System.out.print(ans);

    }
}