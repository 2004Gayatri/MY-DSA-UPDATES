import java.util.*;
public class pr{
    public static void main(String[]args){
      int [] nums = {3,2,4};
      int target = 6;
      HashMap <Integer,Integer> map = new HashMap<>();
      HashSet <Integer> set = new HashSet<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for(int i=0;i<nums.length;i++){
        int complement = target-nums[i];
        if(map.containsKey(complement)){
                set.add(i);
        }
        map.put(nums[i],i);
      }
      System.out.print(set);
  }
}