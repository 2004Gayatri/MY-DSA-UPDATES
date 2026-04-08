//Given a string s, find the first non-repeating character and return its index.
import java.util.*;
public class repeatingchar{
    public static void main(String[]args){
        String s = "leetcode";
        LinkedHashMap <Character , Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.print(i); // index
                return;
            }
        }

        System.out.print(-1);
    }
}