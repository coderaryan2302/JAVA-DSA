package multidimensionalArrays;
import java.util.Scanner;
public class multiplicationOfMatrices {

    static void printmatrix(int[][] matrix) {                    // method to print any 2D matrix
        for (int i = 0; i < matrix.length; i++) {                // loop through matrix rows
            for (int j = 0; j < matrix[i].length; j++) {         // loop through matrix columns
                System.out.print(matrix[i][j] + " " );           // print current element
            }
            System.out.println();                                // move cursor to next row
        }
    }

    static void multiplication(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2) {
        if (c1 == r2) {                                          // check valid condition for multiplication
            int ansmultiplicationmatrix[][] = new int[r1][c2];            // create result matrix of size r1 x c2
            for (int i = 0; i < r1; i++) {                       // iterate rows of first matrix
                for (int j = 0; j < c2; j++) {                   // iterate columns of second matrix
                    for (int k = 0; k < c1; k++) {               // iterate common dimension
                        ansmultiplicationmatrix[i][j] = ansmultiplicationmatrix[i][j] + (arr1[i][k] * arr2[k][j]);     // multiply and add values to result matrix
                    }
                }
            }
            printmatrix(ansmultiplicationmatrix);                                                             // display final multiplication matrix
        }
        else {
            System.out.println("invalid input - multiplication not possible");                       // sizes not compatible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of rows and columns of matrix 1");
        System.out.println("enter the no. of rows");
        int r1 = sc.nextInt();
        System.out.println("enter the no. of columns");
        int c1 = sc.nextInt();

        int arr1[][] = new int[r1][c1];                          // declare and create matrix 1

        System.out.println("enter elements ");
        for (int i = 0; i < r1; i++) {                           // loop for matrix 1 rows
            for (int j = 0; j < c1; j++) {                       // loop for matrix 1 columns
                arr1[i][j] = sc.nextInt();                       // store input value in matrix 1
            }
        }

        System.out.println("enter the value of rows and columns of matrix 2");
        System.out.println("enter the no. of rows");
        int r2 = sc.nextInt();
        System.out.println("enter the no. of columns");
        int c2 = sc.nextInt();

        int arr2[][] = new int[r2][c2];                          // declare and create matrix 2

        System.out.println("enter elements ");
        for (int i = 0; i < r2; i++) {                           // loop for matrix 2 rows
            for (int j = 0; j < c2; j++) {                       // loop for matrix 2 columns
                arr2[i][j] = sc.nextInt();                       // store input value in matrix 2
            }
        }

        System.out.println("matrix 1");
        printmatrix(arr1);                                       // print first matrix

        System.out.println("matrix 2");
        printmatrix(arr2);                                       // print second matrix

        System.out.println("final multiplication matrix");
        multiplication(arr1, r1, c1, arr2, r2, c2);
    }
}
