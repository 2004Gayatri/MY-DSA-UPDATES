import java.util.*;
public class pr{
    public static void main(String[]args){
        int [] nums={2,2,1,1,1,2,2};
        int n = nums.length/2;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
           }else{
            map.put(nums[i],1);
           }
        }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                System.out.print(entry.getKey());
            }
        }
        
    }
}