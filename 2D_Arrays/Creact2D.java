import java.util.*;
public class Creact2D{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         int n = 3;
        int m = 3;
        int matrix[][]= new int[n][m];
        System.out.println("Enter a elements for a matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}