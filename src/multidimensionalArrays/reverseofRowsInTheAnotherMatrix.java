package multidimensionalArrays;
import java.util.Scanner;
public class reverseofRowsInTheAnotherMatrix {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swappingofMatrix(int[][] matrix , int r1, int c1) {
        int ansmatrix[][] = new int[r1][c1];             // extra matrix
        for(int j = 0; j < c1; j++) {                    // column loop
            int start = 0;
            int end = r1 - 1;

            while (start <= end) {
                int temp = matrix[start][j];             // basic swap style
                ansmatrix[start][j] = matrix[end][j];
                ansmatrix[end][j] = temp;
                start++;
                end--;
            }
        }
        printmatrix(ansmatrix);                           // print reversed column matrix
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        System.out.println("enter no of r1");
        int r1 = sc.nextInt();
        System.out.println("enter no of columns");
        int c1 = sc.nextInt();

        int matrix [][]  = new int[r1][c1];

        System.out.println("enter elements");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("original matrix");
        printmatrix(matrix);
        System.out.println("swaping each column of matrix");
        swappingofMatrix(matrix,r1,c1);
    }
}

