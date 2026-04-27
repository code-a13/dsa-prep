package Hashing;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The second most frequent element in the array is: ");
        System.out.println(secondMostFrequentElement(nums));
        sc.close();
    }
    public static int secondMostFrequentElement(int[] nums) {
     
    int max = nums[0];
    for(int i = 1 ;i<nums.length;i++){
        if(nums[i]>max){
            max = nums[i];
        }
     }

    int hash[]= new int[max+1];

    for(int i = 0;i<nums.length;i++){
        hash[nums[i]]++;

    }
   int maxFreq = 0;
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] > maxFreq) {
                maxFreq = hash[i];
            }
        }

        int secMaxFreq = 0;
        int ans = -1; 

        for(int i = 0; i < hash.length; i++) {
           
            if(hash[i] > secMaxFreq && hash[i] < maxFreq) {
                secMaxFreq = hash[i];
                ans = i; 
            }
        }

        return ans;

    }
}
