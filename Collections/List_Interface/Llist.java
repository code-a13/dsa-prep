package Collections.List_Interface;
import java.util.*;
public class Llist {
    /**
     * LinkedList is a class implementing the List Interface
     * ArrayList class allows to add data from the end
     * LinkedList allows to add from first and last */
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);//Adds element 
        list.add(13);//this method adds at the end 
        list.addFirst(19);//adds at the front
        list.addLast(17);//adds at the last 
        System.out.println(list);
        list.remove(0);//removes based on Index
        System.out.println(list);
        list.removeFirst();//removes the first element
        System.out.println(list);
        list.removeLast();//removes the last element
        System.out.println(list);
        System.out.println(list.size());// represent the length of list
        System.out.println(list.contains(13));//check for an element
    }
}
