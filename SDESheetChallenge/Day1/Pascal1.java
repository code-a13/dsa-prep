package SDESheetChallenge.Day1;

import java.util.Scanner;

public class Pascal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int r = sc.nextInt();
        System.out.println("Enter the column number:");
        int c = sc.nextInt();
        int n = r - 1; 
        int k = c - 1; 
        
        long res = 1; 
       
        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        System.out.println("The element at row " + r + " and column " + c + " in Pascal's Triangle is: " + res);
        sc.close();
    }
}
