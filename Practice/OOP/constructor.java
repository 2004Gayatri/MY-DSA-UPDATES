import java.util.*;
public class constructor{
    public static void main (String[]args){
       Pen p1 = new Pen();
       p1.color = "blue";
       p1.name = "jell pen";
       p1.marks[0]=100;
       p1.marks[1]=200;
       p1.marks[2]=300;
       Pen p2 = new Pen(p1); // copy constructor 
       for(int i=0;i<3;i++){
        System.out.println(p2.marks[i]);
       }
    }
}
class Pen{
    String name ;
    int price ;
    String color;
    int marks[];
    Pen(){ // default constructor
    marks = new int[3];
        System.out.println("default constructor is called during object creation ");
    }
    Pen(String name){ //parametrized constructor
   marks = new int[3];
        this.name = name ;
    }
    Pen(int price){ //parametrized constructor
     marks = new int[3];
        this.price = price;
    }
    Pen(Pen p1){ // shallow copy constructor
        this.color = p1.color;
        this.name = p1.name ;
        this.price = p1.price;
        this.marks = p1.marks;
    }
    // Pen(Pen p1){
    //     this.color=p1.color;
    //     this.name = p1.name ;
    //     this.price = p1.price;
    //     this.marks = new int[p1.marks.length];
    //    for(int i=0;i<marks.length;i++){
    //     this.marks[i] = p1.marks[i];
    //    }
    // }
}