import java.util.*;
public class MethodOverLoading{
    public static void main(String[] args){
     calculator cal = new calculator();
     System.out.println(cal.sum(1,2));
      System.out.println(cal.sum(1.5,2.8));
       System.out.println(cal.sum(1,2.9999));
    }
}
class calculator{
    int sum(int a , int b){
        return a+b ;
    }
 double sum(double a , double b){
        return a+b ;
    }
    double sum(int a , double b){
        return a + b ;
    }
}