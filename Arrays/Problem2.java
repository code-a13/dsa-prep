package Arrays;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = countOdd(arr, n);
        System.out.println("Count of odd elements in the array is: " + result);
        sc.close();

    }
    public static int countOdd(int[] arr, int n) {
       int count = 0;
       for(int i = 0 ;i<n;i++){
        if(arr[i]%2 !=0){
            count++;
        }
       }
       return count;
    }
}
