package Maths;
import java.util.Scanner;
public class Bmaths4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths4 obj = new Bmaths4();
        boolean result = obj.isPalindrome(n);
        if(result){
            System.out.println(n + " is a palindrome number.");
        }
        else{
            System.out.println(n + " is not a palindrome number.");
        }
        sc.close();
    }
    public boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(n>0){
            rev = (rev*10)+(n%10);
            n /= 10;
        }
        if(rev == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
