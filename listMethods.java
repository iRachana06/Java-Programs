import java.util.ArrayList;
import java.util.List;
public class listMethods {
    public static void main(String args[]){
        List<String> countries=new ArrayList<String>(); //Creating a List
        countries.add("India");  //Adding elements in the List
        countries.add("USA");
        countries.add("England");
    // Get the element from the arraylist
        String str = countries.get(1);
        System.out.print("Country at index 1: " + str);
    // Changing an arraylist element
        countries.set(1,"Australia");
        System.out.print("Country at index 1: " + countries.get(1));
    // Removing an element from ArrayList
        countries.remove(2);
        System.out.println("Updated ArrayList: " + countries);
    // Adding new elements
        countries.add("USA");
        countries.add("England");
    //Size of an arraylist
        System.out.println("Size of ArrayList: " + countries.size());
    //Searching an element in ArrayList
        System.out.println("ArrayList has element USA " + countries.contains("USA"));
    }
}