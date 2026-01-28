class Student {
    // private data (cannot access directly from outside)
    private String name;
    private int age;

    // public setter methods to set values
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // public getter methods to get values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // set values using setters
        s.setName("Gayatri");
        s.setAge(21);

        // get values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
