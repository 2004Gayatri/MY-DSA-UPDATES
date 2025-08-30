import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr1 = {7,5,6,4,3,2,1};
        
        // Find the largest element
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > largest) largest = arr1[i];
        }

        // Create count array
        int[] count = new int[largest + 1];

        // Store frequency
        for(int i=0; i<arr1.length; i++){
            count[arr1[i]]++;
        }

        // Reconstruct sorted array
        int index = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr1[index] = i;
                index++;
                count[i]--;
            }
        }

        // Print sorted array
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
