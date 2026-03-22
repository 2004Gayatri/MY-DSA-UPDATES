import java.util.*;
public class Tickets{
    public static String aaa(HashMap <String,String> map){
        HashMap<String,String> revmap = new HashMap<>();
        for(String key : map.keySet()){
            revmap.put(map.get(key),key);
        }
        for(String key : map.keySet()){
            if(!revmap.containsKey(key)){
                return key; // starting point that we are finding i like this question the most  
            }
        }
        return null;
    }
    public static void main(String[]args){
        String [] start_tickets = {"chennai", "mumbai","goa","delhi"};
        String [] end_destination = {"bengaluru","delhi","chennai","goa"};
        HashMap <String,String> map = new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");
        String starting_point = aaa(map);
        System.out.print(starting_point);
        for(String key : map.keySet()){
            System.out.print(" -> " + map.get(starting_point));
            starting_point = map.get(starting_point);
        }
        System.out.println();
    }
}