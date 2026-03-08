import java.util.*;
public class moveszero{
    public int MaxElement(int [] nums ){
      int max_ele = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max_ele){
            max_ele = nums[i];
        }
      }
      return max_ele;
    }
  public static void main (String[]args){
    int nums[] = {5,9,0,5,3,0,7,0,2,2,1};
    System.out.print("Maximun element is : " + MaxElement(nums[]));
  }
}