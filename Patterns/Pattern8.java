
import java.util.Scanner;
public class Pattern8 {
    public static void printPattern(int n) {

        for(int i = 0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
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
