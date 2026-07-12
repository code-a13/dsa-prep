package Arrays;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = secondLargestElement(nums);
        System.out.println("The Second largest element in the array is: " + result);
        sc.close();
    }
    public static int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                smax = max;
                max = nums[i];
            }
            if(smax < nums[i] && max != nums[i]){
                smax = nums[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
}
