import java.util.*;
public class rank{
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
         int n = sc.nextInt();
         int i =0;
         int Smallest_rank = arr[n-1] ;
         int Largest_rank = arr[arr.length-n];
         System.out.print(Smallest_rank  + "     " + Largest_rank );
    }
}
