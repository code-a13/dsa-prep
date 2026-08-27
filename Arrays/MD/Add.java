package Arrays.MD;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows :");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns :");
        int col = sc.nextInt();
        int[][] num1 = new int[row][col];
        int[][] num2 = new int[row][col];
        System.out.println("Enter Elements for First Matrix : ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                num1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements for Second Matrix : ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                num2[i][j] = sc.nextInt()+num1[i][j];
            }
        }

        System.out.println(Arrays.deepToString(num2));
    }
}
