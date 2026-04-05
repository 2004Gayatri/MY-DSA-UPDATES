import java.util.*;
public class Mirror{
    public static void main(String[]args){
        String s = "abcda";
        StringBuilder sc = new StringBuilder();
        sc.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)<=s.charAt(i)){
                sc.append(s.charAt(i));
            }else{
                break;
            }
        }
        StringBuilder result = new StringBuilder(sc);
        result.append(new StringBuilder(sc).reverse());
        System.out.print(result);
    }
}