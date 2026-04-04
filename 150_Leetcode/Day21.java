import java.util.*;
public class Day21{
    public static void main(String[]args){
        int [] nums = {3, 5, 2, 3, 4, 5, 3};
        int min_distance =Integer.MAX_VALUE;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               int distance = i - map.get(nums[i]);
               min_distance = Math.min(min_distance,distance);
            }
            map.put(nums[i],i);
        }
        System.out.print(min_distance);
    }
}