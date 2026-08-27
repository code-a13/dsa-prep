package Strings;

import java.util.Arrays;
import java.util.Scanner;
public class CommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] str = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(str));
        sc.close();
    }
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        
        Arrays.sort(str);
        
        int n = str.length;
        String front = str[0];
        String back = str[n - 1];
        
        int i = 0;
    
        int minLength = Math.min(front.length(), back.length());
        
        while (i < minLength) {
           
            if (front.charAt(i) != back.charAt(i)) {
                break;
            }
            i++;
        }
 
        return front.substring(0, i);
    }
}
