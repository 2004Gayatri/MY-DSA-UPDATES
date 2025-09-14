// import java.util.*;
// public class Que2{
//     public static void main(String[]args){
//         String str = "abcaba";
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0;i<str.length();i++){
//             int curr = i;
//             for(int j=0;j<str.length();j++){
                
//                 if(str.charAt(j)==str.charAt(curr)){
//                     curr=Math.min(i,j);
//                 }
//             }
            
//             for(int j=0;j<=curr;j++){
//                 sb.append(str.charAt(i));
//             }
//             sb.append('-');
//         }
//          System.out.print(sb.toString());
//     }
   
// }
public class Que2 {
    public static void main(String[] args) {
        String str = "abcaba";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            int repeat = (ch - 'a') + 1;
            for(int j=0;j<repeat;j++){
                sb.append(str.charAt(i));
            }
            if(i<str.length()-1){
                sb.append('-');
            }
        }
        System.out.print(sb.toString());
    }
}
