import java.util.Scanner;

public class Pattern20 {
    public void pattern20(int n) {

        for(int i = 0;i<n;i++){

            for(int j = 0 ;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*n-2 -2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<n-1;i++){

            for(int j = 1 ;j<n-i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*i+2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();   
        Pattern20 pattern = new Pattern20();
        pattern.pattern20(n);
        sc.close();
    }
}
