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
        int ansmatrix[][] = new int[r1][c1];              // reversed result store karne ke liye naya matrix

        for(int j = 0; j < c1; j++) {                     // ek-ek column ko fix karne ke liye loop
            int start = 0;                                // sabse upar wali row ka index
            int end = r1 - 1;                             // sabse neeche wali row ka index

            while (start <= end) {                        // extra matrix me middle row ko bhi copy karna hota hai
                int temp = matrix[start][j];              // upar wali row ka element temporary store
                ansmatrix[start][j] = matrix[end][j];     // neeche wali row ka element upar copy
                ansmatrix[end][j] = temp;                 // temporary value ko neeche copy
                start++;                                  // next neeche wali row par move
                end--;                                    // next upar wali row par move
            }
        }
        printmatrix(ansmatrix);                           // rows reverse hone ke baad matrix print
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




/*
start <= end
Yahan hum new matrix (ansmatrix) me values copy kar rahe hote hain
 Jab start == end hota hai → middle element hota hai
Middle element ko bhi new matrix me copy karna zaruri hota hai
Isliye condition start <= end use hoti hai
*/
