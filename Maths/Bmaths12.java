package Maths;

import java.util.Scanner;

public class Bmaths12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        int lcm = LCM(n1, n2);
        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + lcm);
        sc.close(); 
    }
    public static int LCM(int n1, int n2) {
     
        int lcm;
       
        int n = Math.max(n1, n2);
        int i = 1;
        
        while (true) {
        
            int mul = n * i;
            
            if (mul % n1 == 0 && mul % n2 == 0) {
                lcm = mul;
                break;
            }
            i++;
        }
        
        return lcm;
    }
}
