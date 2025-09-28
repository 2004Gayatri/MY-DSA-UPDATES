import java.util.*;
// Find Duplicate in an Array – Without using extra space (Floyd’s Cycle method).
public class Que9{
    public static void main(String[]args){
    int [] arr = {1,2,3,3,4,1};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("Duplicate is  : " + arr[i]);
            }
        }  
    }
    } 
}