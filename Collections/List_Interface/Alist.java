package Collections.List_Interface;
import java.util.*;
public class Alist{
    public static void main(String[] args) {
        //ArrayList and its Methods 
        //List is an Interface and ArrayList is a Class implementing it 
        ArrayList<Integer> alist = new ArrayList<>();
        System.out.println(alist.size()); //0
        alist.add(13); // Add an ELement
        alist.add(19);
        alist.add(2,17); // Adding based on Index
        System.out.println(alist); // [13,19,17]
        System.out.println(alist.size());//3 size of the arraylist
        System.out.println(alist.get(0)); // 13 access an element with index 
        System.out.println(alist.remove(2)); // 17 remove an element with index
        System.out.println(alist); // [13,19]
        System.out.println(alist.contains(13)); // true contains to check for an element
        System.out.println(alist.contains(17)); // false 
        alist.clear(); // Clears everything
        System.out.println(alist);

    }
}