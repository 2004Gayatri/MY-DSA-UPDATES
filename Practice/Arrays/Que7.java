import java.util.*;
// Two Sum Problem – Find indices of two numbers that add up to a given target.
public class Que7{
    public static void main(String[]args){
        int [] arr = {1,4,2,3,5,0};
        int target = 5;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(curr+arr[j]==target){
                    System.out.print("Indices are : " + i + " " + j);
                }
              
            }
              System.out.println();
        }
    }
}