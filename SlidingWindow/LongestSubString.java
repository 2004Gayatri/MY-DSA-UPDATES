import java.util.*;
public class LongestSubString{
    public static void main(String[]args){
        String s = "abcabcbb";
        int start=0;
        int max_length = Integer.MIN_VALUE;
        HashSet <Character> set = new HashSet<>();
        for(int end=0;end<s.length();end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(set.charAt(start));
                start++;
            }
            set.add(ch);
            if(max_length<set.size()){
                max_length=set.size();
            }
        }
        if(max_length==Integer.MIN_VALUE){
            System.out.print("Max length is : 0" );
        }else{
            System.out.print("Max length is : " + max_length);
        }
    }
}