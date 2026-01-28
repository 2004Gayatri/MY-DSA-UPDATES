import java.util.*;
public class anagrams{
    public static void main (String[] args){
        String str1 = "gayatri";
        String str2 = "agayriti";
        str1.toLowerCase();
        str2.toLowerCase();
       if(str1.length()==str2.length()){
         char [] arr = str1.toCharArray();
        char [] arr1 = str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        boolean result = Arrays.equals(arr,arr1);
       if(result){
        System.out.print("Strings are anagrams!! ");
       }else{
        System.out.print("Strings are not anagrams.........");
       }
       }else{
        System.out.print("Strings are not anagrams.........");
       }
    }
}