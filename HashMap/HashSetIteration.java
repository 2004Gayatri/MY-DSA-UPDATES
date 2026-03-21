import java.util.*;
public class HashSetIteration{
    public static void main(String[]args){

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // 1st method of iteration in HashSet
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        HashSet <String> set2 = new HashSet<>();
        set2.add("Gayatri");
         set2.add("Ashok");
         set2.add("Ishwar");
         set2.add("Laxmi");

        //2nd method of iteration is 
        for(String name : set2){
            System.out.println(name);
        }
        

    }
}