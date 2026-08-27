package Strings;

import java.util.Scanner;
public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second string: ");
        String t = sc.nextLine();
        if(isomorphicString(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }   
        sc.close();
    }
    public static  boolean isomorphicString(String s, String t) {
        
        int[] m1 = new int[256], m2 = new int[256];
        
        int n = s.length();
        
        for (int i = 0; i < n; ++i) {
    
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        
        return true;
    }
}