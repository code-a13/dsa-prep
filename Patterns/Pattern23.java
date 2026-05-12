import java.util.Scanner;
public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern23(n);
        sc.close();
    }
    public static void pattern23(int n) {

        for(int i = 1 ;i<=n;i++){
            //spaces
            for(int j = 2;j<=i;j++){
                System.out.print(" ");
            }
            //hour glass top
            for(int j = i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 1;i<n;i++){
            //spaces
            for(int j = n-i-1 ;j>0;j--){
                System.out.print(" ");
            }
            //hour glass bottom 
            for(int j = n-i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}