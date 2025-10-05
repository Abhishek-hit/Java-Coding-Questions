import java.util.Scanner;

public class sumoftwomatrix {
    public static void main(String[] args) {
        int rows=3, col=4;
        int[][] sum=new int[rows][col];
        int[][] matrix=new int[rows][col];
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter the data of matrix A" );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //matrix b
        int[][] matrixB=new int[rows][col];
        System.out.println ("enter the data of matrix B" );
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                matrixB[i][j]=sc.nextInt ();
            }
        }

        //sum of matrix
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
               sum[i][j]=matrix[i][j]+matrixB[i][j];
            }
        }
        //enter matrix
        System.out.println("\nThe matrix A is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
//        matrix B
        System.out.println("\nThe matrix B is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nThe matrix is sum :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
