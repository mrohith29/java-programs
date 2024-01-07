import java.util.Scanner;
public class matrixMultiplication extends Thread{
    int[][] mat1;
    int[][] mat2;
    int[][] mat3;
    static int row1, row2, col1, col2;
    int row, col;

    matrixMultiplication(int[][] A, int[][] B, int[][] C, int i, int j) {
        this.mat1 = A;
        this.mat2 = B;
        this.mat3 = C;
        row = i;
        col = j;
    }

    public void run() {
        for (int k = 0; k < row2; k++) {
            mat3[row][col] += mat1[row][k] * mat2[k][col];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows, columns of the FIRST matrix ");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.print("Enter the number of rows, columns of the SECOND matrix ");
        row2 = sc.nextInt();
        col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            System.exit(0);
        }
        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        int[][] mat3 = new int[row1][col2];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        matrixMultiplication[][] threads = new matrixMultiplication[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                threads[i][j] = new matrixMultiplication(mat1, mat2, mat3, i, j);
                threads[i][j].start();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                threads[i][j].join();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
