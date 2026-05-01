package Recursion;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        System.out.print("The factorial of "+N+" is: ");
        System.out.println(factorial(N));
        sc.close();
    }
    public static long factorial(int n) {
        //your code goes here
        if(n == 1 || n == 0){return 1;}
        return n*factorial(n-1);
    }
}
