import java.util.*;
public class MoveZerostoEnd{
    public static void main(String[]args){
        int [] nums = {4,3,0,1,2,0,4,5,0};

        //Brute force approach time complexity = O(n) and spave complexity is O(n)
        // int j=0;
        // int [] nums2 = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         nums2[j]=nums[i];
        //         j++;
        //     }
        // }
        // for(int i=0;i<nums2.length;i++){
        //     System.out.print(nums2[i]+" ");
        // }

        // Optimal solution
        int slow =0;
        for(int current =0;current<nums.length;current++){
            if(nums[current]!=0){
                int temp=nums[current];
                nums[current]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}