import java.util.Scanner;
public class Pattern19 {
    public void pattern19(int n) {
     
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                
                if (i < n) {
                    
                    if (j < n - i || j >= n + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } 
                else {
                    
                    int lowerI = i - n; 
                    
                    if (j <= lowerI || j >= (2 * n - 1 - lowerI)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        Pattern19 pattern = new Pattern19();
        pattern.pattern19(n);
        sc.close(); 
    }
}
