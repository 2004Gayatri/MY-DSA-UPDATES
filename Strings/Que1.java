import java.util.*;
public class Que1{
    public static void main (String[]args){
        // Count how many times lowercase vowels occurred in a String entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to calculate lowercase vowels in the string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count ++;
            }
        }
        System.out.println("In the string " + sb.toString() + "and count is :" + count);
    }
}