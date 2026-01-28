import java.util.*;
public class ShortestPath{
    public static void shortestpathh( String str){
        int x1=0;
        int y1 =0;
        int x2=0;
        int y2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x2--;
            }
            if(str.charAt(i)=='N'){
                y2++;
            }
            if(str.charAt(i)=='E'){
                x2++;
            }
            if(str.charAt(i)=='S'){
                y2--;
            }
        }
        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Shortest path is : " + distance);
    }
    public static void main(String[]args){
        String str = "WNEENESENNN";
        shortestpathh(str);
    }
}