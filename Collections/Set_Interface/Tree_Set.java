package Collections.Set_Interface;
import java.util.*;
public class Tree_Set {
    //TreeSet does all the function like HashSet and guarantees sorted order
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(13);//adds Element
        ts.add(19);
        ts.add(19);//doesnot allow duplicates
        System.out.println(ts);
        ts.remove(19);//removing an element
        System.out.println(ts);
        ts.add(6);
        ts.add(4);
        for(Integer t : ts){
            System.out.println(t);
        }
        System.out.println(ts.floor(7));//returns the next lesser element <=7 
        System.out.println(ts.ceiling(7));//returns the next greater element >=7
    }
}
