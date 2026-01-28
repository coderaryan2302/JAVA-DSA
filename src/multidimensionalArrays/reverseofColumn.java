package multidimensionalArrays;
import java.util.Scanner;
public class reverseofColumn {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swappingofMatrix(int[][] matrix ){
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[i].length-1;

            while(start<end){
                int temp = matrix[i][start];           // store left element
                matrix[i][start] = matrix[i][end];     // swap with right
                matrix[i][end] = temp;                 // put temp value
                start++;                               // move forward
                end--;                                 // move backward
            }
        }
        printmatrix(matrix);                           // print reversed column matrix
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        System.out.println("enter no of rows");
        int rows = sc.nextInt();
        System.out.println("enter no of columns");
        int columns = sc.nextInt();

        int matrix [][]  = new int[rows][columns];

        System.out.println("enter elements");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("original matrix");
        printmatrix(matrix);
        System.out.println("swaping each column of matrix");
        swappingofMatrix(matrix);
    }
}
