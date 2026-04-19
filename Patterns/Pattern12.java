import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        Pattern12 p12 = new Pattern12();
        p12.pattern12(rows);
        sc.close();
    }
    public void pattern12(int n) {
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=2*n;j++){
                if(j <= i) {
                    System.out.print(j);
                } 
                // Right side numbers
                else if (j > 2 * n - i) {
                    // This formula reverses the number based on column index
                    System.out.print(2 * n - j + 1); 
                } 
                // Middle spaces
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
