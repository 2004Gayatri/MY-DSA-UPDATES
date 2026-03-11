import java.util.*;
public class longestsubstring{
    String s = "abcabcdda";
    StringBuilder sb = new StringBuilder();
    int count=1;
    for(int i=0;i<s.length();i++){
        for(int j=1;j<s.length();j++){
         sb.append(s.charAt(i));
         sb.append(s.charAt(j));
         count++;
         
        }
    }
}