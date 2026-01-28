import java.util.*;
public class Uppercase{
    public static void main(String[]args){
    String str = "i am gayatri sanap";
    StringBuilder sb = new StringBuilder(str);
    sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
    for(int i=0;i<sb.length()-1;i++){
        if(sb.charAt(i)==' '){
            sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
        }
    }
    System.out.print(sb.toString());

}
}
