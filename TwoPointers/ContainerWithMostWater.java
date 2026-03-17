import java.util.*;
public class ContainerWithMostWater{
    public static void main(String[]args){
        int [] heights = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = heights.length-1;
        int area =0;
        while(left<right){
            area= Math.max(area , Math.min(heights[left],heights[right]) * (right-left));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.print(area);
    }
}