package Collections.Set_Interface;
import java.util.*;
public class Hash_set {
    /**
     * HashSet is the Class implementing the set Interface
     * Stores Element without duplicates and does not guarantee the data to be in sorted order
     */ 
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(13);//adds Element
        hs.add(19);
        hs.add(19);//doesnot allow duplicates
        System.out.println(hs);
        hs.remove(19);//removing an element
        System.out.println(hs);
        hs.add(6);
        hs.add(4);
        for(Integer h : hs){
            System.out.println(h);
        }
    }
}
