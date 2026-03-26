import java.util.*;
public class DuplicateContains{
    public static boolean IsTrueOrFalse(int nums[],int k, HashMap <Integer,Integer> map){
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int condition = i - map.get(nums[i]);
                if(condition<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[]args){
        int nums[]={1,2,3,1};
        int k =3;
        HashMap <Integer,Integer> map = new HashMap<>();
        System.out.print(IsTrueOrFalse(nums,k,map));
    }
}