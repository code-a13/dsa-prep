

import java.util.Scanner;

public class Pattern10 {
    public static void PrintPattern(int n) {
        // Total rows are 2*n - 1. using 1-based index is easier to track.
        for(int i = 1; i <= 2 * n - 1; i++) {
            
            // default assumption: stars equal to row number (for first half)
            int stars = i;
            
            // if we crossed the peak (n), change the formula to reflect
            if(i > n) {
                stars = 2 * n - i;
            }
            
            // Single inner loop to print the calculated stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        PrintPattern(rows);
        sc.close();
    }
}
