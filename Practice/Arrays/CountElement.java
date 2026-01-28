import java.util.*;
public class CountElement{
    public static void main(String[]args){
        String str = "Amcatuff@ #% 123";
        char [] arr = str.toCharArray();
        int count_char =0;
        int count_digit =0;
        int count_whitespace =0;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(Character.isLetter(ch)){
               count_char++;

            }if(Character.isDigit(ch)){
                count_digit++;
            }if(Character.isWhitespace(ch)){
                count_whitespace++;
            }else{
                count_special
            }
        }
        System.out.print(count_char + " " + count_digit + " " + count_whitespace);
    }
}