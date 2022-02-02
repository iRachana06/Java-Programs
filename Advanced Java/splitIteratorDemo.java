import java.util.*;
public class splitIteratorDemo {
    //SplitIterator provides support for parallel processing of stream of elements for any collection
    public static void main(String args[]) throws IllegalStateException {

        ArrayList<String> alist = new ArrayList<>(); // Creating an empty linked list
        alist.add("India"); // Adding elements to an Arraylist
        alist.add("Nepal");
        alist.add("China");
        alist.add("USA");
        alist.add("Canada");
        alist.add("Australia");
        Spliterator<String> spliterator1 = alist.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        //Spliterator instance is obtained using the spliterator() method. Then trySplit() method is applied
        //trySplit method splits it into two parts
        System.out.println("Estimated Number of Elements : " +spliterator1.estimateSize());
        //estimatedSize method gives us an estimated number of elements

        System.out.println("----Split Iterator 1----");
        spliterator1.forEachRemaining(System.out::println);

        System.out.println("----Split Iterator 2----");
        spliterator2.forEachRemaining(System.out::println);
    }
}