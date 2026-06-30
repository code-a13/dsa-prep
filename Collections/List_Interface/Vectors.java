package Collections.List_Interface;

import java.util.Vector;

public class Vectors {
    /**
     * Vector is a legacy, thread-safe dynamic array.
     * Every method inside it is synchronized.
     */
    public static void main(String[] args) {
        
        // We MUST use 'Vector' as the reference type here instead of 'List'
        // because we want to access the vector-specific capacity() method.
        Vector<Integer> vector = new Vector<>();
        
        // Adding elements into the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        // size() -> Returns the actual number of elements currently stored.
        // Intha case-la, athu 3.
        System.out.println("Actual elements inside (Size): " + vector.size()); 
        
        // capacity() -> Returns the total allocated memory slots.
        // Default capacity of Vector is 10. Athu full aana thaan 20 aagum (100% growth).
        System.out.println("Total memory allocated (Capacity): " + vector.capacity());
    }
}