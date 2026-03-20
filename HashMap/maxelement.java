import java.util.*;
// Here i am trign to find a number which occured 3 and more than three times
public class maxelement{
    public static void main(String[]args){
        int nums[]={1,2,3,1,2,1,5,1,5,5};
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],1)+1);
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i],map.get(nums[i]+1));
            // }else{
            //     map.put(nums[i],map.get(nums[i]));
            // }
        }
        Set<Integer> key = map.keySet();
        for(Integer k : key){
            if(map.get(k)>(nums.length/3)){
                System.out.println(k);
            }
        }
    }
}