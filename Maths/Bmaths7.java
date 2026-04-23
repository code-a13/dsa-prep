package Maths;
import java.util.Scanner;
public class Bmaths7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Bmaths7 obj = new Bmaths7();
        boolean result = obj.isArmstrong(n);
        if(result){
            System.out.println(n + " is an Armstrong number.");
        }
        else{
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
    }
    public boolean isArmstrong(int n) {
        int temp = n;
        int isA = n;
        int nod = 0;
        int total = 0;
        //No.of Digits
        while(n>0){
            n /= 10;
            nod++;
        }
        while(isA>0){
            total += Math.pow((isA%10),nod);
            isA /=10;
        }
        if(total == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
