import java.util.*;
public class SmallestEle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{1,2,3},
        {4,15,6},
        {7,8,5}};
        int min_element = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min_element){
                    min_element=matrix[i][j];
                }
            }
        }
        System.out.println("Max element from that matrix is : " + min_element);

    }
}