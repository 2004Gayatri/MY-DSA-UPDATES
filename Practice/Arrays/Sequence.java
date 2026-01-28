import java.util.*;
public class Sequence{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of arr : ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        System.out.println("Enter number of element which you want to add : ");
        int M = sc.nextInt();
        System.out.print("Add these elements : ");
        for(int i=0;i<M;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=M;i<N;i++){
           arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


