import java.util.*;
public class KSizeWindow{
    public static void main(String[]args){
        int size =4;
        int [] nums = {1,2,1,3,4,2,3};
        int count =0;
        HashMap <Integer,Integer> map = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        int start =0;
        for(int end =0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while((end-start+1)==size){
               System.out.print(map.size() + " ");
               map.put(nums[start],map.get(nums[start])-1);
               if(map.get(nums[start])==0){
                map.remove(nums[start]);
               }
               start++;
            }
        }
    }
}