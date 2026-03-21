import java.util.*;
public class CountDistinct{
    public static void main(String[]args){
        int [] nums={1,2,3,4,2,1,3,5};
        //method 1 
        // HashSet <Number> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // System.out.print("Distince elements are : " + set.size());

        //Method 2 
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count =0;
        for(Integer numbers : map.keySet()){
            if(map.get(numbers)==1){
               count++;
            }
        }
        System.out.print("Distince elements are : " + map.size());
    }
}