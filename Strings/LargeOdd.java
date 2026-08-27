package Strings;

import java.util.Scanner;
public class LargeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Srting: ");
        String s = sc.nextLine();
        System.out.println(largeOddNum(s));
        sc.close();
    }
    public static  String largeOddNum(String s) {
        int j = -1;
        int n = s.length();
        
      
        for(int i = n - 1; i >= 0; i--) {
        
            if((s.charAt(i) - '0') % 2 != 0) {
                j = i;
                break;
            }
        }
        
        if(j == -1) { return ""; }
        
        int i = 0;
       
        while(i < n) {
            if(s.charAt(i) != '0') {
                break;
            }
            i++;
        }
        
        return s.substring(i, j + 1);
    }
}
