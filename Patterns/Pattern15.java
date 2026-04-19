import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();           
        Pattern15 p15 = new Pattern15();
        p15.pattern15(rows);
        sc.close();
    }
    public void pattern15(int n) {

        for(int i = n;i>0;i--){
            char c = 'A';
            for(int j = i;j>0;j--){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
