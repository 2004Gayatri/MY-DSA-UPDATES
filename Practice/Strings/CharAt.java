import java.util.*;
public class CharAt{
    public static void Printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to perform some char At operations like taking character based on the index of that string : ");
        String str = sc.nextLine();
        Printletters(str);
    }
}