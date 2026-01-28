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
        int start = 0;                                  // sabse upar wali row ka index
        int end = matrix.length - 1;                    // sabse neeche wali row ka index

        while(start < end ) {                           // same matrix me middle row ko swap karne ki zarurat nahi hoti
            int[] temp = matrix[start];                 // upar wali poori row ko temporary store
            matrix[start] = matrix[end];                // neeche wali row ko upar le aana
            matrix[end] = temp;                         // temporary stored row ko neeche rakhna
            start++;                                    // next neeche wali row par move
            end--;                                      // next upar wali row par move
        }
        printmatrix(matrix);                            // rows reverse hone ke baad matrix print
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




/*
start < end
Same matrix me hum direct swap kar rahe hote hain
Jab start == end hota hai → middle element hota hai
Middle element ko khud se swap karne ki zarurat nahi hoti
Isliye condition start < end rakhi jaati hai
*/
