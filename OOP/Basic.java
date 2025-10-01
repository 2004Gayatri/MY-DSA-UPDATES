import java.util.*;
public class Basic{
    public static void main(String [] args){
     Pen p1 = new Pen(); // object p1 is created of class Pen
     p1.changeColor("green");
     System.out.println(p1.color);
    }
}
class Pen{
    String color ; // properties of the class
    int tip;

    void changeColor(String newColor){ // functions in the class 
        color= newColor;
    }

    void changeTip(int newTip){
        tip = newTip;
    }
    

}