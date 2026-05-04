import java.util.Arrays;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second string: ");
        String t = sc.nextLine();
        if(anagramStrings(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();

    }
    public static  boolean anagramStrings(String s, String t) {
        
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
