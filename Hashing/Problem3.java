package Hashing;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = sumHighestAndLowestFrequency(nums);
        System.out.println("The sum of the highest and lowest frequency is: " + result);
        sc.close();
        
    }
    public static int sumHighestAndLowestFrequency(int[] nums) {
        
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        int hash[] = new int[max + 1];
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        int maxf = 0; 
        for(int i = 0; i < hash.length; i++){
            if(hash[i] > maxf){
                maxf = hash[i];
            }
        }

        int minFreq = Integer.MAX_VALUE;
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] > 0 && hash[i] < minFreq) {
                minFreq = hash[i];
            }
        }

        return maxf + minFreq;
    }
}
