import java.util.*;
public class Que4{
    public static void main(String[]args){
        String str = "abcd";
        String str1 = str.replaceAll("[AEIOUaeiou]","");
        char [] arr = str1.toCharArray();
        
        int permutation=1;
        for(int i=1;i<=arr.length;i++){
           permutation = permutation*i;
        }
        System.out.println("Total permutations are : " + permutation);
    }
}