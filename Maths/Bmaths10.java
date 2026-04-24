package Maths;

import java.util.Scanner;

public class Bmaths10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int primeCount = primeUptoN(n);
        System.out.println("Number of prime numbers up to " + n + " is: " + primeCount);
        sc.close();
    }
    public static int primeUptoN(int n) {
        int prime = 0;
        int num = 2;
        
        while (num <= n) {
            int count = 0;
            int i = 1;
            
            while (i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }
            
            if (count == 2) {
                prime++;
            }
            
            num++;
        }
        
        return prime;
    }
}
