import java.util.*;
public class ComplexPattern{
    public static void HollowRec(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
               if(i==1 || j==1 || j==col || i==row){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void InvertedPatterns(int row , int col){
      for(int i=1;i<=row;i++){
        for(int j=1;j<=row-i;j++){
           System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String[]args){
        //Hollow Rectangle Pattern
        int row=4;
        int col=5;
        // HollowRec(row,col);
        InvertedPatterns(row, col);
    }
}