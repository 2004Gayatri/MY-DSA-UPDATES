import java.util.*;
public class leader{
    public static void main(String[]args){
         int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int[] leaders = new int[n];  
        int index = 0;

        int max_so_far = Integer.MIN_VALUE;

       
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max_so_far) {
                max_so_far = arr[i];
                leaders[index++] = arr[i];
            }
        }

        
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}