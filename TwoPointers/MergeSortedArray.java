import java.util.*;
public class MergeSortedArray{
    public static void main(String[]args){
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 ={2,5,6};
        int m =3;
        int n=3;
        int next_pos = m;
        int adding_element = 0;
        while(next_pos<m+n){
            nums1[next_pos]=nums2[adding_element];
            next_pos++;
            adding_element++;
        }
        int left = 0;
        int right= nums1.length-1;
        while(left<right){
            if(nums1[right]>nums1[left]){
                right--;
            }else{
                int temp = nums1[left];
                nums1[left]=nums1[right];
                nums1[right]=temp;

                left++;
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }
}