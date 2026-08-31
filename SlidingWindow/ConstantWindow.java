package SlidingWindow;

import java.util.Scanner;

public class ConstantWindow {
    public static int maxSum(int[] nums,int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <k; i++) {
            sum += nums[i];
        }
        int l = 0;
        int r = k;
        while (r<nums.length){
            sum += nums[r];
            sum -= nums[l];
            l++;
            r++;
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Elements :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Window Size :");
        int k = sc.nextInt();
        System.out.println(maxSum(nums,k));
        sc.close();
    }

}
