import java.util.*;
public class moveszore{
    public static void main(String[]args){
       String s = "aaabbbbccddd";
       StringBuilder sb = new StringBuilder();
       int count = 1;
       for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }else{
            sb.append(s.charAt(i));
            sb.append(count);
            count=1;
        }
       }
       sb.append(s.charAt(s.length()-1));
       sb.append(count);
       
       String s1 = sb.toString();
       System.out.print(s1);
    }
}