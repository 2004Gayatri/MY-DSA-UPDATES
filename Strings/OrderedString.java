import java.util.*;
public class OrderedString{
    public static void main(String[]args){
        String str = "ababcabc";
        char [] arr1 = str.toCharArray();
        int length=0 ;
        int max_length = 0 ;
        for(int i=0;i<arr1.length;i++){
            length=1 ;
            int curr = arr1[i];
            for(int j=i;j<arr1.length-1;j++){
                if( arr1[j+1]== arr1[j]+1){
                    length++;
                }else{
                    break;
                }
            }

           max_length= Math.max(length,max_length);
        }
        System.out.println(max_length);
    }
}