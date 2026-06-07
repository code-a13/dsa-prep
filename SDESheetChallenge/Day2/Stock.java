package SDESheetChallenge.Day2;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr == null || n < 2) {
            System.out.println("Invalid input. Please provide at least two elements.");
            sc.close();
            return;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;                
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i]; 
            } else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice; 
            }
        }
        System.out.println("The maximum profit is: " + maxProfit);
        sc.close();
    }
}
