package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: "); 
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] sortedNums = insertionSort(nums);
        System.out.println("Sorted elements: ");
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    //Insertion Sort  takes an element and places it in the correct position
    public  static int[] insertionSort(int[] nums) {

        for(int i = 1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j + 1]=key;
        }
        return nums;
    }
}
