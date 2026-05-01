package Recursion;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long N = sc.nextLong();
        System.out.print("The sum of first "+N+" numbers is: ");
        System.out.println(NnumbersSum(N));
        sc.close();
    }
    public static  long NnumbersSum(long N) {
        if(N==0){ return 0;}
        return N + NnumbersSum(N-1);
    }
}
