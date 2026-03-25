// Given a string s, find the length of the longest substring without duplicate characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count_of_longest_substring =Integer.MIN_VALUE;
        HashSet <Character> set = new HashSet<>();
        int start =0;
        for(int end=0;end<s.length();end++){
           char ch = s.charAt(end);
         
           while(set.contains(ch)){
            set.remove(s.charAt(start));
            start++;
           }
            set.add(ch);
            if(count_of_longest_substring<set.size()){
                count_of_longest_substring = set.size();
            }
        }
        if(count_of_longest_substring==Integer.MIN_VALUE){
            return 0;
        }
        return count_of_longest_substring;
    }
}