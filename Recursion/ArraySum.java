package Recursion;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        ArraySum p = new ArraySum();
        System.out.println("The sum of the array elements is: " + p.arraySum(nums));
        scanner.close();
    }
    public int arraySum(int[] nums) {
        return sum(nums, 0);
    }

    private int sum(int[] nums, int left) {
        if (left >= nums.length) {
            return 0;
        }
        
        return nums[left] + sum(nums, left + 1);
    }
}
