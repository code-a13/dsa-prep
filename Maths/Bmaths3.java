package Maths;

import java.util.Scanner;

public class Bmaths3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths3 obj = new Bmaths3();
        int result = obj.reverseNumber(n);
        System.out.println("Reverse of " + n + " is: " + result);
        sc.close();
    }
    public int reverseNumber(int n) {
        int rev = 0;
        while(n>0){
            rev = (rev*10)+ (n%10);
            n /= 10 ;
        }
        return rev;
    }
}
