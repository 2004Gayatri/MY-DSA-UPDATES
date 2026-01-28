import java.util.*;
public class Max_element{
    public static void main(String[]args){
        int[][] matrix = {
            {1, 2, 3, 4},
            {25, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Traverse the matrix to find the maximum element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Output the maximum element
        System.out.println("Maximum element in the matrix is: " + max);
    }
}