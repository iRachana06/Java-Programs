// Demonstarting Methods in LinkedList class of java.util package
import java.util.*;
public class linkedListMethodsDemo {
    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<String>(); // Creating an empty linked list
        linkedlist.add("India"); // Adding elements to the linked list
        linkedlist.add("USA");
        linkedlist.addLast("Australia");
        System.out.println(linkedlist);

        //ListIterator: java iterator used to traverse all types of lists in Java-ArrayList, Vector, LinkedList, Stack
        ListIterator list_Iter = linkedlist.listIterator(1);  // Setting the ListIterator at a specified position
        System.out.println("The elements in list from index 1 is as follows:");
        while (list_Iter.hasNext()) {   //Iterating through the created list from the position
            System.out.println(list_Iter.next());
        }
        // peek() : method retrieves, without removing the first element of a list
        System.out.println("Head of the list is : " + linkedlist.peek());
        //peekFirst and peekLast methods also used to remove first and last element respectively

        //Offer -  This method adds the specified element as the tail / last element of a list
        linkedlist.offer("UK"); //offerFirst and offerLast methods also used

        String popELement = linkedlist.pop(); //Pop Method - to remove and return the top element from the Linked List
        System.out.println(popELement);
        linkedlist.push("Asia"); // Push Method - Adds element to head / starting of Linked List
        System.out.println(linkedlist);
    }
}