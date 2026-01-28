package multidimensionalArrays;
import java.util.Scanner;
public class sumAndProductOfElementsInRowAndColumnWise {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // row wise sum
    static void sumOfElementsInRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("sum of elements of rows " + i + " = " + " " + sum );
        }
    }

    // row wise product
    static void productOfElementsInRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int product = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                product = product * matrix[i][j];
            }
            System.out.println("product of elements of rows " + i + " = " + " " + product );
        }
    }

    // column wise sum
    static void sumOfElementsInColumnWise(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum = sum + matrix[j][i];
            }
            System.out.println("sum of elements of columns " + i + " = " + " " + sum);
        }
    }

    // column wise product
    static void productOfElementsInColumnWise(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int product = 1;
            for (int j = 0; j < matrix.length; j++) {
                product = product * matrix[j][i];
            }
            System.out.println("product of elements of columns " + i + " = " + " " + product);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        System.out.println("enter no of rows");
        int rows=sc.nextInt();
        System.out.println("enter no of columns");
        int columns=sc.nextInt();

        int matrix[][]= new int [rows][columns];

        System.out.println("enter elements ");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

       sumOfElementsInRowWise(matrix);
       productOfElementsInRowWise(matrix);
       sumOfElementsInColumnWise(matrix);
       productOfElementsInColumnWise(matrix);
    }
}

// matrix[0].length   ye column ke liye hote h no. of column...
// matrix.length      ye rows ke liye hote h no. of rows...