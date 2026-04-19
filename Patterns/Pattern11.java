
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        pattern11(rows);
        sc.close();
    }
    public static void pattern11(int n) {

        for(int i = 1;i<=n;i++){
            int start = 1;
            if(i%2==0){
                start = 0;
            }
            for(int j = 1;j<=i;j++){
                System.out.print(start+" ");
                start = 1 -start;
            }
            System.out.println();
        }
    }
}
