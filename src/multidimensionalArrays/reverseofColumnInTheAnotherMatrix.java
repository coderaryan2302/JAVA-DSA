package multidimensionalArrays;
import java.util.Scanner;
public class reverseofColumnInTheAnotherMatrix {

    static void printmatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swappingofMatrix(int[][] matrix, int r1, int c1){
        int ansmatrix[][] = new int[r1][c1];          // create extra matrix to store reversed columns

        for(int i = 0; i < r1; i++){                  // loop to fix one row at a time
            int start = 0;                            // leftmost column index of current row
            int end = c1 - 1;                         // rightmost column index of current row

            while(start <= end){                      // copy elements including middle column
                int temp = matrix[i][start];          // store left column element temporarily
                ansmatrix[i][start] = matrix[i][end]; // copy right column element to left position
                ansmatrix[i][end] = temp;             // place stored element to right position
                start++;                              // move to next left column
                end--;                                // move to next right column
            }
        }
        printmatrix(ansmatrix);                       // print final reversed matrix
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        System.out.println("enter no of rows");
        int r1 = sc.nextInt();
        System.out.println("enter no of columns");
        int c1 = sc.nextInt();

        int matrix[][] = new int[r1][c1];

        System.out.println("enter elements");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("original matrix");
        printmatrix(matrix);

        System.out.println("swapping each column of matrix");
        swappingofMatrix(matrix, r1, c1);
    }
}



/*
start <= end
Yahan hum new matrix (ansmatrix) me values copy kar rahe hote hain
 Jab start == end hota hai → middle element hota hai
Middle element ko bhi new matrix me copy karna zaruri hota hai
Isliye condition start <= end use hoti hai
*/