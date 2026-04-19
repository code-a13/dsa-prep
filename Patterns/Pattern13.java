import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        Pattern13 p13 = new Pattern13();
        p13.pattern13(rows);
        sc.close();
    }
    public void pattern13(int n) {
        int print = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(print+" ");
                print++;
            }
            System.out.println();
        }
    }
}
