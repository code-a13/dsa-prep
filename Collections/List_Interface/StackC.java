package Collections.List_Interface;
import java.util.*;
public class StackC {
    /**
     * Stack - LIFO (last in first out)
     */
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(13);//method used to add value in the stack
        stack.push(19);
        stack.push(17);
        stack.push(15);
        System.out.println(stack);
        stack.pop();//removes the last element 
        System.out.println(stack);
        System.out.println(stack.peek());//returns the last element
        System.out.println(stack.size());//returns length of the stack
        stack.add(18);//adds the element, as it implements the List Interface,List methods cann be used
        System.out.println(stack);
        System.out.println(stack.isEmpty());//Check for elements present in the stack or not
    }
}
