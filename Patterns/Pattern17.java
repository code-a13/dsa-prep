import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Pattern17 pattern = new Pattern17();
        pattern.pattern17(n);
        sc.close();
    }
    public void pattern17(int n) {

        for(int i = 0;i<n;i++){
            for(int j = n-i-1;j>0;j--){
                System.out.print(" ");
            }
            char c = 'A';
            for(int j = 0;j<2*i +1;j++){
                System.out.print(c);
                if(j < i) {
                    c++;
                } else {
                    c--;
                }
            }
            System.out.println();
        }
    }
    
}
