import java.util.*;
public class topfrequent{
    public static void main(String[]args){
        int nums[] = {1,1,1,2,2,3};
        int k=2;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
       Integer[] arr = map.keySet().toArray(new Integer[0]);
       Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));
       for(int i=0;i<k;i++){
        System.out.print(arr[i] + " ");
       }
    }
}