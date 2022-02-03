import java.util.*;
public class HashMapDemo{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Java");  //Put elements in Map
        map.put(2,"Javascript");
        map.put(3,"CSS");
        map.put(4,"Python");

        System.out.println("Key and Values in Hashmap are : ");
        for(Map.Entry element : map.entrySet()){ //Iterating through Hashmap
            System.out.println("Key: " +element.getKey()+" Value : "+element.getValue());
        }
        map.put(4,"Typescript"); // Duplicate Entry will overwrite value associated with Key 4
        System.out.println("New replaced element with Key 4: " +map.get(4));
        HashMap<Integer,String> map2=new HashMap<Integer,String>();//Creating HashMap
        map2.putAll(map); //Create a copy of existing HashMap
        System.out.println("New Hashmap created by putAll: "+map2);

        map.remove(4); //Remove element from Hashmap
        System.out.println("Updated list after removing element: "+map);

        map.replace(2,"SQL");
        map.replace(3, "CSS", "HTML");
        System.out.println("Updated list of replacing elements in Hashmap: "+map);
    }
}