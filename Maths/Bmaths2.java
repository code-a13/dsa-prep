package Maths;
import java.util.Scanner;

public class Bmaths2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths2 obj = new Bmaths2();
        int result = obj.countOddDigit(n);
        System.out.println("Number of odd digits in " + n + " is: " + result);
        sc.close();
    }
    public int countOddDigit(int n) {
        int count = 0;
        if(n==0){return 0;}
        while(n>0){
            
            if((n%10)%2 !=0){
                count++;
            }
            n /=10;
        }
        return count;
    }
}