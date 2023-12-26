package moodle_programs;

import java.util.Scanner;
class spiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows; i++) {
            String[] in = sc.nextLine().split(" ");
            for(int j=0;j<cols;j++) {
                matrix[i][j] = Integer.parseInt(in[j]);
            }
        }

        System.out.print("Spiral Order: [");

        for(int j=0;j<cols;j++) {
            System.out.print(matrix[0][j]+", ");
        }

        for(int j=1;j<rows;j++) {
            System.out.print(matrix[j][cols-1]+", ");
        }

        if (rows !=2 ) {

            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + ", ");
            }

            for (int j = rows - 2; j > 1; j--) {
                System.out.print(matrix[j][0] + ", ");
            }

                System.out.print(+matrix[1][0] + "]");

        }
        else {

            for (int j = cols - 2; j >= 1; j--) {
                System.out.print(matrix[rows - 1][j] + ", ");
            }
            System.out.print(matrix[1][0]+"]");
        }


    }
}