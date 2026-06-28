package Sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: "); 
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sortedNums = selectionSort(nums);
        System.out.println("Sorted elements: ");
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
    public  static int[] selectionSort(int[] nums) {
    int n = nums.length ;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }
      if (min != i) {
          int temp = nums[i];
          nums[i] = nums[min];
          nums[min] = temp;
        }
    }
    return nums;
  }
}
