import java.util.*;
public class Hierarchical_Inheritance{
    public static void main(String[] args){
    developer d1 = new developer("Gayatri",1234,"Java");
    d1.showdev();
    Manager mg = new Manager("Vishwnath" , 54321,5);
    mg.showEmployee();
    }
}
class Employee{
    String name ;
    int ID;
    Employee(String name , int ID){
        this.name = name ;
        this.ID=ID;
    }
    void Display(){
        System.out.println("Employee name is : " + name);
        System.out.println("Employee ID is : " + ID);
    }

}
class developer extends Employee{
    String programming_language;
    developer(String name, int ID, String programming_language){
         super(name , ID);
        this.programming_language=programming_language;
    
    }
     void showdev(){
            Display();
            System.out.println("programming_language is " + programming_language);
        }
}

class Manager extends Employee{
    int team_size;
    Manager(String name, int ID, int team_size){
         super(name , ID);
        this.team_size = team_size;
       
    }
    void showEmployee(){
        Display();
        System.out.println("this Manager handels this team size : " + team_size);

    }
}