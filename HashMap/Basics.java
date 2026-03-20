import java.util.*;
public class Basics{
    public static void main(String[]args){
        HashMap<String , Integer> mapname = new HashMap<>();
        //When we have to add value in hashmap
        mapname.put("Dattu",0);
        mapname.put("Gayatri",1);
        mapname.put("Sanap",2);
        mapname.put("Ishwar",3);
        mapname.put("Ashok",4);
        mapname.put("Laxmi",5);

        //when we have to find key is their or not (returns boolean value)
        System.out.println(mapname.containsKey("Sanap")); //return true

        //when we have to find value is their or not (returns boolean value)
        System.out.println(mapname.containsValue(10)); //return false

        //when we have to print all map
        System.out.print(mapname);

        //when we have to remove key from hashmap 
        mapname.remove("Sanap");

        //when we have to check ismap empty or not
        System.out.println(mapname.isEmpty()); //false

        //when we have to check the size of map
        System.out.println(mapname.size());

        Set<String> keys = mapname.keySet();

        for(String key : keys){
            System.out.println(key + " " + mapname.get(key));
        }
    }
}