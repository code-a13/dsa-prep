package Maths;

import java.util.Scanner;

public class Bmaths9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
    public static boolean isPrime(int n) {
        int count = 0;
        int i = 1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
