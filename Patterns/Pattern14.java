import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        Pattern14 p14 = new Pattern14();
        p14.pattern14(rows);
        sc.close();
    }
    public void pattern14(int n) {
        
        for(int i = 0;i<n;i++){
            char  c = 'A';
            for(int j = 0 ;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
