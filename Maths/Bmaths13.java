package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class Bmaths13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();   
        int[] divs = divisors(n);
        System.out.println("The divisors of " + n + " are: " + Arrays.toString(divs));
        sc.close();
    }
    public static int[] divisors(int n) {
        
        int[] temp = new int[n];
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
         
            if (n % i == 0) {
              
                temp[count++] = i;
            }
        }
        
        int[] ans = Arrays.copyOf(temp, count);
        
        return ans;
    }
}
