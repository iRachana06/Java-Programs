// Demonstarting LinekdList class of java.util package
// LinkedList acts as a dynamic array and the elements are linked using pointers and addresses
import java.util.*;
public class linkedListDemo {
    public static void main(String args[])
    {
        LinkedList<String> linkedlist = new LinkedList<String>(); // Creating an empty linked list

        linkedlist.add("India"); // Adding elements to the linked list
        linkedlist.add("USA");
        linkedlist.addLast("Australia"); // Adding element to the end the linked list
        linkedlist.addFirst("England"); // Adding elements to beginning of linked list
        linkedlist.add(2, "Japan"); //Adding elements at a particular index in the linked list

        System.out.println(linkedlist);

        linkedlist.remove("USA"); //Removing element "USA"
        linkedlist.remove(3); //Removing element at index 3
        linkedlist.removeFirst(); //Removing 1st Element
        linkedlist.removeLast(); //Removing Last element

        System.out.println(linkedlist); //Printing Linked List
    }
}