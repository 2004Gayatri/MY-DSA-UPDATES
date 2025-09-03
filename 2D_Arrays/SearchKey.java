import java.util.*;
public class SearchKey{
    public static boolean SearchKeys(int[][]matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("Key is at position (" + i + " , " +j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{1,2,3},
        {4,5,6},
        {7,8,9}};
        System.out.println("Enter a key to search in a Matrix : ");
        int key = sc.nextInt();
        SearchKeys(matrix,key);
    }
}