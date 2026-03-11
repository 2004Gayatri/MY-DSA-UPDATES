import java.util.*;
public class removeduplicate{
    public static void main(String[]args){
        String s = "helloho";
        LinkedHashMap <Character , Integer> map= new LinkedHashMap<>();
        int count=1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int countofd=0;
        for(int value : map.values()){
            if(value>1){
                countofd++;
            }
        }
        System.out.print(countofd);
    }
}
