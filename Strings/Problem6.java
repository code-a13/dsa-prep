import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second string: ");
        String goal = sc.nextLine();
        if(rotateString(s, goal)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
        sc.close();
    }
    public static boolean rotateString(String s, String goal) {
        
        if (s.length() != goal.length()) {
            return false; 
        }
     
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i); 
            if (rotated.equals(goal)) {
                return true;  
            }
        }
        return false;  
    }
}
