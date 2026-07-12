package Arrays;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        rotateArrayByOne(nums);
        System.out.println("Result :");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for(int i = 0;i<nums.length - 1 ;i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1]= temp;
    }
}
