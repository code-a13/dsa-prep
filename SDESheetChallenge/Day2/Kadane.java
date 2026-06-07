package SDESheetChallenge.Day2;

import java.util.Scanner;

public class Kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        long maxi = Long.MIN_VALUE; 
        long sum = 0; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; 
            if (sum > maxi) {
                maxi = sum; 
            }
            if (sum < 0) {
                sum = 0; 
            }
        }
        System.out.println("The maximum subarray sum is: " + maxi);
        sc.close();
    }
}
