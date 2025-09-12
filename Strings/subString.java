import java.util.*;
public class subString{
    public static void substr(String str , int si , int ei){
        String substr1= "";
        for(int i=si;i<ei;i++){
            substr1 += str.charAt(i);
        }
        System.out.print(substr1);

    }
    public static void main(String[]args){
        String str = "My name is Anthney Gonsalvis ";
        substr(str,0,19);

    }
}