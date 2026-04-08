import java.util.*;
public class repeatfirst{
    public static void main(String[]args){
        int nums[]={2, 5, 3, 5, 1, 2};
        HashMap <Integer,Integer> map = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans = Math.min(ans,i);

            }
            map.put(nums[i],i);
        }
       if(ans==Integer.MAX_VALUE){
        System.out.print("0");
       }else{
         System.out.print(nums[ans]);
       }
    }
}