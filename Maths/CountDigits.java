package Maths;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        CountDigits obj = new CountDigits();
        int result = obj.countDigit(n);
        System.out.println("Number of digits in " + n + " is: " + result);
        sc.close();
    }
    public int countDigit(int n) {
        int count = 0;
        if(n==0){
            return 1 ;
        }
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }
} 
