package Collections.Queue_Interface;
import java.util.*;
public class Array_Deque{
    public static void main(String[] args) {
        // FIFO 
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(13); // Add a element to it 
        ad.offer(15);
        ad.offer(17);
        System.out.println(ad);
        System.out.println(ad.peek());//Returns the First element (FIFO)
        ad.poll();//removes the first element
        System.out.println(ad);
        ad.offerFirst(13);// can add at the front and end because it implements the deque 
        System.out.println(ad);
    }
}