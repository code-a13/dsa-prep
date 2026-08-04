
import java.util.Scanner;
public class Pattern5 {
    public static void printPattern(int n) {

        for(int i = n;i>0;i--){
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //using if else block
    public static void printPattern5(int n) {

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j<n){
                    System.out.print("*");
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
        printPattern5(rows);
        sc.close();
    }
}
