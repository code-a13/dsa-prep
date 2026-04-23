package Maths;

import java.util.Scanner;

public class Bmaths5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths5 obj = new Bmaths5();
        int result = obj.largestDigit(n);
        System.out.println("Largest digit in " + n + " is: " + result);
        sc.close();
    }
    public int largestDigit(int n) {
        int max = 0;
        while(n>0){
            if(max<(n%10)){
                max = (n%10);
            }
            n /= 10;
        }
        return max;
        
    }
}
