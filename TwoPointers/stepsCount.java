import java.util.*;
public class stepsCount{
    public static void main(String[]args){
        int[] nums = {1,2,3,4,1,5,6};
        int current = 0;
        int step=0;
        for(int next=1;next<nums.length;next++){
            if(nums[next]!=nums[current]){
                step++;           
            }else{
                step=1;
            }
        }
        System.out.print(step);
    }
}