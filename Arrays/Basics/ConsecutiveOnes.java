package Arrays.Basics;

import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1's in the array is: " + result);
        sc.close();
    }
    public static int findMaxConsecutiveOnes(int[] nums) {  
        int max = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
            }
            else{
                max = 0;
            }

            if(count<max){
                count = max;
            }
            
        }
        return count;
    }
}
