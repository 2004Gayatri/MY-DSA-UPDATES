public class Inheritance{
    public static void main(String[]args){
     dog d1 = new dog();
     d1.myName("Dogesh");
    }
}
// Base class or Parents class

class Animal{
    String name;
    String color;
    public void eat(){
        System.out.println("eats");
    }
    public void breath(){
        System.out.println("breaths");
    }
    public void myName (String name){
        System.out.println("My name is : " + name);
    }
}

// derived  class or child class
class dog extends Animal{
    void barks(){
        System.out.println("Barking");
    }
}