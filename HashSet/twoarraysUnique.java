import java.util.*;
public class twoarraysUnique{
    public static void main(String[]args){
        int [] nums1 = {4,5,6};
        int [] nums2 = {1,2,3,4,5};
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        System.out.print(set2);
        
    }
}