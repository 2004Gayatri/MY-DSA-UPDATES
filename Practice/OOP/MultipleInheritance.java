import java.util.*;
public class MultipleInheritance{
    public static void main(String[]args){
      Beer b1 = new Beer();
      b1.eats();
      b1.eat();
    }
}
interface Herbivorous {
    void eats();
}
interface Carnivorous {
    void eat();
}
class Beer implements Herbivorous, Carnivorous{
    public  void eats(){
        System.out.println("Eats veg");
    }
     public  void eat(){
        System.out.println("Eats non-veg");
    }
}