package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Problem6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = largestElement(nums);
        System.out.println("The largest element in the array is: " + result);
        sc.close();
    }
    public static  int largestElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
