package Maths;

import java.util.Scanner;

public class Bmaths11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        int gcd = GCD(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
        sc.close();
    }
     public static int GCD(int n1, int n2) {
        
        int gcd = 1;
        
        for(int i = 1; i <= Math.min(n1, n2); i++) {
           
            if(n1 % i == 0 && n2 % i == 0) {
                
                gcd = i;
            }
        }
        
        return gcd;
    }
}
