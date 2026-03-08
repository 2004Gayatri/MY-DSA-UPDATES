import java.util.*;
public class day2{
     public static int removeElement(int[] nums, int val) {
       int i =0;
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=val){
            nums[i]=nums[j];
            i++;
        }
       }
       return i ; 
}
    public static void main(String[]args){
        int nums[] = {3,2,4,5,3,5,6,7,3};
        int val = 3;
        System.out.print("dfdf : " + removeElement(nums,val));
        
    }
}