import java.util.*;
public class Abstarction{
    public static void main(String[]args){
       Horse h1 = new Horse();
       h1.walks();
       h1.eat();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats ");
    }
    abstract void walks();
}
class Horse extends Animal{
    void walks(){
       System.out.println("walks on 2 legs");
    }
}