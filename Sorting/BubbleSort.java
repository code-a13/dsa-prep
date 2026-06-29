package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: "); 
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sortedNums = bubbleSort(nums);
        System.out.println("Sorted elements: ");
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
