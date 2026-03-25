import java.util.*;
// Given a string s and an integer k, return the number of substrings of length k with no repeated characters.
public class maxLength{
    public static void main(String[]args){
        String s ="havefunonleetcode";
        HashSet <Character> set = new HashSet<>();
        int ans =0;
        int target_length = 5;
        int start =0;
        for(int end =0;end<s.length();end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                 set.remove(s.charAt(start));
                 start++;
            }
            set.add(ch);
            if((end-start+1)==target_length){
                ans++;
                set.remove(s.charAt(start));
                start++;
            }
        }
        System.out.print(ans);
    }
}