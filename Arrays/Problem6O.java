package Arrays;
import java.util.Scanner;
public class Problem6O{
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
    public static int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
