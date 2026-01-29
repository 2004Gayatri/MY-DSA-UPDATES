import java.util.*;
public class pr{
  public static void main(String[]args){
    int [] arr1 = {1, 2, 3, 2, 1,4};
    int [] arr2 = new int[arr1.length];
    int end = arr1.length-1;
    for(int i =0;i<arr1.length/2;i++){
      int temp = arr1[end];
      arr2[end]= arr1[i];
      arr2[i]=temp;
      end --;
    }
    for(int i=0;i<arr2.length;i++){
      System.out.print(arr2[i] + " ");
    }
    
  }
}