package multidimensionalArrays;
import java.util.Scanner;
public class reverseofColumnInTheSameMatrix {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swappingofMatrix(int[][] matrix ){
        for(int i = 0; i < matrix.length; i++){              // fix one row at a time for reversal
            int start = 0;                                   // leftmost column index of current row
            int end = matrix[i].length - 1;                  // rightmost column index of current row

            while(start < end){                              // same matrix: middle element ko swap karna nahi hota
                int temp = matrix[i][start];                 // left column element ko temporary variable me store
                matrix[i][start] = matrix[i][end];           // right column element ko left side me assign
                matrix[i][end] = temp;                       // temporary stored value ko right side me assign
                start++;                                     // next left column ki taraf move
                end--;                                       // next right column ki taraf move
            }
        }
        printmatrix(matrix);                                 // final matrix print after in-place reversal
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


/*
start < end
Same matrix me hum direct swap kar rahe hote hain
Jab start == end hota hai → middle element hota hai
Middle element ko khud se swap karne ki zarurat nahi hoti
Isliye condition start < end rakhi jaati hai
*/
