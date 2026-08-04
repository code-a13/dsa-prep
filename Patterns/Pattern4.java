
import java.util.Scanner;
public class Pattern4 {
    public static void printPattern(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    // using if else statements
    public  static void printPattern4(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if (i >= j) {
                    System.out.print(i);
                }
                else {
                System.out.print(" ");
            }}
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        Pattern4.printPattern4(rows);
        sc.close();
    }
}
