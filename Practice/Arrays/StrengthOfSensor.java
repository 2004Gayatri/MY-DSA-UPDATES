import java.util.*;
public class StrengthOfSensor{
    public static void IsValidId(int[]arr,int N){
        for(int i=0;i<N-3;i++){
            if(arr[i]+arr[i+1]+arr[i+2]==arr[i+3]){
                System.out.print("Yess it is valid");
            }else{
                System.out.print("No it is not valid");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of an ID : ");
        int N = sc.nextInt();
        System.out.print("Enter a id : ");
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
        }
        IsValidId(arr,N);
    }
}