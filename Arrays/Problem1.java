package Arrays;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = sum(arr, n);
        System.out.println("Sum of the array elements is: " + result);
        sc.close();
    }
    public static  int sum(int arr[], int n) {
      int sum = 0;
      for(int i = 0;i<n;i++){
        sum += arr[i];
      }
      return sum;
    }
}
