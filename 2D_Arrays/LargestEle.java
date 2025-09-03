import java.util.*;
public class LargestEle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{1,2,3},
        {4,15,6},
        {7,8,9}};
        int max_element = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max_element){
                    max_element=matrix[i][j];
                }
            }
        }
        System.out.println("Max element from that matrix is : " + max_element);

    }
}