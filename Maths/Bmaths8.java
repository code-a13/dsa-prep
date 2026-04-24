package Maths;
import java.util.Scanner;
public class Bmaths8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPerfect(n)){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        sc.close();
    }
    public static boolean isPerfect(int n) {
        int total  = 0;
        int i = 1;
        while(i<n){
            if(n%i==0){
                total+=i;
            }
            i++;
        }
        if(total == n){
            return true;
        }
        else{
            return false;
        }
    }
}