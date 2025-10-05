import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows=3, col=4;
        int[][] matrix=new int[rows][col];
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter the data of matrix" );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe matrix is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
