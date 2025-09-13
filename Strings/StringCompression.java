import java.util.*;
public class StringCompression{
    public static void main(String[]args){
        String str = "aaabbbaaayyy";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            int count =1;
            while( i+1 < str.length() &&  str.charAt(i+1)==curr ){
                count ++;
                i++;
            }
            sb.append(curr);
            sb.append(count);
        }
        System.out.print(sb.toString());
    
    }
}