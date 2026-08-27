package Arrays.MD;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix 1 row :");
        int r1 = sc.nextInt();
        System.out.println("Enter Matrix 1 col :");
        int c1 = sc.nextInt();

        System.out.println("Enter Matrix 2 row :");
        int r2 = sc.nextInt();
        System.out.println("Enter Matrix 2 col :");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Error: Matrix 1 columns (" + c1 + ") must equal Matrix 2 rows (" + r2 + ").");
            sc.close();
            return;
        }

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] ans = new int[r1][c2];

        System.out.println("Enter Elements for First Matrix : ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements for Second Matrix : ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("--------------------------------");

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(ans));
        sc.close();
    }
}