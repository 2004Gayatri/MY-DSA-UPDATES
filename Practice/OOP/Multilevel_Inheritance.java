import java.util.*;
public class Multilevel_Inheritance{
 public static void main(String[]args){
    Car c1 = new Car();
 }
}
 class Vehical{
    Vehical(){
        System.out.println("This is vehical");
    }
}
class Four_wheeler extends Vehical{
    Four_wheeler(){
        System.out.println("This vehical have 4 wheels");
    }
}
class Car extends Four_wheeler{
    Car(){
        System.out.println("This have 4 wheels means it is a Car ! ");
    }
}