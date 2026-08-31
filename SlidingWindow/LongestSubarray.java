package SlidingWindow;

import java.util.Scanner;

public class LongestSubarray {
    public  int brute(int nums[],int k){
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i;j<nums.length;j++){
                sum += nums[j];
                if(sum<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
                else {
                    break;
                }
            }

        }
        return maxLen;
    }
    public  int better(int nums[],int k){
        int maxLen = 0;
        int l = 0 , r = 0;
        int sum = 0;

        while(r<nums.length){
            sum += nums[r];
            while(sum>k){
                sum -=nums[l];
                l++;
            }
            if(sum<=k){
                maxLen = Math.max(maxLen,r-l+1);
                r++;
            }
        }
        return maxLen;
    }
    public  int optimal(int nums[],int k){
        int maxLen = 0;
        int l = 0 , r = 0;
        int sum = 0;

        while(r<nums.length){
            sum += nums[r];
            while(sum>k){
                sum -=nums[l];
                l++;
            }
            if(sum<=k){
                maxLen = Math.max(maxLen,r-l+1);
                r++;
            }
        }
        return maxLen;
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
        System.out.println("Enter the Sum :");
        int k = sc.nextInt();
        LongestSubarray ls = new LongestSubarray();
        System.out.println(ls.brute(nums,k));
        System.out.println(ls.better(nums,k));
        System.out.println(ls.optimal(nums,k));
        sc.close();
    }
}
