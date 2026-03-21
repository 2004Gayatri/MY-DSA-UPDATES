import java.util.*;
public class ContainsDuplicate{
    public static boolean isDuplicate(int [] nums){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            for(Integer num : map.keySet()){
                if(map.get(num)>1){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[]args){
        
            int nums[] = {1,2,3,4};
            System.out.print(isDuplicate(nums));
        }
    
}