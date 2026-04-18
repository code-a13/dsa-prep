package Patterns;
import java.util.Scanner;
public class Pattern6 {
    public static void printPattern(int n) {

        for(int i = 0;i<n;i++){
            for(int j = 1;j<= n-i;j++){
                System.out.print(j);
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
