package multidimensionalArrays;
import java.util.Scanner;
public class transposeMatrixBySwapping {
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int matrix[][], int r, int c) {
        if (r != c) {
            System.out.println("cannot transpose matrix in not square matrix");
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = i; j < c; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            printMatrix(matrix);
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter rows");
            int r = sc.nextInt();
            System.out.print("Enter columns");
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            System.out.println("Enter matrix elements");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Orginal matrix ");
            printMatrix(matrix);

            System.out.println("Transpose matrix");
            transposeMatrix(matrix, r, c);
        }
    }
