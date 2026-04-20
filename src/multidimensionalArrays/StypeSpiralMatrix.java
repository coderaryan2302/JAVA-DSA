package multidimensionalArrays;
import java.util.Scanner;
public class StypeSpiralMatrix {

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void StypespiralMatrix(int matrix[][], int r, int c) {
        int toprow = 0;
        int bottomrow = r - 1;
        int leftcolumn = 0;
        int rightcolumn = c - 1;
        int totalelements = 0;

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {                                   // even wle rows mai reverse ho ke chalega
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {                                           // odd wle rows mai front se chalega
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows ");
        int rows = sc.nextInt();
        System.out.println("enter columns ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.println("enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("print orginal matrix");
        printMatrix(matrix);

        System.out.println("print spiral matrix");
        StypespiralMatrix(matrix, rows, columns);

    }
}
