package datastructure;
import java.util.Iterator;
import java.util.LinkedList; // linked list sınıfını import ettik tanımladık.


/**
 *
 * @author gamze
 */
public class DataStructure {
    public static void main(String[] args) {
        //LinkedList list = new LinkedList(); ///---> Non Generic Linked List Tanımlaması <---\\\
        //LinkedList <String> listString = new LinkedList<>(); ///---> Generic Linked List Tanımlaması
    LinkedList <String> linkedList = new LinkedList<>();
    linkedList.add("kitap");
    linkedList.add("müzik");
    linkedList.add("film");
    
    Iterator it = linkedList.iterator();
    while(it.hasNext()){ //method return boolean value, it return true when the have next element if its not return false
        System.out.print(it.next() + " "); // next() return next element in iteration.
    }
    
   }}
