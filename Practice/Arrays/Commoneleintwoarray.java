import java.util.*;
public class Commoneleintwoarray{
    public static void main(String[]args){
      int [] arr1 = {1,2,3,4,5};
      int [] arr2 = {4,5,2,7,8};
      int [] arr3 = new int[arr1.length];
      int count=0;
      int ele=0;
      for(int i=0;i<arr1.length;i++){
        int curr = arr1[i];
        for(int j=0;j<arr2.length;j++){
            if(curr==arr2[j]){
                count++;
                arr3[ele]=curr;
                ele++;
            }
        }
      }
      System.out.println("Count of common elements is : " + count + " Common elements are : "); 

      for(int i=0;i<ele;i++){
        System.out.println(arr3[i] + " ");
      }
    }
}