package SDESheetChallenge.Day1;

import java.util.Scanner;

public class Permutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        nextPermutation(nums);
        
        System.out.println("The next permutation is:");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
        sc.close();
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind != -1) {
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(nums, i, ind);
                    break;
                }
            }
        }

        reverse(nums, ind + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}