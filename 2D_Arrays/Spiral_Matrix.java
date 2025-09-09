import java.util.*;
public class Spiral_Matrix{
    public static void main(String[]args){
        int [][] spiral_matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int start_row =0;
        int end_row = spiral_matrix.length-1;
        int start_col=0;
        int end_col = spiral_matrix[0].length-1;
        while(start_col<=end_col && start_row<=end_row){
            for(int j=start_col;j<=end_row;j++){
                System.out.print(spiral_matrix[start_row][j] + " ");
            }
            start_row++;
            for(int i=start_row;i<=end_row;i++){
                System.out.print(spiral_matrix[i][end_col] + " ");
            }
            end_col--;
             if (start_row <= end_row) {
                for (int j = end_col; j >= start_col; j--) {
                    System.out.print(spiral_matrix[end_row][j] + " ");
                }
                end_row--;
            }

            // Traverse from bottom to top if columns remain
            if (start_col <= end_col) {
                for (int i = end_row; i >= start_row; i--) {
                    System.out.print(spiral_matrix[i][start_col] + " ");
                }
                start_col++;
            }
            
        }
    }
}