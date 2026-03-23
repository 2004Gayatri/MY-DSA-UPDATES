//Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.

import java.util.*;
public class word{
    public static boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap <Character , String> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
               if(!map.get(ch).equals(word)){
                return false;
               }
            }else{
                if(map.containsValue(word)){
                    return false;
                }
            }
            map.put(ch,word);
            

        }
        return true;
    }
    public static void main(String[]args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.print(wordPattern(pattern,s));
        
    }
}
