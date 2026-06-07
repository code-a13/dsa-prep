package SDESheetChallenge.Day1;

import java.util.Scanner;

public class SetMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        int[] row = new int[m];
        int[] cols = new int[n];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(row[i]==1||cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println("The matrix after setting zeroes:");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
