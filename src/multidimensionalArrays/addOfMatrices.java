package multidimensionalArrays;
import java.util.Scanner;
public class addOfMatrices {

    static void printmatrix(int[][] matrix) {                // matrix print karne ka method
        for (int i = 0; i < matrix.length; i++) {            // rows ke liye loop
            for (int j = 0; j < matrix[i].length; j++) {     // columns ke liye loop
                System.out.print(matrix[i][j] + " ");        // element print
            }
            System.out.println();                            // next row ke liye line break
        }
    }

    static void addtion (int arr1[][], int r1, int c1 , int arr2[][], int r2, int c2){
        if(r1 == r2 && c1 == c2){                            // check: dono matrix ka size same hai
            int sum[][] = new int [r1][c1];                  // result matrix banayi
            for(int i = 0; i < r1; i++){                     // rows loop
                for(int j = 0; j < c1; j++){                 // columns loop
                    sum[i][j] = arr1[i][j] + arr2[i][j];     // element-wise addition
                }
            }
            printmatrix(sum);                                // final matrix print
        }
        else{
            System.out.println("invalid input - addition not possible "); // size mismatch
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of rows and columns of matrix 1");
        System.out.println("enter the no. of rows");
        int r1 = sc.nextInt();                               // matrix 1 rows
        System.out.println("enter the no. of columns");
        int c1 = sc.nextInt();                               // matrix 1 columns

        int arr1[][]=new int[r1][c1];                        // matrix 1 creation
        System.out.println("enter elements ");
        for(int i = 0; i < r1; i++){                         // rows loop
            for(int j = 0; j < c1; j++){                     // columns loop
                arr1[i][j]=sc.nextInt();                     // element input
            }
        }

        System.out.println("enter the value of rows and columns of matrix 2");
        System.out.println("enter the no. of rows");
        int r2 = sc.nextInt();                               // matrix 2 rows
        System.out.println("enter the no. of columns");
        int c2 = sc.nextInt();                               // matrix 2 columns

        int arr2[][]=new int[r2][c2];                        // matrix 2 creation
        System.out.println("enter elements ");
        for(int i = 0; i < r2; i++){                         // rows loop
            for(int j = 0; j < c2; j++){                     // columns loop
                arr2[i][j]=sc.nextInt();                     // element input
            }
        }

        System.out.println("matrix 1");
        printmatrix(arr1);                                   // print matrix 1

        System.out.println("matrix 2");
        printmatrix(arr2);                                   // print matrix 2

        System.out.println("final addition matrix ");
        addtion(arr1,r1,c1,arr2,r2,c2);
    }
}
