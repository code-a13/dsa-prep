import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();    
        Pattern16 p16 = new Pattern16();
        p16.pattern16(rows);    
        sc.close();
    }
    public void pattern16(int n) {
        char c = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
