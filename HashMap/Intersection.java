import java.util.*;
public class Intersection{
    public static void main(String[]args){
        int[]num1 = {5,32,6,1,2,3,4,5,6,111};
        int [] num2 = {12,1,2,3,4,5,6,7,8,9,111};
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        for(int i=0;i<num1.length;i++){
            set.add(num1[i]);
        }
        for(int i=0;i<num2.length;i++){
            if(set.contains(num2[i])){
                set2.add(num2[i]);
            }else{
                set.add(num2[i]);
            }
        }
        System.out.print(set2);
    }
}