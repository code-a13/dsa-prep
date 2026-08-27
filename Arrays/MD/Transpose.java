package Arrays.MD;


import java.util.Scanner;

public class Transpose {
    public static  int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(n!=m){
            int t =m;
            m = n;
            n = t;
        }
        int[][] result = new int[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                result[i][j]= matrix[j][i];
            }
        }
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int r = sc.nextInt();
        System.out.println("Enter no of columns :");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter Elements : ");
        for (int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        transpose(matrix);
    }
}
