package Arrays;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = arraySortedOrNot(arr, n);
        if(result){
            System.out.println("The array is sorted in non-decreasing order.");
        }else{
            System.out.println("The array is not sorted in non-decreasing order.");
        }
        sc.close();

    }
    static boolean arraySortedOrNot(int[] arr, int n) {
       boolean ans = true;
       for(int i = 1;i<n;i++){
        if(arr[i-1]>arr[i]){
            ans = false;
        }
       }
       return ans;
    }
}
