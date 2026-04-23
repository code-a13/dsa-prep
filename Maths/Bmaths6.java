package Maths;
import java.util.Scanner;
public class Bmaths6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths6 obj = new Bmaths6();
        int result = obj.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
     public int factorial(int n) {
        if(n==0 || n==1){return 1;}
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
}
