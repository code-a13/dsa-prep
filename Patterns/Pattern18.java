import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Pattern18 pattern = new Pattern18();
        pattern.pattern18(n);
        sc.close();
    }
    public void pattern18(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for(char ch = (char)(('A'+ n-1)-i); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
