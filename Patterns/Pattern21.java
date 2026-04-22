import java.util.Scanner;
public class Pattern21 {
    public void pattern21(int n) {
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // Check if it is  boundary
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();   
        Pattern21 pattern = new Pattern21();
        pattern.pattern21(n);
        sc.close();
    }
}
