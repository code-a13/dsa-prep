package Patterns;
import java.util.Scanner;
public class Pattern9 {
    public static void printPattern(int n) {
        
        for(int i = 0;i<n;i++){

            //spaces
            for(int j=n-i -1;j>0;j--){
                System.out.print(" ");
            }
            //stars
            for(int j = 0;j<2*i +1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 2*n -1-2*i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        printPattern(rows);
        sc.close();
    }
}
