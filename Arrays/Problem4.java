package Arrays;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();           
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){ 
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        System.out.println("Reversed array is:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void reverse(int[] arr, int n) {
        int[] temp = new int[n];
        for(int i = 0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i = 0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
