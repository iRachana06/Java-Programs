import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String args[]){
            List<String> list=new ArrayList<String>(); //Creating a List
            list.add("India");  //Adding elements in the List
            list.add("USA");
            list.add("England");
            list.add("Australia");
            for(String countries:list) //Using for-each to iterate through the List
                System.out.println(countries);
        }
    }

