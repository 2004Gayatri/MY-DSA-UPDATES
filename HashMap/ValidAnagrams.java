import java.util.*;
public class ValidAnagrams{
    // Method-1 (BY my logic)
    // public static void main(String[]args){
    //     String s = "race";
    //     String t = "care";
    //     LinkedHashMap <Character , Integer> map1 = new LinkedHashMap<>();
    //     LinkedHashMap <Character , Integer> map2 = new LinkedHashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    //     }
    //      for(int i=0;i<t.length();i++){
    //         map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
    //     }
    //   if(map1.equals(map2)){
    //     System.out.print("'Valid Anagrams'");
    //   }else{
    //      System.out.print("'Not Valid Anagrams'");
    //   }
    // }

    //Method 2
    public static void main(String[]args){
        String s = "race";
        String t = "care";
        HashMap <Character , Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            System.out.print("Not Anagrams");
            return;
        }
        for(int i=0;i<s.length();i++){
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                System.out.print("Not Anagrams");
                return;
            }else{
                map.put(ch,map.get(ch)-1);
            }
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        if(map.isEmpty()){
            System.out.print("Anagrams");
        }else{
            System.out.print("Not Anagrams");
        }
    }
}