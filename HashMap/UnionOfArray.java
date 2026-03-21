import java.util.*;
public class UnionOfArray{
    public static void main(String[]args){
        int[]num1 = {5,32,6,1,2,3,4,5,6};
        int [] num2 = {12,1,2,3,4,5,6,7,8,9};
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<num1.length;i++){
            set.add(num1[i]);
        }
        for(int i=0;i<num2.length;i++){
            set.add(num2[i]);
        }
        System.out.print(set);
    }
}