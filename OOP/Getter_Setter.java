import java.util.*;
public class Getter_Setter{
    public static void main(String[]args){
        Person p1 = new Person();
    p1.setName("Madhuri");
    System.out.println(  p1.getName());
    }
}
class Person{
    private String Name ;

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }
}