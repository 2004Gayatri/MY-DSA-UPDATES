//First Non-Repeating Character
import java.util.*;
public class NonRepeting1stChar{
    public static void main(String[]args){
        String s = "mmgdfs";
        LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char key : map.keySet() ){
            if(map.get(key)==1){
                System.out.print(key);
                return;
            }
        }
    }
}