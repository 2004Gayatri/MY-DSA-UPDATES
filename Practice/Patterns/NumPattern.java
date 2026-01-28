import java.util.*;
public class NumPattern{
    public static void main(String[]args){
     int n=7;
     //1st number Pattern 
     for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    //2nd number pattern 
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println();
    //Inverted Half pyramid 
    int row = 5 ;
    int col =5;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=row-i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
}
}