import java.util.Scanner;

public class Pattern1{

    public static void printpattern(int n) {
        //Outer Loop is for rows and inner loop is for columns
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        printpattern(rows);
        sc.close();
    }
}
