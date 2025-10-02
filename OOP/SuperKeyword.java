import java.util.*;
public class SuperKeyword{
    public static void main(String[]args){
         child ch = new child();
         ch.show();
    }
}
class Person{
    String name= "Parents class" ;

}
class child extends Person{
    String name = "child class";
    void show(){
        System.out.println("which class (guessing as child ) " +name);
        System.out.println("which class (guessing as Parents ) " +super.name);

    }
}
