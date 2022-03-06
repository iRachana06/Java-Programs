// Demonstrating Methods in LinkedList class of java.util package
import java.util.*;
public class linkedListMethodsDemo {
    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<String>();// Creating an empty linked list
        linkedlist.add("India");// Adding elements to the linked list
        linkedlist.add("USA");
        linkedlist.addLast("Australia");
        System.out.println(linkedlist);
        ListIterator list_Iter = linkedlist.listIterator(1);
        //ListIterator: java iterator used to traverse all types of lists in Java-ArrayList, Vector, LinkedList, Stack
        while (list_Iter.hasNext()) {
            System.out.println(list_Iter.next());
            //Iterating through the created list from the specified position 1
        }
        System.out.println("Head of the list is : " + linkedlist.peek());
        // peek() : method retrieves, without removing the first element of a list
        //peekFirst and peekLast methods also used to remove first and last element respectively
        linkedlist.offer("UK");
        //Offer method adds the specified element as the tail / last element of a list
        String popELement = linkedlist.pop();
        //Pop Method - to remove and return the top element from the Linked List
        System.out.println("Element removed: "+popELement);
        linkedlist.push("Asia");// Push Method - Adds element to head / starting of Linked List
        System.out.println("Final Linked List: "+linkedlist);
    }
}
