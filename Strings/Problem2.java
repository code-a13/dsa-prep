
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        if(palindromeCheck(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
    public static boolean palindromeCheck(String s) {
        int n = s.length();
        
        for(int i = 0; i < n / 2; i++) {
            
            if(s.charAt(i) != s.charAt(n - i - 1)) {
                return false; 
            }
        }
        return true; 
    }
}
