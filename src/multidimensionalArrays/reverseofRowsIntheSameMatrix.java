package multidimensionalArrays;
import java.util.Scanner;
public class reverseofRowsIntheSameMatrix {
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swappingofMatrix(int[][] matrix){
        int start = 0;
        int end = matrix.length - 1;

        while(start < end ) {                   // swap rows till middle
            int[] temp = matrix[start];         // store top row
            matrix[start] = matrix[end];        // move bottom row to top
            matrix[end] = temp;                 // place stored row at bottom
            start++;                            // move start down
            end--;                              // move end up
        }
            printmatrix(matrix);                // print reversed rows matrix
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the number of rows and columns ");
        System.out.println("enter the no. of rows ");
        int rows=sc.nextInt();
        System.out.println("enter the no. of columns ");
        int columns=sc.nextInt();

        int matrix [][]=new int [rows][columns];

        System.out.println("enter the elements ");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("original matrix");
        printmatrix(matrix);
        System.out.println("swapping each rows of matrix");
        swappingofMatrix(matrix);
    }
}
